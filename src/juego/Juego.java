package juego;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    static jugador[] arrayJugadores;
    private static String nome;
    private static Scanner input = new Scanner(System.in);
    private static char[] panel;
    static ArrayList listaLetrasProhibidas = new ArrayList<String>();


    public static void Comenzar(){
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

        /* System.out.println(Frases.generarFrase());*/


        Panel.IniciarPanelJuego();


        
        while(turno < 1){
            /*System.out.println("Jugadores: "+arrayJugadores.length); */
            for(int i = 0; i < arrayJugadores.length; i++){
                desings.separador();
                System.out.println("Turno de: "+arrayJugadores[i].getNombre());


                nome = arrayJugadores[i].getNombre();
                System.out.println("\n"+nome + " a tirado de la ruleta.\n");
                int money = ruleta.giro();

                System.out.println("Introduce una letra: ");
                char letraIntroducidaJugador ;
                letraIntroducidaJugador = input.next().charAt(0);  

                Panel.comprobarLetraJugador(letraIntroducidaJugador);

                

                /**
                * ↓ Añadir dinero ↓
                */

                int numeroAciertosJugador = Panel.extraerNumeroAciertos();


                for(int j = 0; j<numeroAciertosJugador; j++){
                    arrayJugadores[i].añadirDinero(money);
                }
                Panel.resetCacheAciertos();

                

                System.out.println("\nTotal de dinero: "+arrayJugadores[i].getDinero());
                
            }
            System.out.println("    ");
            turno++;
        }
    }

    /*public static void generarPanel(){
        String frase = Frases.generarFrase();
        char[] c;
        c  = frase.toCharArray();

        for (int i = 0; i < c.length;i++) {
            System.out.print(c[i]);
        }
    }

    /*public static void advinarletra(){
        /*String letra = input.next();*/
        /*char text = letra.charAt(0);*/

       /*  String frase = Frases.generarFrase();
        char[] c;
        c  = frase.toCharArray();

        for (int i = 0; i < c.length;i++) {
            System.out.print(c[i]);
        }
    }*/



    public static void panelInicial(){
    }

}
