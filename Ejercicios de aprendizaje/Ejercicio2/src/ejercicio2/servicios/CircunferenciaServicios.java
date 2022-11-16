/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicios;

import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class CircunferenciaServicios {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese el radio de la circunferencia:");
        double radio = leer.nextDouble();

        return new Circunferencia(radio);

    }
    
    public double area( double r) {
        
        double area = 3.14 * Math.pow(r, 2);
        
        return area;

    }
    
    public double perimetro( double r ) {
        
        double area = 2 * 3.14 * r;
        
        return area;

    }

}
