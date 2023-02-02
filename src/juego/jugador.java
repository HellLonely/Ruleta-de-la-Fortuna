package juego;

import java.util.Scanner;

public class jugador {
    private String nombre;
    private int dineroJugador;
    private int numComodines;
    private String letra;


    public jugador (String nombre, int dineroJugador){
        this.nombre = nombre;
        this.dineroJugador = dineroJugador;
        byte numComodines = 0;
    }


    public static void adivinarLetra(String letra){
        Scanner input = new Scanner(System.in);
        desings.decirLetras();
        letra=input.next("[^aeiou]");
        System.out.print(letra);
    }


    public static void comprarVocal(String letra, int dineroJugador){
        Scanner input = new Scanner(System.in);
        desings.comprarVocales();
        letra=input.next("[a|e|i|o|u]");
        if(dineroJugador>=100){
        dineroJugador=dineroJugador-100;
        }else{
            System.out.println("No tienes dinero suficiente para comprar");
        }

    }


    public static void usarComodin(byte numComodines){
        if (numComodines>1){
            System.out.println("Has usado un comodin");
            numComodines=(byte)(numComodines-1);
        } else {
            System.out.println("No tienes comodines para usar");
        }
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
}
