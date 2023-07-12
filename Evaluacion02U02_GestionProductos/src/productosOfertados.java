/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
public class productosOfertados extends Productos{
    //Atributos
    int numdias;
    
    //Constructor

    public productosOfertados(int numdias, String nomproducto, int precio) {
        super(nomproducto, precio);
        this.numdias = numdias;
    }
    
    //Metodos

    public int getNumdias() {
        return numdias;
    }

    public void setNumdias(int numdias) {
        this.numdias = numdias;
    }

    public String getNomproducto() {
        return nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        this.nomproducto = nomproducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
   public static double obtenerPrecioPedido(int precio, int unidades){
        return unidades * precio * 1.12;
    }
    
}
