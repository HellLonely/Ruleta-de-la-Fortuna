package juego;

import java.util.Scanner;

public class hub {
    public static void main(String[] args) {
        String nombre;
        desings.start2();
        desings.panelExample2();
        Scanner input = new Scanner(System.in);
        desings.selectorJugadores();
        byte numJugadores = input.nextByte();

        int turno = 0; /* Variable auxiliar */

        /*
         * Se nombran a los jugadores mediante un array de jugadores
        */

        desings.selectorNombre(numJugadores);
        jugador arrayJugadores[] = new jugador[numJugadores];
        
        for (int i=0; i<arrayJugadores.length; i++){
            System.out.print("Player "+i+" -> ");
            nombre = input.next();
            arrayJugadores[i] = new jugador(nombre, 0); 
        }

        /*
         * Sistema de turnos, funciona con un bucle. Hasta que el panel este resuelto 
        */
        /*FrasesLogic.soutFrase();*/

        

        desings.pista();
        while(turno < 1){
            for(int i = 0; i < arrayJugadores.length; i++){
                desings.separador();
                System.out.println("Turno de "+arrayJugadores[i].getNombre());
            }
            System.out.println("    ");
            turno++;
        }
        
    }
}


