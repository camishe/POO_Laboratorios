
package u02prac14interfaces;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class U02Prac14Interfaces {
    public static void main(String[] args) {
        
        int opc;
        Scanner tcl = new Scanner(System.in);
        
        Circulo circulo = new Circulo(0);
        Cuadrado cuadrado = new Cuadrado(0);
        
        System.out.println("Calculo de Area de figuras");
        System.out.println("1. circulo");
        System.out.println("2. Cuadrado");
        opc = tcl.nextInt();
        switch(opc){
            case 1: 
                System.out.println("Area Circulo");
                System.out.println("ingrese radio");
                circulo.r = tcl.nextInt();
                System.out.println("Resultado: "+circulo.calcularArea());
                circulo.Dibujar();
                break;
                                
            case 2:
                System.out.println("Area Cuadrado");
                System.out.println("ingrese el lado");
                cuadrado.lado = tcl.nextDouble();
                System.out.println("Resultado: "+cuadrado.calcularArea());
                cuadrado.calcularArea();
                break;                
                
        }
    }
}
