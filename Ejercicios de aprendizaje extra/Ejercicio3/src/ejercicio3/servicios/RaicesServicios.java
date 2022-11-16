/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.servicios;

import ejercicio3.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class RaicesServicios {

    Scanner scan = new Scanner(System.in);

    public void crearRaices(Raices r1) {

        System.out.println("Ingrese el valor de 'a'");
        r1.setA(scan.nextInt());

        System.out.println("Ingrese el valor de 'b'");
        r1.setB(scan.nextInt());

        System.out.println("Ingrese el valor de 'c'");
        r1.setC(scan.nextInt());

    }

    public double getDiscriminante(Raices r1) {

        int a = r1.getA();
        int b = r1.getB();
        int c = r1.getC();

        double discriminante = ((Math.pow(b, 2)) - 4 * a * c);

        System.out.print("El valor del discriminante es: ");

        return discriminante;

    }

    public boolean tieneRaices(Raices r1) {

        boolean logic = false;

        if (getDiscriminante(r1) >= 0) {
            logic = true;
        }

        return logic;
    }

    public boolean tieneRaiz(Raices r1) {

        boolean logic = false;

        if (getDiscriminante(r1) == 0) {
            logic = true;
        }

        return logic;
    }

    public void obtenerRaices(Raices r1) {

        if (tieneRaices(r1) == true) {
            System.out.println("Soluciones: " + tieneRaices(r1));
        }

    }

    public void obtenerRaiz(Raices r1) {

        if (tieneRaiz(r1) == true) {
            System.out.println("Solucion: " + tieneRaices(r1));
        }

    }

    public void calcular(Raices r1) {

        if (tieneRaices(r1) && tieneRaiz(r1)) {
            obtenerRaices(r1);
            obtenerRaiz(r1);
        } else{
            System.out.println("No existe solucion");
        }

    }

}
