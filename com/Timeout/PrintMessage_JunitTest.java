package com.Timeout;

import org.junit.Ignore;
import org.junit.Test;

public class PrintMessage_JunitTest {
    PrintMessage pm = new PrintMessage();
    //@Ignore
    //@Test(timeout = 1000)
    @Test(expected = ArithmeticException.class)
    public void printmessage_Test(){
        pm.print_message("Hello");
    }
}
