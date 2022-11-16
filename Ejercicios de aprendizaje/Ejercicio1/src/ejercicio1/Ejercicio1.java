
package ejercicio1;

import ejercicio1.entidades.Libro;
import ejercicio1.servicios.LibroServicios;

/**
 *
 * @author WIN11
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroServicios sl = new LibroServicios();

        Libro libro1 = sl.cargarLibro();
        
        System.out.println(libro1.toString());
          
        
    }

    
}
