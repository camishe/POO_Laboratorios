
//CLASE HIJA 01
package sistemaPago;

public class Docente extends Personal{

	//Atributos
	private String tipoTitulo;
		
	//Constructor
	public Docente(int ID, int horasTrabajo, String tipoPersonl, String direccion, int anio, String tipoTitulo){
		super(ID, horasTrabajo, tipoPersonl, direccion, anio);
		this.tipoTitulo = tipoTitulo;
	}
	
	//Metodos
	public String getTipoTitulo() {
		return tipoTitulo;
	}
	public void mostrarInfor() {
	System.out.println("Tipo de Titulo Maestria/Doctorado: "+tipoTitulo);
	}
	
}