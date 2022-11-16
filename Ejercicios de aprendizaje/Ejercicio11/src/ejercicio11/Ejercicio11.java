/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un dia");
        int dia = leer.nextInt();

        System.out.println("Ingrese un mes");
        int mes = leer.nextInt();

        System.out.println("Ingrese un año");
        int anio = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);

        System.out.println("====Fecha ingresada por el usuario====");
        System.out.println("Dia: " + fecha.getDate());
        System.out.println("Mes: " + fecha.getMonth());
        System.out.println("Año: " + fecha.getYear());

        Date fechaActual = new Date();

        System.out.println("Los años que hay entre la fecha ingresada con la fecha actual son: " + ((fechaActual.getYear() + 1900) - fecha.getYear()) + " años");

    }

}
