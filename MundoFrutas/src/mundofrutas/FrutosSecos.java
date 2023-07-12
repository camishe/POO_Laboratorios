/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundofrutas;

/**
 *
 * @author Personal
 */
public class FrutosSecos extends Frutas{

    private String caracteristicaEspecial;
    
    public FrutosSecos(String nombre, String color, String caracteristicaEspecial) {
        super(nombre, color);
        this.caracteristicaEspecial = caracteristicaEspecial;
    }
    
    public String getCaracteristicaEspecial() {
        return caracteristicaEspecial;
    }
    
    public void mostrarInfoEspecial() {
        mostrarInfo(); // Llama al método mostrarInfo() de la clase base
        System.out.println("Característica especial: " + caracteristicaEspecial);
    }
}
