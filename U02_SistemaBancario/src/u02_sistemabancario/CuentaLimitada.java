package u02_sistemabancario;

import java.awt.List;

/**
 *
 * @author Personal
 */
public class CuentaLimitada extends Cuenta {

    public CuentaLimitada(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }
    
    @Override
    
    public void depositar(double monto) {
        if((monto >=5)&&(monto<=100)){
            saldo += monto;
            System.out.println("Saldo actual: "+saldo);
        }else{
            System.out.println("Monto no valido");
        }
    }
    
    @Override
    public void retirar(double monto) {
        if((monto >=5)&&(monto <= 100)){
            if (saldo >= monto) {
                saldo -= monto;
                System.out.println("Saldo actual: "+saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            } 
        }else{
            System.out.println("Monto no valido");
        }
        
    }
}

