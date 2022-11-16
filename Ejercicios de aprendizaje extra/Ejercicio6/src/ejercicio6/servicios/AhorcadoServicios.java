/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.servicios;

import ejercicio6.entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class AhorcadoServicios {

    Scanner scan = new Scanner(System.in);

    public void crearJuego(Ahorcado a1) {

        System.out.println("Ingrese una palabra para jugar");
        String palabra = scan.next();

        System.out.println("Ingrese la cantidad de jugadas maxima");
        a1.setCantJugadasMax(scan.nextInt());

        String[] array;
        array = new String[palabra.length()];

        a1.setArray(array);

        for (int i = 0; i < palabra.length(); i++) {
            array[i] = palabra.substring(i, i + 1);
        }

        a1.setCantLetras(0);

    }

    public void longitud(Ahorcado a1) {

        System.out.println("La longitud de la palabra es de " + a1.getArray().length + " letras");

    }

    public void buscar(Ahorcado a1, String letra) {

        boolean logic = false;

        for (String array : a1.getArray()) {
            if (letra.equals(array)) {
                logic = true;
            }
        }

        if (logic == true) {
            System.out.println("La letra se encuentra en la palabra");
        } else {
            System.out.println("La letra no se encuentra en la palabra");
        }

    }

    public void encontradas(Ahorcado a1, String letra) {

        int suma = 0;

        for (String array : a1.getArray()) {
            if (letra.equals(array)) {
                suma = suma + 1;
                a1.setCantLetras(a1.getCantLetras() + 1);
            }
        }

        System.out.println("Numero de letras( encontradas, faltantes ): " + "(" + a1.getCantLetras() + "," + a1.getArray().length + ")");

    }

    public void intentos(Ahorcado a1) {

        a1.setCantJugadasMax(a1.getCantJugadasMax() - 1);

        System.out.println("Numero de intentos restantes: " + a1.getCantJugadasMax());

    }

    public void juego(Ahorcado a1) {

        boolean logic = false;

        crearJuego(a1);

        longitud(a1);

        for (int i = 0; i < a1.getCantJugadasMax(); i--) {

            System.out.println("Ingrese una letra a buscar en la palabra");
            String letra = scan.next();

            buscar(a1, letra);
            encontradas(a1, letra);
            intentos(a1);

            if (a1.getCantJugadasMax() == 0) {
                System.out.println("GAME OVER! Se quedo sin intentos");
                break;
            } else if (a1.getCantLetras() == a1.getArray().length) {
                System.out.println("WINNER Usted logro completar la palabra");
                break;
            }

        }

    }

}
