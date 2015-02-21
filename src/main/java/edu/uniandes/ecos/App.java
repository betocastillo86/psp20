package edu.uniandes.ecos;

import edu.uniandes.ecos.psp.MetodoPROBE;
import edu.uniandes.ecos.vistas.ConsolaView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MetodoPROBE probe = new MetodoPROBE();
        
        ConsolaView vista = new ConsolaView();
        
        //Muestra los valores de las 3 pruebas de Psp
        vista.MostrarP(1.1, 9d, probe.CalcularIntegracionNumerica(1.1, 9d));
        vista.MostrarP(1.1812, 10d, probe.CalcularIntegracionNumerica(1.1812, 10d));
        vista.MostrarP(2.75, 30d, probe.CalcularIntegracionNumerica(2.75, 30d));
    }
}
