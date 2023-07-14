/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t03polimorfismo;

/**
 *
 * @author Personal
 */
public abstract class Deportista {
    private String nombre;
    private int edad;
    private String disciplina;
    private String sexo;

    public Deportista(String nombre, int edad, String disciplina, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.disciplina = disciplina;
        this.sexo = sexo;
    }
    //Metodo
    public abstract void entrenamiento();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
