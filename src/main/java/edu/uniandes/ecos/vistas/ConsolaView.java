/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.vistas;

import edu.uniandes.ecos.modelos.RangoTamano;
import edu.uniandes.ecos.modelos.ResumenArchivo;
import edu.uniandes.ecos.modelos.ResumenPrograma;
import edu.uniandes.ecos.psp.MetodoPROBE;
import java.util.LinkedList;

/**
 *
 * @author VirtualW7
 */
public class ConsolaView {
    
    /****
     * Muestra el resultaod del ejercicio PSP 20
     * @param x
     * @param dof
     * @param reglaSimpson 
     */
    public void MostrarP(Double x, Double dof, Double reglaSimpson)
    {
        //Muestra el nombre del programa
        System.out.println("Prueba"); 
        System.out.println("--->X:" + x);
        System.out.println("--->DOF:" + dof);
        System.out.println("--->Resultado (p):" + reglaSimpson);
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
    }
    
}
