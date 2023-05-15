/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos_retorno_de_valores;

/**
 *
 * @author ESPE
 */
public class Retorno {
    public void sumar(int nu1,int nu2){
        int suma = nu1+nu2;
        return suma;
    }
    
    public void resultados(int suma){
        System.out.println("El resultado de la suma es: " +suma );
    }
}
