/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.entidades.Operacion;
import ejercicio3.services.OperacionServices;

/**
 *
 * @author WIN11
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionServices OS = new OperacionServices();       
        
        Operacion operacion1 = OS.crearOperacion();
        
        int num1 = operacion1.getNum1();
        int num2 = operacion1.getNum2();
      
        int suma = (int) OS.sumar(num1, num2);
        int resta = (int) OS.restar(num1, num2);
        int multi = (int) OS.multiplicar(num1, num2);
        int divi = (int) OS.dividir(num1, num2);
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " - " + num2 + " es: " + resta);
        System.out.println("La multiplicacion de " + num1 + " x " + num2 + " es: " + multi);
        System.out.println("La division de " + num1 + " / " + num2 + " es: " + divi);



        
    }
    
}
