package specs

//import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import pages.loginPage

class loginTestSpec extends GebSpec {

   private void verifyLogin(){
        loginPage.loginMethod("tsaritha", "crm123")
    }
def "Can access CRM Application through valid user details"(){
    given: "url"

    to loginPage
    print title

    when:
    verifyLogin()

    then:
    at == {title.startsWith("CRMPRO")}
}
}
