/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.services;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class OperacionServices {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {

        System.out.println("Ingrese el primer número de la operación:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número de la operación:");
        int num2 = leer.nextInt();

        return new Operacion(num1, num2);

    }

    public double sumar(int num1, int num2) {

        int suma = num1 + num2;

        return suma;

    }

    public double restar(int num1, int num2) {

        int resta = num1 - num2;

        return resta;

    }

    public double multiplicar(int num1, int num2) {

        int multi;

        if (num1 > 0 && num2 > 0) {
            multi = num1 * num2;
        } else {
            multi = 0;
            System.out.println("Error, no se puede multiplicar por cero");
        }

        return multi;

    }

    public double dividir(int num1, int num2) {

        int divi;

        if (num1 > 0 && num2 > 0) {
            divi = num1 / num2;
        } else {
            divi = 0;
            System.out.println("Error, no se puede dividir por cero");
        }

        return divi;

    }

}
