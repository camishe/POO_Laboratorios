/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica16polimorfismo;

/**
 *
 * @author Personal
 */
public class Circulo  extends Figura{
    
    private int radio;
    
    public Circulo(String color, int radio) {
        super(color);
        this.radio();
        
    }

    @Override
    public double superficie() {
        return Math.PI*radio*radio;
    }

    private void radio() {
    }
    
}
