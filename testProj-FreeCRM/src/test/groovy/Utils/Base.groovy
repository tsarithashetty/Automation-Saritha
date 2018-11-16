package Utils

import geb.Page


class Base extends Page {
    /* Reads the properties file path
    * @return String - file path
    */
    public String getBuildPropertiesFilePath(){
        String rootDir = new File(".").getCanonicalPath()
        String bProperties = rootDir + "/src/test/resources/build.properties".replace('/',File.separator)
        return bProperties
    }
    /*
     * Reads the properties from properties file
     * @param filePath - Path of the properties file
     * @return properties
     */
    def readPropertiesFromFile(String filePath){
        File fileName = new File(filePath)
        InputStream inputStream = new FileInputStream(fileName)
        Properties props = new Properties()
        props.load(inputStream)
        inputStream.close()
        return props
    }
}
