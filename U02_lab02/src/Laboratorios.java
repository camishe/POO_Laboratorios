
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Personal
 */

public class Laboratorios {
    String laboratorio;
    private int capacMax;
    String director;
    private List<Horario> horariosDispo;

    public Laboratorios(String laboratorio, int capacMax, String director) {
        this.laboratorio = laboratorio;
        this.capacMax = capacMax;
        this.horariosDispo = new ArrayList<>();
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getCapacMax() {
        return capacMax;
    }

    public void setCapacMax(int capacMax) {
        this.capacMax = capacMax;
    }

    public List<Horario> getHorariosDispo() {
        return horariosDispo;
    }

    public void setHorariosDispo(List<Horario> horariosDispo) {
        this.horariosDispo = horariosDispo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public boolean verificarDisponibilidad(Horario horario) {
        Iterable<Horario> horariosDisponibles = null;
        for (Horario h: horariosDisponibles) {
            if (h.getDia().equals(horario.getDia()) &&(horario.getHoraInicio().isAfter(h.getHoraInicio()) && horario.getHoraInicio().isBefore(h.getHoraFin()) ||horario.getHoraFin().isAfter(h.getHoraInicio()) && horario.getHoraFin().isBefore(h.getHoraFin()))) {
               return false;
                }
        }
        return true;
    }
    public void asignarHorario(Horario horario) {
        horariosDisponibles.add(horario);
    }
    
   
    private String contenido;
    private Asignaturas[] asignaturas;
    
    public Laboratorios(String contenido, Asignaturas[] asignaturas) {
        this.contenido = contenido;
        this.asignaturas = asignaturas;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public Asignaturas[] getAsignaturas() {
        return asignaturas;
    }
}

