/**
 *
 * @author Personal
 */
public class productosEstandars extends Productos{
    //Atributos
    int seccion;
    
    //Constructor

    public productosEstandars(int seccion, String nomproducto, int precio) {
        super(nomproducto, precio);
        this.seccion = seccion;
    }
    
    //Metodos
    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
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
   
    public static double obtenerPrecioPedido(int unidades, double precio){
        if (unidades >= 5){
            return unidades * precio * 0.80;
        }else{
            return unidades * precio;
        }
    }
}
