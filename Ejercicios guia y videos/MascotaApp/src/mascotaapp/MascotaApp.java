package mascotaapp;

import mascotaapp.entidades.Mascota;
import mascotaapp.servicios.ServicioMascota;

public class MascotaApp {

    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();

        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1);

    }

}
