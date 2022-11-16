/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.entidades;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Cafetera {

    Scanner leer = new Scanner(System.in);

    public int capacidadMaxima;
    public int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {

        capacidadMaxima = 2000;
        cantidadActual = capacidadMaxima;

        System.out.println("Cafetera llenada");

    }

    public void vaciarCafetera() {

        cantidadActual = 0;
        
        System.out.println("Cafetera vaciada");
        System.out.println("Cantidad actual: " + cantidadActual + "ml");

    }
    
    public void agregarCafe() {
        
        System.out.println("Ingresar cantidad de cafe a agregar: ");
        int agregado = leer.nextInt();
        
        if ( cantidadActual + agregado > 2000 ) {
            System.out.println("No se puede agregar mas, la cantidad maxima es 2000ml");
            System.out.println("La cantidad actual es de: " + cantidadActual + "ml");
        } else {
            cantidadActual = cantidadActual + agregado;
            System.out.println("La cantidad actual es de: " + cantidadActual + "ml");
        }


    }

    public void servirTaza() {

        System.out.println("Ingrese el tamaño de la taza");
        int tamanoTaza = leer.nextInt();
        int taza;

        if (cantidadActual >= tamanoTaza) {
            cantidadActual = cantidadActual - tamanoTaza;
            System.out.println("La taza se lleno y todavia queda cafe en la cafetera");
        } else if (cantidadActual < tamanoTaza) {
            taza = cantidadActual;
            cantidadActual = cantidadActual - tamanoTaza;
            System.out.println("La taza no se alcanzo a llenar del todo");
            System.out.println("lo que se alcanzo a llenar la taza es: " + taza + "ml");
        }

    }

}
