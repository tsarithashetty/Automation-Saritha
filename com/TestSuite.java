package com;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.Parameterization.*;
import com.Timeout.*;
import com.junit.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        PrintMessage_JunitTest.class,
        PrimeNumber_JTest.class,
        Employee_Test_Junit.class
})

public class TestSuite {
}