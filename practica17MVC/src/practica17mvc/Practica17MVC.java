
package practica17mvc;

import Control.Control;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author Personal
 */
public class Practica17MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Modelo mod = new Modelo();
        Vista vis = new Vista();
        Control cont = new Control(vis, mod);
        
        cont.Iniciar();
        vis.setVisible(true);
        }    
}

