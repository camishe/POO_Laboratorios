
package u02lab02;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Laboratorio03 extends Laboratorios {
    
    Scanner clic = new Scanner (System.in);
    boolean uuno = false;
    boolean doss = false;
    boolean tress = false;
    boolean cuaatro = false;
    boolean ciinco = false;
    boolean seeis = false;
    boolean sieete = false;
    boolean oocho = false;
    boolean nueeve = false;
    
    //Constructor
    public Laboratorio03(String responsable, int numEquipos, int capacMax) {
        super(responsable, numEquipos, capacMax);
    }
    
    public void Hoarario (boolean selec){
        System.out.println("Horarios disponibles para los Laboratorios");
    if(uuno==false){
            System.out.println("1: 07:00 - 08:00");
    }
    if(doss==false){
            System.out.println("2: 08:00 - 09:00");
    }

    if(tress==false){
            System.out.println("3: 09:00 - 10:00");
    }
    
    if(cuaatro==false){
            System.out.println("4: 10:00 - 11:00");
    }
    
    if(ciinco==false){
            System.out.println("5: 11:00 - 12:00");
    }
    
    if(seeis==false){
            System.out.println("6: 12:00 - 13:00");
    }
    
    if(sieete==false){
            System.out.println("7: 13:00 - 14:00");
    }
    
    if(oocho==false){
            System.out.println("8: 14:00 - 15:00");
    }
    
    if(nueeve==false){
            System.out.println("9: 15:00 - 16:00");
    }
    if(selec == false){
    
    }else{
        System.out.println("Hora a escoger");
        int hora = clic.nextInt();
    }
        int hora = 0;
              
        //Menu de opcion
        switch(hora){
            case 1 -> uuno = true;
            case 2 -> doss = true;
            case 3 -> tress = true;
            case 4 -> cuaatro = true;
            case 5 -> ciinco = true;
            case 6 -> seeis = true;
            case 7 -> sieete = true;
            case 8 -> oocho = true;
            case 9 -> nueeve = true;    
        }
    }

    void Horarios(boolean m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
