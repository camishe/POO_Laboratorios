/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion_unidad01;

/**
 *
 * @author Personal
 */
public class Datos_Factura {
    
    public String productos;
    public String provedores;
    public String nuevoPedido;
    public String pedidoMayor;
    public int totalFacturado;
    
    public Datos_Factura(String productos, String provedores, String nuevoPedido, String pedidoMayor, int totalFacturado) {

    this.productos = productos;
    this.provedores = provedores;
    this.nuevoPedido = nuevoPedido;
    this.pedidoMayor = pedidoMayor;
    this.totalFacturado = totalFacturado;
    }
    
    //aplicación de un metodo
    public void printInvoice() {
           
  System.out.println("Ingrese los productos: " +productos);
  System.out.println("Ingrese a los provedores: " +provedores);
  System.out.println("Ingrese el nuevo pedido: " +nuevoPedido);
  System.out.println("Ingrese el pedido mayor: " +pedidoMayor);
  System.out.println("El total facturado es de:  " +totalFacturado);
  

}
}
