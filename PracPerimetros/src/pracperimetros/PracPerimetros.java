package pracperimetros;

/**
 *
 * @author Personal
 */
public class PracPerimetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ingreso del valor de los lados del cuadrado
        double lado = 5.0; 
        Cuadrado cuadrado = new Cuadrado(lado);
        double perimetro = cuadrado.getPerimetro();
        System.out.println("El perimetro del cuadrado es: " + perimetro);
        
        //Rectangulo
        double base = 5.0; 
        double altura = 3.0; 
        Rectangulo rectangulo = new Rectangulo(base, altura);
        double perim = rectangulo.getPerimetro();
        System.out.println("El perimetro del rectangulo es: " + perim);
        
        //Perímetro del Triangulo
        double lado1 = 3.0; 
        double lado2 = 4.0; 
        double lado3 = 5.0; 
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        double per = triangulo.getPerimetro();
        System.out.println("El perimetro del triangulo es: " + per);
        
        //Pentagono
        double ladopen = 4.0; 
        Pentagono pentagono = new Pentagono(lado);
        double perimet = pentagono.getPerimetro();
        System.out.println("El perimetro del pentagono es: " + perimet);
    }
    
}
