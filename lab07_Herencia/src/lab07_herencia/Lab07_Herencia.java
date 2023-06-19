/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab07_herencia;

/**
 *
 * @author Personal
 */
public class Lab07_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vehiculo vehi = new Vehiculo ();
       Automovil auto = new Automovil ();
       Motocicleta moto = new Motocicleta();
         
       vehi.apagado();
       auto.apagado();
       moto.apagado();
       
       Vehiculo vehi1 = new Vehiculo();
       Automovil auto1 = new Automovil ();
       Motocicleta moto1 = new Motocicleta();
       
       vehi1.encendido();
       auto1.encendido();
       moto1.encendido();
       
         System.out.println(vehi.estado);
         System.out.println(auto.estado);
         System.out.println(moto.estado);
         
         System.out.println(vehi1.estado);
         System.out.println(auto1.estado);
         System.out.println(moto1.estado);
    }
    
}
