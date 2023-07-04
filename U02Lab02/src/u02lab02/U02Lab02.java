
package u02lab02;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class U02Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciar (se crea los objetos)
        Scanner clics = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        
        String[] asignatura1 = new String[9];
        String[] docente1 = new String[9];
        String[] hora1 = new String[9];
        String[] asignatura2 = new String[9];
        String[] docente2 = new String[9];
        String[] hora2 = new String[9];
        String[] asignatura3 = new String[9];
        String[] docente3 = new String[9];
        String[] hora3 = new String[9];
        
        Laboratorio01 lab1 = new Laboratorio01("", 0, "", "");
        Laboratorio02 lab2 = new Laboratorio02("", 0, "", "");
        Laboratorio03 lab3 = new Laboratorio03("", 0, "", "");
        
        //Se declara variables
        int opcion = 0;
        int op;
        int numlaboratorio01= 0;
        int numlaboratorio02= 0;
        int numlaboratorio03= 0;
        boolean m = false;
        boolean b = true;
        boolean laboratorio1 = false;
        boolean laboratorio2 = false;
        boolean laboratorio3 = false;
        boolean labora1 = false;
        boolean labora2 = false;
        boolean labora3 = false;
        boolean mar = false;
        
        do{
        System.out.println(" JUNTOS POR LA EDUCACION TECNOLOGICA SUPERIOR ");
        System.out.println("1: Reserva del Laboratorio");
        System.out.println("2: Visualizar los horarios de los Laboratorios");
        System.out.println("3: Visualizar los Laboratorios reservados");
        System.out.println("4: Agregar laboratorio");
        System.out.println("5: Salir");
        
        switch (opcion){
            case 1: 
                if(m == true){
                    System.out.println("Reserva del Laboratorio");
                    System.out.println("Laboratorio #: "+lab1);
                    System.out.println("Laboratorio #: "+lab2);
                    System.out.println("Laboratorio #: "+lab3);
                    
                    op = clics.nextInt();
                    
                    switch(op){
                        case 1:
                            if(lab1==true){
                              laboratorio1 = true;
                              System.out.println("Laboratorio: "+lab1.getNumLaboratorio(), "\n");
                              System.out.println("Capacidad Maxima para el Laboratorio: "+lab1.getCapacMax(), "\n");
                              System.out.println("Numero de Equipos en el Laboratorio: "+lab1.NumEquipos(), "\n");
                              System.out.println("Responsable del Laboratorio: "+lab1.getResponsable(), "\n");
                              
                              System.out.println("Numero de laboratorios a guardar");
                              numlaboratorio01 = clics.nextInt();
                              
                              for(int i = 0; i < numlaboratorio01; i++){
                                System.out.println("Asignatura: ");
                                asignatura1[i] = clics.nextLine();
                                System.out.println("Docente de la asignatura: ");
                                docente1[i] = clics.nextLine();
                                System.out.println("Hora (texto): ");
                                hora1[1] = clics.nextLine();
                                System.out.println("\n");
                                laboratorio1.Horarios(b);
                              
                            }else{
                                System.out.println("Llenar con la informacion solicitada");
                            }
                            break;
                            }
                            
                        case 2:
                            if(lab2==true){
                              laboratorio2 = true;
                              System.out.println("Laboratorio: "+lab2.getNumLaboratorio(), "\n");
                              System.out.println("Capacidad Maxima para el Laboratorio: "+lab2.getCapacMax(), "\n");
                              System.out.println("Numero de Equipos en el Laboratorio: "+lab2.NumEquipos(), "\n");
                              System.out.println("Responsable del Laboratorio: "+lab2.getResponsable(), "\n");
                              
                              System.out.println("Numero de laboratorios a guardar");
                              numlaboratorio02 = clics.nextInt();
                              
                              for(int i = 0; i < numlaboratorio02; i++){
                                System.out.println("Asignatura: ");
                                asignatura2[i] = clics.nextLine();
                                System.out.println("Docente de la asignatura: ");
                                docente2[i] = clics.nextLine();
                                System.out.println("Hora (texto): ");
                                hora2[1] = clics.nextLine();
                                System.out.println("\n");
                                laboratorio2.Horarios(b);
                              
                            }else{
                                System.out.println("Llenar con la informacion solicitada");
                            }
                            break;
                            }
                            
                        case 3:
                            if(lab3==true){
                              laboratorio3 = true;
                              System.out.println("Laboratorio: "+lab3.getNumLaboratorio(), "\n");
                              System.out.println("Capacidad Maxima para el Laboratorio: "+lab3.getCapacMax(), "\n");
                              System.out.println("Numero de Equipos en el Laboratorio: "+lab3.NumEquipos(), "\n");
                              System.out.println("Responsable del Laboratorio: "+lab3.getResponsable(), "\n");
                              
                              System.out.println("Numero de laboratorios a guardar");
                              numlaboratorio03 = clics.nextInt();
                              
                              for(int i = 0; i < numlaboratorio03; i++){
                                System.out.println("Asignatura: ");
                                asignatura3[i] = clics.nextLine();
                                System.out.println("Docente de la asignatura: ");
                                docente3[i] = clics.nextLine();
                                System.out.println("Hora (texto): ");
                                hora3[1] = clics.nextLine();
                                System.out.println("\n");
                                laboratorio3.Horarios(b);
                              
                            }else{
                                System.out.println("Llenar con la informacion solicitada");
                            }
                            break;
                            }
                case 2:
                    System.out.println("\n");
                    lab1.Horarios(m);
                    System.out.println("\n");
                    lab2.Horarios(m);
                    System.out.println("\n");
                    lab3.Horarios(m);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Laboratorios Reservados");
                    if(laboratorio1 == true){
                        System.out.println("\n");
                        System.out.println("Laboratorio #: "+lab1.geNumLaboratorio());
                        int numLaboratorio;
                        
                        
                        
                        
        }while (opc != 5); 
    }
                            
                    }
                }
            }
        

