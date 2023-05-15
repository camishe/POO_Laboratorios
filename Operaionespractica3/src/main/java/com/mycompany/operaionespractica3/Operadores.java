/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaionespractica3;
import javax.swing.JOptionPane;
/**
 *
 * @author ESPE
 */
public class Operadores {
    int nu1;
    int nu2;
    int suma; int resta; int multiplicacion; int division;
    
    //generamos métodos 
    //pedimos numeros 
    //nuestro metodo es publico
    
    
    public void operadores(){
        //
        nu1 = Integer.parseInt(JOptioPane.showImputDialog("Ingrese el primer numero"));
        nu2 = Integer.parseInt(JOptioPane.showImputDialog("Ingrese el segundo numero"));
    
}
    //creamos metodos para sumarnuestros tipo public, sin retornar nada void no tiene retorno 
         public void sumar(){
        suma = nu1+nu2;
    }
    
    //creamos un metodo para mostrar resultados
        public void reultados(){
        
        System.out.println("El resultado de la suma es: " +suma);
    }
    
    
}
