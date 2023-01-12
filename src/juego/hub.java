package juego;

import java.util.Scanner;

public class hub {
    public static void main(String[] args) {
        String nombre;
        desings.start();
        Scanner input = new Scanner(System.in);
        desings.selectorJugadores();
        byte numJugadores = input.nextByte();

        /*
         * Esta parte se encarga de pedir el nombre de los cuatro usuarios 
         */


        /*for (int i = 0; i < numJugadores; i+=1){
            switch (i) {
            case 0:
                System.out.print("Player 1 -> ");
                nombre = input.next();
                jugador jugador1;
                jugador1= new jugador(nombre);
                break;
            case 1:
                System.out.print("Player 2 -> ");
                nombre = input.next();
                jugador jugador2;
                jugador2= new jugador(nombre);
                break;
            case 2:
                System.out.print("Player 3 -> ");
                nombre = input.next();
                jugador jugador3;
                jugador3= new jugador(nombre);
                break;
            case 3:
                System.out.print("Player 4 -> ");
                nombre = input.next();
                jugador jugador4;
                jugador4= new jugador(nombre);
                break;
            }
        }*/

        /*
         * Esta parte se encarga de pedir el nombre de los cuatro usuarios 
        */

        desings.selectorNombre(numJugadores);
        jugador arrayJugadores[] = new jugador[numJugadores];
        
        for (int i=0; i<arrayJugadores.length; i++){
            System.out.print("Player "+i+" -> ");
            nombre = input.next();
            arrayJugadores[i] = new jugador(nombre); 
        }

        for (int i = 0; i<arrayJugadores.length; i++){
            System.out.println("Nombre "+arrayJugadores[i].getNombre());
        }


    }
}


