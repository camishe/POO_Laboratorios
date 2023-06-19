/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07_herencia;

/**
 *
 * @author Personal
 */
class Motocicleta extends Vehiculo{
     boolean patada;
    
     @Override
     public void encendido(){
        encendido = true;
        estado = "Moto encendido";
    
}
 
     @Override
 public void apagado(){
        encendido = false;
        estado = "Moto apagado";
 }
}
