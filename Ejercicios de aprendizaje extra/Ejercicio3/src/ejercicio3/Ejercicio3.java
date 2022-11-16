/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.entidades.Raices;
import ejercicio3.servicios.RaicesServicios;

/**
 *
 * @author WIN11
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Raices r1 = new Raices();

        RaicesServicios rS = new RaicesServicios();

        rS.crearRaices(r1);

        System.out.println(rS.getDiscriminante(r1));

        System.out.println(rS.tieneRaices(r1));

        System.out.println(rS.tieneRaiz(r1));

        rS.obtenerRaices(r1);

        rS.obtenerRaiz(r1);

        rS.calcular(r1);

    }

}
