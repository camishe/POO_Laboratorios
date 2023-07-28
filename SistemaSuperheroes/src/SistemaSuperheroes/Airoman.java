package SistemaSuperheroes;

public class Airoman extends heroes {

	//Atributos de la clase
	public String hombreMetlico;
	
	//constructor
	public Airoman(String nombre, String habilidad, String hombreMetlico) {
		super(nombre, habilidad);
		this.hombreMetlico = hombreMetlico; 
	}

	//Metodos para dar y recibir datos
	public String getHombreMetlico() {
		return hombreMetlico;
	}

	public void setHombreMetlico(String hombreMetlico) {
		this.hombreMetlico = hombreMetlico;
	}

}
	