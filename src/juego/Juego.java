package juego;

import java.util.Scanner;

public class Juego {
    static jugador[] arrayJugadores;
    private static String nome;
    private static Scanner input = new Scanner(System.in);

    public static void Comenzar(){
        advinarletra();
        desings.selectorJugadores();
        byte numJugadores = input.nextByte();
        arrayJugadores = new jugador[numJugadores];
        desings.selectorNombre();
        for (int i=0; i<arrayJugadores.length; i++){
            System.out.print("Player "+i+" -> ");
            nome = input.next();
            arrayJugadores[i] = new jugador(nome, 0); 
        }
    }


    public static void Turnos(){
        int turno = 0;
        
        while(turno < 10){
            System.out.println("Jugadores: "+arrayJugadores.length);
            for(int i = 0; i < arrayJugadores.length; i++){
                desings.separador();
                nome = arrayJugadores[i].getNombre();
                int money = ruleta.giro();
                System.out.println("Output: " + money);
                arrayJugadores[i].añadirDinero(money);
                System.out.println(arrayJugadores[i].getDinero());
                System.out.println(arrayJugadores[i].getNombre());
            }
            System.out.println("    ");
            turno++;
        }
    }

    public static void advinarletra(){
        /*String letra = input.next();*/
        /*char text = letra.charAt(0);*/

        String frase = Frases.generarFrase();
        char[] c;
        c  = frase.toCharArray();

        for (int i = 0; i < c.length;i++) {
            System.out.print(c[i]);
        }
    }
}
