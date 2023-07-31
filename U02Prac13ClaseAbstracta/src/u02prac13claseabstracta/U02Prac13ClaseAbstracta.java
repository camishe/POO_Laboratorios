
package u02prac13claseabstracta;

import java.util.Scanner;

public class U02Prac13ClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("CUADRADO");
        System.out.println("Ingrese el lado");
        double lado = sc.nextDouble(); 
        Cuadrado cd =new Cuadrado(lado,0,0);
        cd.calcularArea();
        
        sc.nextLine();
        
        System.out.println("CIRCULO");
        System.out.println("Ingrese el radio: ");
        double radio = sc.nextDouble(); 
        Circulo cr =new Circulo(radio,0,0);
        cr.calcularArea();
        
        
    }
    
}
