/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp;

import edu.uniandes.ecos.modelos.RangoTamano;
import edu.uniandes.ecos.modelos.ResumenPrograma;
import java.util.LinkedList;
import junit.framework.TestCase;

/**
 *
 * @author Administrator
 */
public class MetodoPROBETest extends TestCase {
    
    public MetodoPROBETest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    

    /**
     * Test of CalcularIntegracionNumerica method, of class MetodoPROBE.
     */
    public void testCalcularIntegracionNumerica() {
        System.out.println("CalcularIntegracionNumerica");
        Double x = 1.1;
        Double dof = 9d;
        MetodoPROBE instance = new MetodoPROBE();
        Double expResult = 0.3500589042865573;
        Double result = instance.CalcularIntegracionNumerica(x, dof);
        assertEquals(expResult, result);
    }
    
}
