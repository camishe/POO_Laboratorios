/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u02_lab02;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
//La institución necesita un sistema orientado a objetos en el cual debe permitir asignar horarios a diferentes asignaturas y controlar la disponibilidad de los laboratorios.
public class U02_lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignaturas asignatura = new Asignaturas();
                
        Laboratorios laboratorio01 = new Laboratorios("Laboratorio 01", 30);
        Laboratorios laboratorio02 = new Laboratorios("Laboratorio 02", 25);
        Laboratorios laboratorio03 = new Laboratorios("Laboratorio 03", 30);
        
        Horario horario1 = new Horario(asignatura1, laboratorio1, "Lunes", 8, 10);
        Horario horario2 = new Horario(asignatura2, laboratorio2, "Martes", 14, 16);
        
        // Verificar disponibilidad y asignar horarios
        if (laboratorio1.verificarDisponibilidad(horario1)) {
            laboratorio1.asignarHorario(horario1);
            System.out.println("Horario asignado correctamente");
        } else {
            System.out.println("El horario no está disponible");
        }
        
        if (laboratorio2.verificarDisponibilidad(horario2)) {
            laboratorio2.asignarHorario(horario2);
            System.out.println("Horario asignado correctamente");
        } else {
            System.out.println("El horario no está disponible");
        }
    }
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de laboratorios: ");
        int numLaboratorios = scanner.nextInt();
        scanner.nextLine(); 
        
        Laboratorio[] laboratorios = new Laboratorio[numLaboratorios];
        
        for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("\nLaboratorio " + (i + 1));
            System.out.print("Ingrese el contenido del laboratorio: ");
            String contenido = scanner.nextLine();
            
            System.out.print("Ingrese la cantidad de asignaturas: ");
            int numAsignaturas = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
            
            Asignatura[] asignaturas = new Asignatura[numAsignaturas];
            
            for (int j = 0; j < numAsignaturas; j++) {
                System.out.println("\nAsignatura " + (j + 1));
                System.out.print("Ingrese el nombre de la asignatura: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Ingrese el horario de la asignatura: ");
                String horario = scanner.nextLine();
                
                asignaturas[j] = new Asignatura(nombre, horario);
            }
            
            laboratorios[i] = new Laboratorio(contenido, asignaturas);
        }
        
        System.out.println("\nInformación de los laboratorios:");
        for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("\nLaboratorio " + (i + 1));
            System.out.println("Contenido: " + laboratorios[i].getContenido());
            
            Asignaturas[] asignaturas = laboratorios[i].getAsignaturas();
            System.out.println("Asignaturas:");
            
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println("Nombre: " + asignaturas[j].getNombre());
                System.out.println("Horario: " + asignaturas[j].getHorario());
            }
        }
    }    
    