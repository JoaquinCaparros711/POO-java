/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo.servicios;

import java.util.Date;
import java.util.Scanner;
import sueldo.entidades.Vendedor;

/**
 *
 * @author WIN11
 */
public class VendedorServicio {

    Scanner leer = new Scanner(System.in);

    public Vendedor altaVendedor() {

        //Instanciar un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();

        //lleno los atributos
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar el vendedor");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar el vendedor");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año que comenzo a trabajar el vendedor");
        int anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);

        return v1;
    }

    public void SueldoMensual(Vendedor v1) {

        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        
        v1.setComisiones(ventas);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        
        System.out.println("El sueldo mensual del vendedor: "
        + v1.getNombre() + " es de $" + v1.getSueldoMensual());

    }
    
    public void Vacaciones(Vendedor v1) {

        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if ( antiguedad < 5 ) {
            System.out.println("Le corresponden 14 dias de vacaciones");
        } else if ( antiguedad < 10 ) {
            System.out.println("Le corresponden 21 dias");
        } else if ( antiguedad < 20 ) {
            System.out.println("Le corresponden 28 dias");
        } else if ( antiguedad > 20 ) {
            System.out.println("Le corresponden 35 dias");
        } else{
            System.out.println("El empleado tiene vacaciones proporcionales");
        }

    }

}
