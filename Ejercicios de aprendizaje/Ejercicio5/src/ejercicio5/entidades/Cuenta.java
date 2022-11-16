/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidades;

/**
 *
 * @author WIN11
 */
public class Cuenta {
    
    public int numeroCuenta;
    public long DNICliente;
    public int saldoActual;
    public int interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNICliente, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNICliente = DNICliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
     public void ingresar( double ingreso ) {

        this.saldoActual = (int) (saldoActual + ingreso);
        
        System.out.println("Ingreso realizado con exito");


    }
     
    public void retirar( double retiro ) {

        this.saldoActual = (int) (saldoActual - retiro);
        
        System.out.println("Retiro realizado con exito");

    }
    
    public void extraccionRapida() {
        
        int veintePorciento = (int) (saldoActual * 0.2);
        
        if ( veintePorciento == saldoActual * 0.2 ) {
            
            this.saldoActual = (int) ( saldoActual - veintePorciento );
            System.out.println("Gracias por la operacion, son $" + veintePorciento);
            
        }

    }
    
    public void consultarSaldo() {
        
        System.out.println("Su saldo es de $" + saldoActual );

    }

    public void consultarDatos() {
        System.out.println("Cuenta{" + "Numero de cuenta:" + numeroCuenta + ", DNI:" + DNICliente + ", Saldo Actual:" + saldoActual + ", Intereses:" + interes + '}');
    }
     
     
    

    
            
    
}
