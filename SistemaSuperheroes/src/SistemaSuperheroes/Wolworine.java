package SistemaSuperheroes;

public class Wolworine extends heroes {

	//Atributos de la clase
	public int tamanioGarras;
	
	//Constructor
	public Wolworine(String nombre, String habilidad, int tamanioGarras) {
		super(nombre, habilidad);
		this.tamanioGarras = tamanioGarras; 
	}

	//Metodos para dar y recibir datos
	public int getTamanioGarras() {
		return tamanioGarras;
	}

	public void setTamanioGarras(int tamanioGarras) {
		this.tamanioGarras = tamanioGarras;
	}
}
