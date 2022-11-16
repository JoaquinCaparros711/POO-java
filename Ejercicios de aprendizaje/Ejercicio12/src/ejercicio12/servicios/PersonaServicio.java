/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.servicios;

import ejercicio12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public void crearPersona(Persona p1) {

        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());

        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();

        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();

        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);

        p1.setFecha(fecha);

    }

    public void calcularEdad(Persona p1) {

        Date fechaActual = new Date();

        System.out.println("Usted tiene " + ((fechaActual.getYear() + 1900) - p1.getFecha().getYear()) + " años");

    }

    public void menorQue(Persona p1, int edad) {

        if (p1.getFecha().getYear() < edad) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public void mostrarPersona(Persona p1) {

        System.out.println("El nombre de la persona es: " + p1.getNombre());
        System.out.println("El dia de nacimiento de la persona es: " + p1.getFecha().getDate());
        System.out.println("El mes de nacimiento de la persona es: " + p1.getFecha().getMonth());
        System.out.println("El año de nacimiento de la persona es: " + p1.getFecha().getYear());

    }

}
