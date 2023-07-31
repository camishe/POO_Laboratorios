/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u02prac13claseabstracta;

/**
 *
 * @author Personal
 */
public class Circulo extends Figura{
    
    double r;
    

    public Circulo(double r, double x, double y) {
        super(x,y);
        this.r = r;
    }
    @Override
    public double calcularArea(){
        double pi = 3.1416;
        double resul = pi*r*r;
        System.out.println("El area del circulo es: "+resul);
        return resul;
    }
}
