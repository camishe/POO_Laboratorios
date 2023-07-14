
package t03polimorfismo;

/**
 *
 * @author Personal
 */
public class Natacion extends Deportista {
    //Atributo
    private String estilo;
    
    //Constructor
    public Natacion(String estilo, int edad, String nombre, String disciplina, String sexo) {
        super(nombre, edad, disciplina, sexo);
        this.estilo = estilo;
    }
    
    //Metodos
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    
    @Override
    public void entrenamiento() {
        System.out.println("Deporte donde se trabaja la mayoria de musculos del cuerpo");
     }
    
    public void mostrarDatos(){
        System.out.println("NOMBRE "+getNombre());
        System.out.println("EDAD "+getEdad());
        System.out.println("DISCIPLINA "+getDisciplina());
        System.out.println("SEXO "+getSexo());
        System.out.println("ESTILO "+getEstilo());
    }
    
}
