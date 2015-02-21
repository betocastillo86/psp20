/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.vistas;

import edu.uniandes.ecos.modelos.RangoTamano;
import edu.uniandes.ecos.modelos.ResumenArchivo;
import edu.uniandes.ecos.modelos.ResumenPrograma;


/**
 *
 * @author VirtualW7
 */
public class WebView {
    
    public String MostrarP(Double x, Double dof, Double reglaSimpson)
    {
        //Muestra el nombre del programa
        String html = "<h1>Prueba</h1>";
        html += "<br>--->X:" + x;
        html += "<br>--->DOF:" + dof;
        html += "<br>--->Resultado (p):" + reglaSimpson;
        html += "<br>------------------------------------------------";
        html += "<br>------------------------------------------------";
        return html;
    }
}
