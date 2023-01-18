package juego;

import java.util.Scanner;

public class jugador {
    private String nombre;
    private int dineroJugador;
    private byte numComodines;
    private String letra;

    public jugador (String nombre, int dineroJugador){
        this.nombre = nombre;
        this.dineroJugador = dineroJugador;
    }

    public static void adivinarLetra(String letra){
        Scanner input = new Scanner(System.in);
        letra=input.next("[^aeiou]");
        System.out.print(letra);
    }

    public static void comprarVocal(String letra, int dineroJugador){
        Scanner input = new Scanner(System.in);
        letra=input.next("[^aeiou]");

    }

    public void setDineroJugador(int dineroJugador) {
        this.dineroJugador = dineroJugador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
