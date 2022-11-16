/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import ejercicio9.entidades.Matematica;
import ejercicio9.servicios.MatematicaServicio;

/**
 *
 * @author WIN11
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        System.out.println("Primer numero: " + num1);
        System.out.println("Segundo numero: " + num2);
        System.out.println("===================================");

        Matematica matematica1 = new Matematica();
        MatematicaServicio mS = new MatematicaServicio();

        matematica1.setNum1(num1);
        matematica1.setNum2(num2);

        mS.devolverMayor(matematica1);
        System.out.println("===================================");

        mS.calcularPotencia(matematica1);
        System.out.println("===================================");

        mS.calcularRaiz(matematica1);
        System.out.println("===================================");

    }

}
