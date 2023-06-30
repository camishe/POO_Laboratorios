/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
class Horario {
    private Asignaturas asignaturas;
    private Laboratorios laboratorios;
    private String dia;
    private int horaInicio;
    private int horaFin;

    public Horario(Asignaturas asignaturas, Laboratorios laboratorios, String dia, int horaInicio, int horaFin) {
        this.asignaturas = asignaturas;
        this.laboratorios = laboratorios;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Asignaturas getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignaturas asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Laboratorios getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(Laboratorios laboratorios) {
        this.laboratorios = laboratorios;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
    
}
