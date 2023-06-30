
package u02_sistemabancario;

/**
 * @author Mishell
 */

import java.util.*;

public class U02_SistemaBancario {
    public static void main(String[] args) {
        double monto = 0;
        double saldo = 20;
        Scanner tex = new Scanner(System.in);
        CuentaLimitada cuent = new CuentaLimitada("1234567890", saldo);
        
        System.out.println("Saldo inicial: "+saldo);
        System.out.println("\nMovimientos");
        System.out.print("Deposito: ");
        monto = tex.nextDouble();
        cuent.depositar(monto);
        System.out.println(" ");
        System.out.print("Retiro: ");
        monto = tex.nextDouble();
        cuent.retirar(monto);
        
        
        
    }
}   

    

