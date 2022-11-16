/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.entidades.Circunferencia;
import ejercicio2.servicios.CircunferenciaServicios;

/**
 *
 * @author WIN11
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaServicios CS = new CircunferenciaServicios();
        
        Circunferencia C1 = CS.crearCircunferencia();
        double area = CS.area(C1.getRadio());
        double perimetro = CS.perimetro(C1.getRadio());
        
        System.out.println("El radio ingresado: " + C1.getRadio());
        System.out.println("El area de la circunferencia: " + area);
        System.out.println("El perimetro de la circunferencia: " + perimetro);   
        
    }
    
}
