package SistemaSuperheroes;

public class Batman extends heroes {

	//Atributos de la clase 
	public String tamanioTraje;
	
	//Constructor
	public Batman(String nombre, String habilidad, String tamanioTraje) {
		super(nombre, habilidad);
		this.tamanioTraje = tamanioTraje;
	}

	//Metodos para dar y recibir datos
	public String getTamanioTraje() {
		return tamanioTraje;
	}

	public void setTamanioTraje(String tamanioTraje) {
		this.tamanioTraje = tamanioTraje;
	}
}
