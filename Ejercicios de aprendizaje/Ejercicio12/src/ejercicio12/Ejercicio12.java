/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import ejercicio12.entidades.Persona;
import ejercicio12.servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Persona p1 = new Persona();

        PersonaServicio pS = new PersonaServicio();

        pS.crearPersona(p1);

        pS.calcularEdad(p1);

        System.out.println("=================");

        System.out.println("Ingrese una edad para verificar si la primera persona es menor a esta edad ingresada");
        int edad = leer.nextInt();

        System.out.println("=================");

        pS.menorQue(p1, edad);

        System.out.println("=================");

        pS.mostrarPersona(p1);

    }

}
