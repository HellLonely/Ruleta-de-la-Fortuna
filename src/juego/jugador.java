package juego;

import java.util.Scanner;

public class jugador{
    private String nombre;
    private int dineroJugador;
    private int numComodines;
    private String letra;


    public jugador (String nombre, int dineroJugador){
        this.nombre = nombre;
        this.dineroJugador = dineroJugador;
        byte numComodines = 0;
    }

    public void añadirDinero(int money){
        this.dineroJugador = dineroJugador + money;
    }

    public int getDinero() {
        return dineroJugador;
    }

    public void addComodin(int num){
        this.numComodines= this.numComodines + num;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getComodin() {
        return numComodines;
    }

    public void setDinero(int dineroJugador){
        this.dineroJugador = dineroJugador;
    }
}
