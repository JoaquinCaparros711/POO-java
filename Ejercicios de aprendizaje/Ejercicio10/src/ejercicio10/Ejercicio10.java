/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author WIN11
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] array1 = new double[50];
        double[] array2 = new double[20];

        double menor;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (double) (Math.random() * 20 + 1);
            System.out.print(Math.floor(array1[i]) + " ");
        }

        System.out.println(" ");

        Arrays.sort(array1, 0, 50);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(Math.floor(array1[i]) + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < array2.length; i++) {

            if (i <= 9) {
                array2[i] = array1[i];
                System.out.print(Math.floor(array2[i]) + " ");
            } else {
                array2[i] = 0.5;
                System.out.print(array2[i] + " ");

            }

        }

    }

}
