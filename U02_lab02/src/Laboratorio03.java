
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
public class Laboratorio03 extends Laboratorios {
    private String responsable;
    private int numEquipos;
    
    public Laboratorio03(String laboratorio, int capacMax,List<Horario> horariosDispo, String responsable, int numEquipos, String director) {
        super(laboratorio, capacMax, director);
        this.responsable = responsable;
        this.numEquipos = numEquipos;
    }

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

    @Override
    public String getLaboratorio() {
        return laboratorio;
    }

    @Override
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public void setDirector(String director) {
        this.director = director;
    }
    
}
