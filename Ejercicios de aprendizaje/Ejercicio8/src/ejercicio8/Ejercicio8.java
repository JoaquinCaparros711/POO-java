/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import ejercicio8.entidades.Cadena;
import ejercicio8.servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cadena cadena1 = new Cadena();
        CadenaServicio cS = new CadenaServicio();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.next();
        
        int longitud = frase.length();
        
        cadena1.setFrase(frase);
        cadena1.setLongitud(longitud);
        
        System.out.println("La cantidad de vocales que tiene la frase son: " + cS.mostrarVocales(cadena1));
        System.out.println("=============================================");
        System.out.println("La frase invertida: " + cS.invertirFrase(cadena1));
        System.out.println("=============================================");

        
        System.out.println("Ingresa una letra a buscar cuantas veces se repite en la frase");
        String letra = leer.next();
        
        System.out.println("La letra " + letra + " se repite " + cS.vecesRepetido(letra,cadena1) + " veces");
        System.out.println("=============================================");
        
        System.out.println("ingrese una nueva frase a comparar");
        String fraseNueva = leer.next();
        
        cS.compararLongitud(fraseNueva, cadena1);
        System.out.println("=============================================");
        
        System.out.println("ingrese una nueva frase para unir a la primer frase");
        String fraseUnir = leer.next();
        
        cS.unirFrases(fraseUnir, cadena1);
        
        cS.reemplazar( cadena1 );
        
        cS.contiene( cadena1 );
        
    }
    
}
