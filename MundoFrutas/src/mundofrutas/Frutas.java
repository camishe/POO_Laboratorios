/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundofrutas;

/**
 *
 * @author Personal
 */
public class Frutas {
    
    private String nombre;
    private String color;
    
    public Frutas(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getColor() {
        return color;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
    }
}
