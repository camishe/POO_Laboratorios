/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion_unidad01;
    import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Evaluacion_Unidad01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
        
       boolean salir = false;
       //Se almacenará la opcion escogida por el usuario
       int opcion; 
         
       while(!salir){
           System.out.println("1. Productos");
           System.out.println("2. Provedores");
           System.out.println("3. Nuevo pedido");
           System.out.println("4. Pedido mayor");
           System.out.println("5. Total facturado");
           System.out.println("6. Salir");
            
           System.out.println("Digite una opcion");
           
           opcion = sn.nextInt();
           
           switch(opcion){
               case 1:
                   
                   break;
               case 2:
                   System.out.println("");
                   break;
                case 3:
                   System.out.println("");
                   break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                   salir=true;
                   break;
           }
       }
       
    }
}
    

