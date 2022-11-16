/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.entidades;

/**
 *
 * @author WIN11
 */
public class Ahorcado {

    private int cantLetras;
    private int cantJugadasMax;
    private String[] array;

    public Ahorcado() {
    }

    public Ahorcado(int cantLetras, int cantJugadasMax, String[] array) {
        this.cantLetras = cantLetras;
        this.cantJugadasMax = cantJugadasMax;
        this.array = array;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
    
    

}
