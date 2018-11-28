package com.Parameterization;

//import junit.framework.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrimeNumber_JTest {

    private int num;
    private boolean expected;
    private PrimNumber p;

    @Before
    public void setup(){
        p = new PrimNumber();
    }
    public PrimeNumber_JTest(int num, boolean expected){
        this.num = num;
        this.expected = expected;
    }
@Parameterized.Parameters
    public static Collection primeNumbers(){
       return Arrays.asList(new Object[][] {{2,false}, {3,true}, {40,false}, {15,false}});
}
    @Test
    public void isPrimenumber_Test(){
       boolean actual =  p.isPrimenumber(num);
        assertEquals(expected, actual);
    }



}
