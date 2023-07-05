/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u02prac14interfaces;

/**
 *
 * @author Personal
 */
public class Circulo implements Figura, Dibujar, Rotar{
    
    double r;

    public Circulo(double r) {
        this.r = r;
    }
   
    @Override
    public double calcularArea(){
        double pi = 3.1416;
        double resul = pi*r*r;
        return resul;
    }
    
    @Override
    public void rotar(){
        System.out.println("Usted va a rotar");
    }
    
    @Override
    public void Dibujar() {
        System.out.println("Está mal hecho el dibujo");
    }
}
