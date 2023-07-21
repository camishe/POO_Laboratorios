package sistemaPago;

import java.util.Scanner;

public class sistemaPago {

	public static void main(String[] args) {
		
		Scanner entrar =  new Scanner(System.in);
		
		Personal docentel =new Personal(12, 8, "Docente", "Coop. 20 de Octubre", 2018);
		Docente docente = new Docente(12, 8, "Docente", "Coop. 20 de Octubre", 2018, "Maestria");
		
		Personal tecnico1 = new Personal(02, 3, "Tecnico", "Coop. Villa Florida", 2020);
		Tecnico tecnico = new Tecnico(02, 3, "Tecnico", "Coop. Villa Florida", 2020, "Basico");
		
		Personal limpieza = new Personal(05, 4, "Limpieza", "Coop. 9 de diciembre", 2019);
		Limpieza limpieza1 = new Limpieza(05, 4, "Limpieza", "Coop. 9 de diciembre", 2019, "Edificio Principal");
		
		Personal admin = new Personal(9, 7, "Administraor", "Coop. 30 de junio", 2016); 
		Administrativo admin1 = new Administrativo(9, 7, "Administraor", "Coop. 30 de junio", 2016, "Gerente");
		
		docentel.mostrarInfor();
		docente.mostrarInfor();
		System.out.println("---------------------------------------------");
		tecnico1.mostrarInfor();
		tecnico.mostrarInfor();
		System.out.println("---------------------------------------------");
		limpieza.mostrarInfor();
		limpieza1.mostrarInfor();
		System.out.println("---------------------------------------------");
		admin.mostrarInfor();
		admin1.mostrarInfor();
		
		

	}

}
