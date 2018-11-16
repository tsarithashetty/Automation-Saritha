package specs

import Utils.Base
import pages.lognTestPage

class loginTestSpec extends Base {

   private void verifyLogin(){
       lognTestPage.loginMethod("tsaritha", "crm123")
    }

def "Can access CRM Application through valid user details"(){
    given: "url"

    to lognTestPage
    print title

    when:
    verifyLogin()

    then:
    at == {title.startsWith("CRMPRO")}
    print "Successfull"
}
}
