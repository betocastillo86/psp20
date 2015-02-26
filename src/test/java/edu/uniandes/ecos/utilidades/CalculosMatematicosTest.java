/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.utilidades;

import junit.framework.TestCase;

/**
 *
 * @author Administrator
 */
public class CalculosMatematicosTest extends TestCase {
    
    public CalculosMatematicosTest(String testName) {
        super(testName);
    }
    
    
    /**
     * Test of Factorial method, of class CalculosMatematicos.
     */
    public void testFactorial() {
        System.out.println("Factorial");
        Double valor = 5d;
        Double expResult = 120d;
        Double result = CalculosMatematicos.Factorial(valor);
        assertEquals(expResult, result);
    }
    
}
