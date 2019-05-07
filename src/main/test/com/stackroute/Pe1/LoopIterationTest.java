package com.stackroute.Pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopIterationTest {
    //Arrange
    LoopIteration loopiteration;
    String Check;
    @Before
    public void setUp() throws Exception {
        loopiteration = new LoopIteration();

    }

    @After
    public void tearDown() throws Exception {
        loopiteration=null;
    }
    @Test
    public void LoopIteration1() throws Exception {
        // Act
        Check = loopiteration.findIteration(0);
        // Asserts
        assertEquals("iteration not done", Check);
    }
    @Test
    public void LoopIteration2() throws Exception
    {
        // Act
        Check = loopiteration.findIteration(2);
        // Asserts
        assertEquals("iteration done",Check);
    }
}