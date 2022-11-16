/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.servicios;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class CuentaServicio {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {

        System.out.println("Ingrese el numero de la cuenta:");
        int numCuenta = leer.nextInt();
        
        System.out.println("Ingrese el DNI del cliente:");
        long dni = leer.nextInt();
        
        System.out.println("Ingrese el saldo actual:");
        int saldo = leer.nextInt();
        
        System.out.println("Ingrese los intereses:");
        int intereses = leer.nextInt();

        return new Cuenta( numCuenta, dni, saldo, intereses );

    }
    
   
    
    
    
}
