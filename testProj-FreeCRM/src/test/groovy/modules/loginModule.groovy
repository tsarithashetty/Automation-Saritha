package modules

import geb.Module

class loginModule extends Module {

    static content = {
       Username{$("input[name='username']")}
        Password{$("input[name='password]")}
        Loginbtn{$("input[class='btn btn-small']")}
    }
}
