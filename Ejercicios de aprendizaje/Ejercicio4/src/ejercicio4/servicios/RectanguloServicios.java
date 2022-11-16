/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.servicios;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class RectanguloServicios {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        System.out.println("Ingrese la base del rectangulo:");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo:");
        int altura = leer.nextInt();

        return new Rectangulo(base, altura);

    }
    
    public double calcularSuperficie(int base, int altura) {

        int superficie = base * altura;

        return superficie;

    }
    
    public double calcularPerimetro(int base, int altura) {

        int perimetro = ( base * 2 ) + ( altura * 2 );

        return perimetro;

    }
    
    public String[][] dibujarRectangulo(int base, int altura) {

        String matriz[][] = new String [altura][base];
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                matriz[i][j] = "*";
            }
        }

        return matriz;

    }
    
}
