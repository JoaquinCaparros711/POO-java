/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.entidades;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Libro {

    //Atributos   
    public int isbn;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        if (numPag >= 0) {
            this.numPag = numPag;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }

}
