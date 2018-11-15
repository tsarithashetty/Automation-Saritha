import geb.Browser

Browser.drive {
    go "http://www.freecrm.com"

    print title
}