package juego;

import java.util.Scanner;

public class hub {
    public static void main(String[] args) {
        String nombre;
        desings.start();
        Scanner input = new Scanner(System.in);
        desings.selectorJugadores();
        byte numJugadores = input.nextByte();
        for (int i = 0; i < numJugadores; i+=1){
            switch (i) {
            case 0:
                desings.selectorNombre();
                nombre = input.next();
                jugador jugador1;
                jugador1= new jugador(nombre);
                break;
            case 1:
                desings.selectorNombre();
                nombre = input.next();
                jugador jugador2;
                jugador2= new jugador(nombre);
                break;
            case 2:
                desings.selectorNombre();
                nombre = input.next();
                jugador jugador3;
                jugador3= new jugador(nombre);
                break;
            case 3:
                desings.selectorNombre();
                nombre = input.next();
                jugador jugador4;
                jugador4= new jugador(nombre);
                break;
        }

    }

}

}
