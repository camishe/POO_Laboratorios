
import java.util.Scanner;
import u02lab02.Laboratorios;

/**
 *
 * @author Personal
 */
public class Laboratorio02 extends Laboratorios {
    
    Scanner clic = new Scanner (System.in);
    boolean unoo = false;
    boolean doos = false;
    boolean trees = false;
    boolean cuatroo = false;
    boolean cincoo = false;
    boolean seiis = false;
    boolean sietee = false;
    boolean ochoo = false;
    boolean nuevee = false;
   
    //Constructor
    public Laboratorio02(String responsable, int numEquipos, int capacMax) {
        super(responsable, numEquipos, capacMax);
    }
    
     public void Horario (boolean selec){
        System.out.println("Horarios disponibles para los Laboratorios");
    if(unoo==false){
            System.out.println("1: 07:00 - 08:00");
    }
    if(doos==false){
            System.out.println("2: 08:00 - 09:00");
    }

    if(trees==false){
            System.out.println("3: 09:00 - 10:00");
    }
    
    if(cuatroo==false){
            System.out.println("4: 10:00 - 11:00");
    }
    
    if(cincoo==false){
            System.out.println("5: 11:00 - 12:00");
    }
    
    if(seiis==false){
            System.out.println("6: 12:00 - 13:00");
    }
    
    if(sietee==false){
            System.out.println("7: 13:00 - 14:00");
    }
    
    if(ochoo==false){
            System.out.println("8: 14:00 - 15:00");
    }
    
    if(nuevee==false){
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
            case 1 -> unoo = true;
            case 2 -> doos = true;
            case 3 -> trees = true;
            case 4 -> cuatroo = true;
            case 5 -> cincoo = true;
            case 6 -> seiis = true;
            case 7 -> sietee = true;
            case 8 -> ochoo = true;
            case 9 -> nuevee = true;    
        }
    }
}
