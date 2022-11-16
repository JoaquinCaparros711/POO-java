/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.servicios;

import ejercicio4.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class NIFServicios {

    Scanner scan = new Scanner(System.in);

    public void crearNif(NIF n1) {

        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        System.out.println("Ingrese el DNI");
        n1.setDni(scan.nextLong());

        int resultado = (int) (n1.getDni() % 23);

        for (int i = 0; i < vector.length; i++) {

            if (resultado == i) {
                n1.setLetra(vector[i]);
            }

        }

    }

    public void mostrar(NIF n1) {

        System.out.println("El NIF es: " + n1.getDni()+ "-" + n1.getLetra());

    }

}
