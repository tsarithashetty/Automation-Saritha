package pages

import geb.Page
import modules.loginModule

class loginPage extends Page {

        static at = {title = "#1 Free CRM software in the cloud for sales and service"}
        static url = "http://www.freecrm.com"

        static content = {
            lgnpage{modules(loginModule)}
        }
        static void loginMethod(String uname, String pwd){
            lgnpage.Username.value(uname)
            lgnpage.Password.value(pwd)
            lgnpage.Loginbtn.click()
        }
    }


