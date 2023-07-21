
//CLASE HIJA 04
package sistemaPago;

public class Administrativo extends Personal{

	//Atributo 
	private  String encargo;
	
	//Constructos 
	public Administrativo(int ID, int horasTrabajo, String tipoPersonl, String direccion, int anio, String encargo){
		super(ID, horasTrabajo, tipoPersonl, direccion, anio);
		this.encargo = encargo;
	}
	
	//Metodos
	public String getEncargo() {
		return encargo;
	}
	
	public void mostrarInfor() {
		System.out.println("Encargo: "+encargo);
	
}
}