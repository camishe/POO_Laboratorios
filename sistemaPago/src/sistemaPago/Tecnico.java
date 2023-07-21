
//CLASE HIJA 02
package sistemaPago;

public class Tecnico extends Personal {
	
	//Atributo
	private String nivelConocimineto;
	
	//Constructor
		public Tecnico(int ID, int horasTrabajo, String tipoPersonl, String direccion, int anio, String nivelConocimineto){
			super(ID, horasTrabajo, tipoPersonl, direccion, anio);
			this.nivelConocimineto = nivelConocimineto;
			}

		//Metodos 
		public String getNivelConocimineto() {
			return nivelConocimineto;
		}
		
		public void mostrarInfor() {
			System.out.println("Nivel de Conocimiento: "+nivelConocimineto);

		}

		}
