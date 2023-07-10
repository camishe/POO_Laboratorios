
package practica16polimorfismo;

/**
 *
 * @author Personal
 */
public class Practica16Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamada al metodo mostrar
       
        mostrardatosfiguras(new triangulo(4, 5, "amarillo"));
        mostrardatosfiguras(new Circulo( " verde ",5));
        mostrardatosfiguras(new Cuadrado(9, " negro "));
        
    }
    
    private static void mostrardatosfiguras(Figura f){
    
        //Aplicacion del polimorfismo (ventaja: reutilizacion de codigo al forzar a todas las clases
        //a tener el mismometodo.)
        //Esta expresion vale para cualquier subclase de figura
        //cuyos objetos vengan aqui como parametro;
        System.out.println("Color: "+ f.getColor());
        System.out.println("Superficie: "+f.superficie());
    }
}
