
import java.util.Scanner;
import u02lab02.Laboratorios;

/**
 *
 * @author Personal
 */
public class Laboratorio01 extends Laboratorios {
    
    Scanner clic = new Scanner (System.in);
    boolean uno = false;
    boolean dos = false;
    boolean tres = false;
    boolean cuatro = false;
    boolean cinco = false;
    boolean seis = false;
    boolean siete = false;
    boolean ocho = false;
    boolean nueve = false;
   

    //Constructor
    public Laboratorio01(String responsable, int numEquipos, int capacMax) {
        super(responsable, numEquipos, capacMax);
    }
   
    //Condicionales
    public void Hoarario (boolean selec){
        System.out.println("Horarios disponibles para los Laboratorios");
    if(uno==false){
            System.out.println("1: 07:00 - 08:00");
    }
    if(dos==false){
            System.out.println("2: 08:00 - 09:00");
    }

    if(tres==false){
            System.out.println("3: 09:00 - 10:00");
    }
    
    if(cuatro==false){
            System.out.println("4: 10:00 - 11:00");
    }
    
    if(cinco==false){
            System.out.println("5: 11:00 - 12:00");
    }
    
    if(seis==false){
            System.out.println("6: 12:00 - 13:00");
    }
    
    if(siete==false){
            System.out.println("7: 13:00 - 14:00");
    }
    
    if(ocho==false){
            System.out.println("8: 14:00 - 15:00");
    }
    
    if(nueve==false){
            System.out.println("9: 15:00 - 16:00");
    }
    if(selec == false){
    
    }else{
        System.out.println("Hora a escoger");
        int hora = clic.nextInt();
    }
        //inicializa
        int hora = 0;
       
        //Menu de opcion
        switch(hora){
            case 1 -> uno = true;
            case 2 -> dos = true;
            case 3 -> tres = true;
            case 4 -> cuatro = true;
            case 5 -> cinco = true;
            case 6 -> seis = true;
            case 7 -> siete = true;
            case 8 -> ocho = true;
            case 9 -> nueve = true;    
        }
    }
}
