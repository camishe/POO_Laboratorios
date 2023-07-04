
package u02lab02;

/**
 *
 * @author Personal
 */
public class Laboratorios {
    //Atributos
    String responsable;
    int numEquipos;
    int capacMax;
    int numLaboratorio;
            
    //Constructor
    public Laboratorios(String responsable, int numEquipos, int capacMax) {
        this.responsable = responsable;
        this.numEquipos = numEquipos;
        this.capacMax = capacMax;
    }
    
    //Metodos
    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public int getCapacMax() {
        return capacMax;
    }

    public void setCapacMax(int capacMax) {
        this.capacMax = capacMax;
    }

    public int getNumLaboratorio() {
        return numLaboratorio;
    }

    public void setNumLaboratorio(int numLaboratorio) {
        this.numLaboratorio = numLaboratorio;
    }
}
