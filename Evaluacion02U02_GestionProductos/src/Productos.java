
public abstract class Productos {
    
    //Atributos
    String nomproducto;
    int precio;

    //Constructor
    public Productos(String nomproducto, int precio) {
        this.nomproducto = nomproducto;
        this.precio = precio;
    }
    
    //Metodos

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
        return unidades * precio;
   }
}
