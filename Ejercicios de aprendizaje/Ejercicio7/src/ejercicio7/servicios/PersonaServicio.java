/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.servicios;

import ejercicio7.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        //Instanciar un objeto de tipo vendedor
        Persona p1 = new Persona();

        //lleno los atributos
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo de la persona (H, M, O)");
        p1.setSexo(leer.next());
        if ( !"H".equals(p1.getSexo()) || !"M".equals(p1.getSexo()) || !"O".equals(p1.getSexo())) {
            p1.setSexo("Valor incorrecto");
        }
        System.out.println("Ingrese el peso de la persona");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        p1.setAltura(leer.nextDouble());

        return p1;
    }
    
     public int calcularIMC( Persona p1 ) {

         int pesoIdeal = (int) (p1.getPeso()/(Math.pow(p1.getAltura(), 2)));
        
         if ( pesoIdeal < 20 ) {
             System.out.println("La persona esta por debajo de su peso ideal");
             pesoIdeal = -1;
         } else if ( pesoIdeal <= 25 && pesoIdeal >= 20) {
             System.out.println("La persona esta en su peso ideal");
             pesoIdeal = 0;
         } else if ( pesoIdeal > 25 ) {
             System.out.println("La persona esta en sobrepeso");
             pesoIdeal = 1;
         }

        return pesoIdeal;
    }
     
    /**
     *
     * @param p1
     * @return boolean
     */
    public boolean esMayorDeEdad( Persona p1 ){
        
        boolean booleano;
        
        booleano = p1.getEdad() >= 18;

        return booleano;
    }
    
}
