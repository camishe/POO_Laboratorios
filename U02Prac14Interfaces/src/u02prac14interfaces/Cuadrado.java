
package u02prac14interfaces;

/**
 *
 * @author Personal
 */
public class Cuadrado implements Figura, Dibujar{
    
    double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        double resul = lado * lado;
        return resul;
    }
    
    @Override
    public void Dibujar() {
        System.out.println("Está mal hecho el dibujo");
    }
}
