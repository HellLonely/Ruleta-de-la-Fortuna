package juego;

import java.util.Scanner;

public class hub {
    public static void main(String[] args) {
        String nombre;
        desings.start2();
        Scanner input = new Scanner(System.in);
        desings.selectorJugadores();
        byte numJugadores = input.nextByte();

        desings.selectorNombre(numJugadores);
        jugador arrayJugadores[] = new jugador[numJugadores];
        
        for (int i=0; i<arrayJugadores.length; i++){
            System.out.print("Player "+i+" -> ");
            nombre = input.next();
            arrayJugadores[i] = new jugador(nombre, 0); 
        }

        for (int i = 0; i<arrayJugadores.length; i++){
            System.out.println("Nombre "+arrayJugadores[i].getNombre());
        }

        desings.pista();
        
    }
}


