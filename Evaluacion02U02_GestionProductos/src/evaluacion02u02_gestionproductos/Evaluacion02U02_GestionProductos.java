
package evaluacion02u02_gestionproductos;

public class Evaluacion02U02_GestionProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double pedidoTotal = 0;

//Crear productos estandar (Objetos y se instancia)
productosEstandars productoestandar1 = new productosEstandars();
productoestandar1.productosEstandars("Producto estándar 2", 15, "Sección B");

//Crear productos ofertados (Objetos y se instancia)
productosOfertados productoofertado1 = new productosOfertados();
productosOfertados productoOfer1 = new ProductoOfertado("Producto ofertado 2", 25, 2);
productosOfertados = new ProductoOfertado("Producto ofertado 3", 30, 2);

//Calcular precio del pedido de productos estándar
pedidoTotal = productoestandar1.obtenerPrecioPedido(5);
pedidoTotal = productoestandar2.obtenerPrecioPedido(5);

//Calcular precio del pedido de productos ofertados
pedidoTotal1 = productoofertado1.obtenerPrecioPedido(5);
pedidoTotal2 = productoofertado2.obtenerPrecioPedido(5);
pedidoTotal3 = productoofertado3.obtenerPrecioPedido(5);

System.out.println("Total del pedido: $" + pedidoTotal);
    }
  
}
