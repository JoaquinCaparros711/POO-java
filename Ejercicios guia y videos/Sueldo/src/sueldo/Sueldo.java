/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

import sueldo.entidades.Vendedor;
import sueldo.servicios.VendedorServicio;

/**
 *
 * @author WIN11
 */
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VendedorServicio vS =  new VendedorServicio();
        Vendedor v1 = vS.altaVendedor();
        vS.SueldoMensual(v1);
        vS.Vacaciones(v1);
        
    }
    
}
