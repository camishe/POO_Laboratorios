
package mundofrutas;
/**
 *
 * @author Personal
 */
public class MundoFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frutas frutasacida = new Frutas("Frutos Acidos", "Variados");
        Frutas frutasdulces = new Frutas("Frutas Dulces", "Variados");
        Frutas frutossecos = new Frutas("Frutos Secos", "Variados");        
        frutasacida.mostrarInfo();
        frutasdulces.mostrarInfo();
        frutossecos.mostrarInfo();
                
        System.out.println("Frutas Acidas \n");
        FrutasAcidas frutaacida1 = new FrutasAcidas("Piña", "Amarillo", "acida");
        FrutasAcidas frutaacida2 = new FrutasAcidas("Naranja", "Naranja", "acida");
        FrutasAcidas frutaacida3 = new FrutasAcidas("Kiwi", "Verde", "acida");
        frutaacida1.mostrarInfo();
        frutaacida2.mostrarInfo();
        frutaacida3.mostrarInfo();
        
        System.out.println("Frutas Dulces \n");
        FrutasDulces frutadulce1 = new FrutasDulces("Uva", "Rojo", "dulce");
        FrutasDulces frutadulce2 = new FrutasDulces("Sandia", "Rojo", "dulce");
        FrutasDulces frutadulce3 = new FrutasDulces("Mango", "Amarillo", "dulce");
        frutadulce1.mostrarInfo();
        frutadulce2.mostrarInfo();
        frutadulce3.mostrarInfo();
        
        System.out.println("Frutos Secos \n");
        FrutosSecos frutoseco1 = new FrutosSecos("Almendra", "Cafe", "Seco");
        FrutosSecos frutoseco2 = new FrutosSecos("Nueces", "Cafe", "Seco");
        FrutosSecos frutoseco3 = new FrutosSecos("Avellanas", "marron", "Seco");
        frutoseco1.mostrarInfo();
        frutoseco2.mostrarInfo();
        frutoseco3.mostrarInfo();
    }
}
   
