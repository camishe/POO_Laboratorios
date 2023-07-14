
//POLIMORFISMO es la herencia
package t03polimorfismo;

import java.util.Scanner;
public class T03Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        String nombre, disciplina, sexo, prueba, estilo;
        int edad;
        
        System.out.println("Escoja una opcion");
        System.out.println ("1. Atletismo");
        System.out.println ("2. Natacion");
        
       int op = entrada.nextInt(); 
       switch(op){
            case 1 -> {
                System.out.println("INGRESE LOS DATOS");
                System.out.println("NOMBRE: ");
                nombre = entrada.nextLine();
                entrada.nextLine();
                System.out.println("EDAD: ");
                edad = entrada.nextInt();
                System.out.println("DISCIPLINA: ");
                disciplina = entrada.nextLine();
                entrada.nextLine();
                System.out.println("SEXO: ");
                sexo = entrada.nextLine();
                entrada.nextLine();
                System.out.println("PRUEBA: ");
                prueba = entrada.nextLine();
                atletismo atle = new atletismo (nombre, edad, disciplina, sexo, prueba);
                atle.entrenamiento();
                atle.mostrarDatos();
                break;
            }
            case 2 -> {
                System.out.println("INGRESE LOS DATOS");
                System.out.println("NOMBRE; ");
                nombre =entrada.nextLine();
                System.out.println("EDAD: ");
                edad = entrada.nextInt();
                System.out.println("DISCIPLINA: ");
                disciplina = entrada.nextLine();
                System.out.println("SEXO: ");
                sexo = entrada.nextLine();
                System.out.println("PRUEBA: ");
                estilo = entrada.nextLine();
                Natacion nadador = new Natacion (nombre, edad, disciplina, sexo, estilo);
                nadador.entrenamiento();
                nadador.mostrarDatos();
                break;
            }
            default -> {
                break;
            }
            
        }
        
    }
    
}

