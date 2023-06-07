/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab03excepciones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Personal
 */
public class Lab03Excepciones {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        String nombre = br.readLine();
        int div = 8/0;
        System.out.println(div);
        }catch (IOException e){
            e.printStackTrace();
        }catch (ArithmeticException es){
            System.out.println("No se puede dividir para cero");
                }   
        
        }
        
    }
    

