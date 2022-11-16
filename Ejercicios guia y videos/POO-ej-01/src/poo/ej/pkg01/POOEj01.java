/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej.pkg01;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author WIN11
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Joaquin");
        Persona persona2 = new Persona("Mariano");
        
        System.out.println(persona1.getNombre()); //Joaquin
        
        persona1.setNombre("Pedro");
        System.out.println(persona1.getNombre()); //Pedro
        
        PersonaService persServicio = new PersonaService();
        
        Persona persona3 = persServicio.crearPersona();
        System.out.println(persona3.nombre);

        
    }
    
}
