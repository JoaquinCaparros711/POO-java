/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicios.PersonaServicio;

/**
 *
 * @author WIN11
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicio pS = new PersonaServicio();

        double pesoIdealPersonas = 0;
        double esMayorDeEdadPersonas = 0;

        for (int i = 0; i < 4; i++) {
            Persona p1 = pS.crearPersona();

            
            if (pS.esMayorDeEdad(p1) == true) {
                esMayorDeEdadPersonas = esMayorDeEdadPersonas + 1;
            }

            pesoIdealPersonas = pS.calcularIMC(p1) + pesoIdealPersonas;
            

        }

        double porcentajePesoideal = pesoIdealPersonas / 4;
        double porcentajeMayores = esMayorDeEdadPersonas / 4;
        porcentajePesoideal = 4 - porcentajePesoideal;
        porcentajeMayores = 4 - porcentajeMayores;
        
        System.out.println("El porcentaje de pesos ideales de 4 personas es de: " + porcentajePesoideal + "%");
        System.out.println("El porcentaje de mayores de edad de 4 personas es de: " + porcentajeMayores + "%");

    }

}
