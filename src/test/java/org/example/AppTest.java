package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.example.App.returnFizzBuzz;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */



    public void testApp()
    {assertTrue( true );}

    public void testFizzBuzz(){
        assertEquals("1",returnFizzBuzz(1));
        assertEquals("Fizz",returnFizzBuzz(3));
        assertEquals("4",returnFizzBuzz(4));
        assertEquals("Buzz",returnFizzBuzz(5));
        assertEquals("Fizz",returnFizzBuzz(6));
        assertEquals("7",returnFizzBuzz(7));
        assertEquals("8",returnFizzBuzz(8));
        assertEquals("Fizz",returnFizzBuzz(9));
        assertEquals("Buzz",returnFizzBuzz(10));
    }
}
