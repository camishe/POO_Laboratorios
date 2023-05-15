/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.metodos_retorno_de_valores;
import javax.swing.JOptionPane;
/**
 *
 * @author ESPE
 */
public class Metodos_retorno_de_valores {

    public static void main(String[] args) {
        Retorno rt1 = new Retorno ();
        int nu1 = Integer.parseInt(JOptionPane.showInputDialog("Deme un numero:"));
        int nu2 = Integer.parseInt(JOptionPane.showInputDialog("Deme un numero:"));
        
        int suma =rt1.sumar(nu1, nu2);
        
        rtl.resultados(suma);
    }
    
    }
}
