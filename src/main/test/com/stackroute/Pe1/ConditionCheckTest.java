package com.stackroute.Pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionCheckTest { //Arrange

    ConditionCheck conditioncheck;
    String strCheck;


    @Before
    public void setUp() throws Exception {
        conditioncheck  = new ConditionCheck();

    }

    @After
    public void tearDown() throws Exception {
        conditioncheck = null;

    }
    @Test
    public void conditionalChecker1() throws Exception
    {
        // Act
        strCheck = conditioncheck.conditionalChecker(23);
        // Assert
        assertEquals("Tom",strCheck);
    }
    @Test
    public void conditionalChecker2() throws Exception
    {
        // Act
        strCheck = conditioncheck.conditionalChecker(22);
        // Assert
        assertEquals("Jerry",strCheck);
    }
    @Test
    public void conditionalChecker3() throws Exception
    {
        // Act
        strCheck = conditioncheck.conditionalChecker(33);
        // Assert
        assertEquals("neither Tom nor Jerry",strCheck);
    }

}

