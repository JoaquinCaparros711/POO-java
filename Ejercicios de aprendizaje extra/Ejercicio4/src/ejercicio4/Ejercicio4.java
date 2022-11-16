/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.NIF;
import ejercicio4.servicios.NIFServicios;

/**
 *
 * @author WIN11
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NIF n1 = new NIF();
        
        NIFServicios nS = new NIFServicios();
        
        nS.crearNif(n1);
        nS.mostrar(n1);
        
    }
    
}
