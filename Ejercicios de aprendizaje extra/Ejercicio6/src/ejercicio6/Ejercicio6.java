/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.entidades.Ahorcado;
import ejercicio6.servicios.AhorcadoServicios;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Ahorcado a1 = new Ahorcado();
        AhorcadoServicios aS = new AhorcadoServicios();
        
//        aS.crearJuego(a1);
        
//        System.out.println("Ingrese una letra a buscar en la palabra");
//        String letra = scan.next();
        
        aS.juego(a1);
        
    }
    
}
