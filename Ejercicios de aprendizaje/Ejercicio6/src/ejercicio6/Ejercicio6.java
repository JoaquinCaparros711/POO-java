/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.entidades.Cafetera;

/**
 *
 * @author WIN11
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cafetera cafetera1 = new Cafetera();

        cafetera1.llenarCafetera();
        
        cafetera1.servirTaza();
        cafetera1.servirTaza();
        
        cafetera1.agregarCafe();
                
        
    }
    
}
