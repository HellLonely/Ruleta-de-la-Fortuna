package juego;

import java.util.Scanner;

public class jugador {
    private String nombre;
    private int dineroJugador;
    private byte numComodines;
    private String letra;

    public jugador (String nombre){
        this.nombre=nombre;
    }

    public static void adivinarLetra(String letra){
        Scanner input = new Scanner(System.in);
        letra=input.next("[a-z]{1}");
        System.out.print(letra);
    }

    public void setDineroJugador(int dineroJugador) {
        this.dineroJugador = dineroJugador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
