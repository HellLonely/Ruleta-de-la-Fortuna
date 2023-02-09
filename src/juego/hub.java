package juego;

import java.util.Scanner;

public class hub {
    public static void main(String[] args) {
        String nombre;
        desings.start2();
        Scanner input = new Scanner(System.in);
        
        Juego.Comenzar();
        Juego.Turnos();
    }
}
