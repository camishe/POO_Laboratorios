/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        
        cont.iniciar();
        vis.setVisible(true);
        }    
}

