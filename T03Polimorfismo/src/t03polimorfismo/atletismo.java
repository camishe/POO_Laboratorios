
package t03polimorfismo;

/**
 *
 * @author Personal
 */
public class atletismo extends Deportista{

    private String prueba;
    
    public atletismo(String nombre, int edad, String disciplina, String sexo, String prueba) {
        super(nombre, edad, disciplina, sexo);
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }
    public void mostrarDatos(){
        System.out.println("NOMBRE "+getNombre());
        System.out.println("EDAD "+getEdad());
        System.out.println("DISCIPLINA "+getDisciplina());
        System.out.println("SEXO "+getSexo());
        System.out.println("PRUEBA "+getPrueba());
    }
    
     @Override
    public void entrenamiento() {
        System.out.println("El atletismo es un deporte que se necesita de mucha resistencia");
    }
}
