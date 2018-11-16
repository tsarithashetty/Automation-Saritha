package pages

import geb.Page
import modules.loginModule

class lognTestPage extends Page {

    static at = { title == "#1 Free CRM software in the cloud for sales and service" }
    //static url = "http://www.freecrm.com"

    static content = {
                lgn {module(loginModule)}
    }
         void loginMethod(String uname, String pwd) {

            lgn.Username.value(uname)
            lgn.Password.value(pwd)
            lgn.Loginbtn.click()
        }
    }


