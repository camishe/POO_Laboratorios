
//CLASE HIJA 03
package sistemaPago;

public class Limpieza extends Personal{
	
	//ATRIBUTO
private String seccion;

//Constructos 
public Limpieza(int ID, int horasTrabajo, String tipoPersonl, String direccion, int anio, String seccion){
	super(ID, horasTrabajo, tipoPersonl, direccion, anio);
	this.seccion = seccion;
}

//Metodos
public String getSeccion() {
	return seccion;
}

public void mostrarInfor() {
	System.out.println("Seccion de Limpieza: "+seccion);

}

}
