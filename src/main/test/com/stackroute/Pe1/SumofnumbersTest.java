package com.stackroute.Pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumofnumbersTest {
    Sumofnumbers p5;
    int sumofnumbers;

    @Before
    public void setUp() throws Exception {
        p5=new Sumofnumbers();
    }

    @After
    public void tearDown() throws Exception {
        p5=null;
    }
    @Test
     public void addition1() throws Exception{
        // Act
        sumofnumbers=p5.addition(6);
        // AssertEquals
        assertEquals(6,sumofnumbers);
    }


}
