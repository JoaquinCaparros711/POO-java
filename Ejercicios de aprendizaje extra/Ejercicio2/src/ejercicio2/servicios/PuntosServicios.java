/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicios;

import ejercicio2.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class PuntosServicios {

    Scanner scan = new Scanner(System.in);

    public void crearPuntos(Puntos p1) {

        System.out.println("Ingrese las coordenadas de x1");
        p1.setX1(scan.nextInt());

        System.out.println("Ingrese las coordenadas de x2");
        p1.setX2(scan.nextInt());

        System.out.println("Ingrese las coordenadas de y1");
        p1.setY1(scan.nextInt());

        System.out.println("Ingrese las coordenadas de y2");
        p1.setY2(scan.nextInt());

    }

    public void calcularDistancia(Puntos p1) {

        double distancia = Math.sqrt(Math.pow(p1.getX2() - p1.getX1(), 2) + Math.pow(p1.getY2() - p1.getY1(), 0));

        System.out.println("La distancia entre puntos es de: " + distancia);
    }

}
