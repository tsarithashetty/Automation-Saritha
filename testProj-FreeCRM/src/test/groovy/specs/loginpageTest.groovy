
package specs
import geb.spock.GebSpec

class loginpageTest extends GebSpec{

    def "Verify login page"(){
        given: "the username, pwd"
        go 'https://www.freecrm.com'

        when: 'login'
        $("input[name='username']").value("tsaritha")
        $("input[name='password']").value("crm123")
        $("input[class='btn btn-small']").click()

        then: 'authentication should be done'

        assert title == 'CRMPRO'
    }
}

