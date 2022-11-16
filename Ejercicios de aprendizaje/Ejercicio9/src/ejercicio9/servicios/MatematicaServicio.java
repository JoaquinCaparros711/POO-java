/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.servicios;

import ejercicio9.entidades.Matematica;

/**
 *
 * @author WIN11
 */
public class MatematicaServicio {

    public void devolverMayor(Matematica m1) {

        if (m1.getNum1() > m1.getNum2()) {
            System.out.println("El primer numero es mayor al segundo");
        } else {
            System.out.println("El segundo numero es mayor al primero");
        }

    }

    public void calcularPotencia(Matematica m1) {

        int result;

        if (m1.getNum1() > m1.getNum2()) {
            result = (int) Math.pow(m1.getNum1(), m1.getNum2());
            System.out.println("La potencia de " + m1.getNum1() + " elevado a " + m1.getNum2() + " = " + result);
        } else {
            result = (int) Math.pow(m1.getNum2(), m1.getNum1());
            System.out.println("La potencia de " + m1.getNum2() + " elevado a " + m1.getNum1() + " = " + result);
        }

    }
    
    public void calcularRaiz(Matematica m1) {

        int result;

        if (m1.getNum1() > m1.getNum2()) {
            result = (int) Math.sqrt(m1.getNum2());
            System.out.println("La raiz cuadrada de " + m1.getNum2() + " es " + result);
        } else {
            result = (int) Math.sqrt(m1.getNum1());
            System.out.println("La raiz cuadrada de " + m1.getNum1() + " es " + result);
        }

    }

}
