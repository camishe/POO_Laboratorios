/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05_buffereread;
import java.io.*;

public class Lab05_BuffereRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Personal\\OneDrive\\Documentos\\Lab05_BufferedRead.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Personal\\OneDrive\\Documentos\\Lab05_BufferedRead.txt"));){
            
        
                bw.write("Esto es una prueba usando Buffered");
                bw.newLine();
                bw.write("Seguimos usando Buffered");
                bw.newLine();
                bw.write("Hola a todos");
                bw.newLine();
                bw.write("Seguimos practicando");
                bw.newLine();
                //guardamos los cambios del fichero
                bw.flush();
                //Leemos el fichero y lo mostramos por pantalla
                String linea = br.readLine();
                while(linea !=null){
                    System.out.println(linea);
                    linea = br.readLine();
                }
        }catch (IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
    
}