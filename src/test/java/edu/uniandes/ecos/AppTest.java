package edu.uniandes.ecos;

import edu.uniandes.ecos.psp.MetodoPROBE;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    {
        assertTrue( true );
    }
    
    
    public void exitosoCalcularIntegracionNumerica()
    {
        MetodoPROBE probe = new MetodoPROBE();
        assertEquals(0.3500589042865573, probe.CalcularIntegracionNumerica(1.1, 9d)); 
    }
    
    public void fallidoCalcularIntegracionNumerica()
    {
        MetodoPROBE probe = new MetodoPROBE();
        assertNotSame(0.3500589042865573, probe.CalcularIntegracionNumerica(1.1, 9d)); 
    }
    
    
}
