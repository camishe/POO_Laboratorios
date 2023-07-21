
//CLASE PADRE
package sistemaPago;

public abstract class Personal {

	//Atribitos 
	private int ID;
	private int horasTrabajadas;
	private String tipoPersonl;
	private String direccion;
	private int anio;
	
	//Constructor
	public Personal(int ID, int horasTrabajo, String tipoPersonl, String direccion, int anio){
		this.ID = ID;
		this.horasTrabajadas = horasTrabajo;
		this.tipoPersonl = tipoPersonl;
		this.direccion = direccion;
		this.anio =  anio;
	}

	public int getID() {
		return ID;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public String getTipoPersonl() {
		return tipoPersonl;
	}

	public String getDireccion() {
		return direccion;
	}


	public int getAnio() {
		return anio;
	}

	//Metodo para devolver la informacion
	public void mostrarInfor() {
		System.out.println("ID: "+ID);
		System.out.println("Horas Trabajadas: "+horasTrabajadas);
		System.out.println("Tipo personal: "+tipoPersonl );
		System.out.println("Direccion: "+direccion);
		System.out.println("Anio de ingreso: "+anio);
	}
}
	
