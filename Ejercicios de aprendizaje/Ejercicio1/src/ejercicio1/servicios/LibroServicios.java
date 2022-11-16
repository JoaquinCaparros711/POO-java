/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.servicios;

import ejercicio1.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class LibroServicios {
    
        private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

        public Libro cargarLibro() {

        System.out.println("Introducir ISBN");
        int isbn = leer.nextInt();

        System.out.println("Introducir titulo");
        String titulo = leer.next();

        System.out.println("Introducir autor");
        String autor = leer.next();
        
        System.out.println("Introducir numPag");
        int numPag = leer.nextInt();

        return new Libro(isbn, titulo, autor, numPag);

    }
    
}
