package com.github;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//Pending comments

//Some comments on the master branch
//Added some comments on the branch for the egit demo

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    /**
     * Test that App prints "Hello World!" to stdout
     */
    @Test
    public void testAppPrintsHelloWorld()
    {
        App.main(new String[]{});
        assertEquals("Hello World!" + System.lineSeparator(), outContent.toString());
    }
    
    /**
     * Basic sanity test
     */
    @Test
    public void testBasicAssertion()
    {
        assertTrue(true);
    }
}
