/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.servicios;

import ejercicio8.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class CadenaServicio {

    public int mostrarVocales(Cadena c1) {

        int suma = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {

            String vocal = c1.getFrase().substring(i, i + 1);
            vocal = vocal.toLowerCase();

            if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) {
                suma = suma + 1;
            }

        }

        return suma;
    }

    public String invertirFrase(Cadena c1) {

        String cadenaInvertida = "";

        for (int indice = c1.getFrase().length() - 1; indice >= 0; indice--) {
            // Y vamos concatenando cada carácter a la nueva cadena
            cadenaInvertida += c1.getFrase().charAt(indice);
        }

        return cadenaInvertida;
    }

    public int vecesRepetido(String letra, Cadena c1) {

        int suma = 0;
        letra = letra.toLowerCase();

        for (int i = 0; i < c1.getLongitud(); i++) {

            String vocal = c1.getFrase().substring(i, i + 1);
            vocal = vocal.toLowerCase();

            if (vocal.equals(letra)) {
                suma++;
            }
        }

        return suma;
    }

    public void compararLongitud(String frase, Cadena c1) {

        if (frase.length() > c1.getLongitud()) {
            System.out.println("La nueva frase es mas larga");
        } else if (frase.length() < c1.getLongitud()) {
            System.out.println("La nueva frase es mas corta");
        } else {
            System.out.println("Las frases son iguales en longitud");
        }

    }

    public void unirFrases(String frase, Cadena c1) {

        String concatenada = frase + c1.getFrase();

        System.out.println("Las frases unidas: " + concatenada);

    }

    public void reemplazar(Cadena c1) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un caracter para cambiarlo por todas las 'a' que se encuentren en la frase");
        String letra = leer.next();

        if (letra.length() == 1) {

            for (int i = 0; i < c1.getLongitud(); i++) {

                String vocal = c1.getFrase().substring(i, i + 1);
                vocal = vocal.toLowerCase();

                if (vocal.equals("a")) {
                    vocal = letra;
                }

                System.out.print(vocal);
            }

        } else {
            System.out.println("La letra ingresada tiene mas de 1 caracter");
        }

    }

    public void contiene(Cadena c1) {

        Scanner leer = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Ingrese una letra para comprobar que se encuentre en la frase");
        String letra = leer.next();

        boolean logic = false;

        if (letra.length() == 1) {

            for (int i = 0; i < c1.getLongitud(); i++) {

                String vocal = c1.getFrase().substring(i, i + 1);
                vocal = vocal.toLowerCase();

                if (vocal.equals(letra)) {
                    logic = true;
                }

            }

        }
        
        System.out.println(logic);

    }

}
