/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import ejercicio4.servicios.RectanguloServicios;

/**
 *
 * @author WIN11
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RectanguloServicios RS = new RectanguloServicios();

        Rectangulo rectangulo1 = RS.crearRectangulo();

        int base = rectangulo1.getBase();
        int altura = rectangulo1.getAltura();

        int superficie = (int) RS.calcularSuperficie(base, altura);
        int perimetro = (int) RS.calcularPerimetro(base, altura);
        String[][] dibujarRectangulo = RS.dibujarRectangulo(base, altura);

        System.out.println("La superficie del rectangulo ingresado es: " + superficie);
        System.out.println("El perimetro del rectangulo ingresado es: " + perimetro);
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(dibujarRectangulo[i][j]);
            }
            System.out.println(" ");
        }

    }

}
