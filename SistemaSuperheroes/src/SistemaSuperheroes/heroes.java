package SistemaSuperheroes;

public abstract class heroes {
	//Atributos
	public String nombre;
	public String habilidad;
	
	
	//Constructor
	public heroes(String nombre, String habilidad) {
		this.habilidad = habilidad;
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	//public void MostrarVestuario(vestuario) {
		//return vestuario;
	}

  