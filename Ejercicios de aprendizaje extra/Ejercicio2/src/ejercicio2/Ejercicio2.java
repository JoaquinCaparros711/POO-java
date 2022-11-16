/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.entidades.Puntos;
import ejercicio2.servicios.PuntosServicios;

/**
 *
 * @author WIN11
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Puntos p1 = new Puntos();
        PuntosServicios pS = new PuntosServicios();

        pS.crearPuntos(p1);

        pS.calcularDistancia(p1);

    }

}
