package SistemaSuperheroes;
import java.util.Scanner;
public class SistemaSuperheroes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		heroes hero1 = new heroes();
		hero1.getNombre();
		hero1.getHabilidad();
		
		heroes hero2 = new heroes ();
		hero2.getHabilidad();
		hero2.getNombre();
		
		
	}

}
