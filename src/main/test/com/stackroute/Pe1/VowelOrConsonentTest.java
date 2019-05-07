package com.stackroute.Pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonentTest {
    //Arrange

    VowelOrConsonent p3;
    String strCheck;

    @Before
    public void setUp() throws Exception {
        p3=new VowelOrConsonent();
    }
    @After
    public void tearDown() throws Exception {
        p3=null;
    }
    @Test
    public void isVowel1()
    {
        // Act
        strCheck = p3.isVowel("a");
        // Assert
        assertEquals(" given input is a vowel:",strCheck);
    }
    @Test
    public void isConsonent()
    {
        // Act
        strCheck = p3.isVowel("b");
        // Assert
        assertEquals("given input is a consonent:",strCheck);
    }
}