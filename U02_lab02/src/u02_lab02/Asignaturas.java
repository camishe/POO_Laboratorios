/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u02_lab02;

/**
 *
 * @author Personal
 */
class Asignaturas {
    String nomAsignatura;
    String docente;
    int horario;
        
     public Asignaturas(String nomAsignatura, String docente, int horario) {
        this.nomAsignatura = nomAsignatura;
        this.docente = docente;
        this.horario = horario;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
}

