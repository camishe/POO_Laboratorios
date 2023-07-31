/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u02prac13claseabstracta;

/**
 *
 * @author Personal
 */
public class Cuadrado extends Figura{
    double lado;
    
    public Cuadrado(double lado, double x, double y){
        super(x, y);
        this.lado = lado;
    }
    
    @Override
    public  double calcularArea(){
        double resul = lado * lado;
        System.out.println("El area del cuadrado es: "+resul);
        return resul;
    }
    
}
