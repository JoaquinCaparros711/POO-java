/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.entidades.Cuenta;
import ejercicio5.servicios.CuentaServicio;

/**
 *
 * @author WIN11
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaServicio CS = new CuentaServicio();

        Cuenta cuenta1 = CS.crearCuenta();
        
        cuenta1.consultarSaldo();
                
        cuenta1.ingresar(900);
        
        cuenta1.consultarSaldo();
        
        cuenta1.retirar(800);
        
        cuenta1.consultarSaldo();
        
        cuenta1.extraccionRapida();
        
        cuenta1.consultarSaldo();
        
        cuenta1.consultarDatos();
        
    }
    
}
