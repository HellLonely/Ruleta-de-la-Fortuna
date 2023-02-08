package juego;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.event.PrintEvent;

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
            arrayJugadores[i] = new jugador(nome, 100); 
        }
    }



    public static void Turnos(){
        int turno = 0;

        /* System.out.println(Frases.generarFrase());*/


        Panel.IniciarPanelJuego();


        
        while(turno < 1){
            /*System.out.println("Jugadores: "+arrayJugadores.length); */
            for(int i = 0; i < arrayJugadores.length; i++){
                boolean siguienteTurno = false;
                desings.separador();
                System.out.println("Turno de: "+arrayJugadores[i].getNombre());
                
                boolean verificacionLetra = false;
                

                while(siguienteTurno == false){
                    verificacionLetra = false;

                    /* Tiro de ruleta */

                    nome = arrayJugadores[i].getNombre();
                    System.out.println("\n"+nome + " a tirado de la ruleta.\n");
                    int money = ruleta.giro();

                    /* Decir letra  */

                    char letraIntroducidaJugador ;
                    System.out.println("Introduce una letra: ");

                    while (verificacionLetra == false) {
                        /*"[^aeiou]" */
                        letraIntroducidaJugador = input.next().charAt(0); 
                        if (letraIntroducidaJugador == 'a' || letraIntroducidaJugador == 'e' || letraIntroducidaJugador == 'i' || letraIntroducidaJugador == 'o' || letraIntroducidaJugador == 'u'){
                            System.out.println("\nLa letra no puede ser una vocal");
                        } else{

                            Panel.comprobarLetraJugador(letraIntroducidaJugador); 
                            
                            int numeroAciertosJugador = Panel.extraerNumeroAciertos();


                            for(int j = 0; j<numeroAciertosJugador; j++){
                                arrayJugadores[i].añadirDinero(money);
                            }
                            Panel.resetCacheAciertos();

                            verificacionLetra = true;

                            System.out.println("\nTotal de dinero: "+arrayJugadores[i].getDinero());
                        }
                   }


                    /* Comprar vocal (opcional) */

                    System.out.println("\nQuieres comprar una vocal? Si/No");
                    String elecciónJugador = input.next();

                    boolean verificacionVocal=false;

                    if (elecciónJugador.equals("Si")){

                        System.out.println("\nIntroduce una vocal");
                        /*metodo vocal */
                        while (verificacionVocal == false) {
                            /*"[^aeiou]" */
                            letraIntroducidaJugador = input.next().charAt(0); 
                            if (letraIntroducidaJugador == ('a') || letraIntroducidaJugador == ('e') || letraIntroducidaJugador == 'i' || letraIntroducidaJugador == 'o' || letraIntroducidaJugador == 'u'){
                                
                                Panel.comprobarLetraJugador(letraIntroducidaJugador);  
                                verificacionVocal = true;
                                int dinero = arrayJugadores[i].getDinero();
                                dinero = dinero-100;
                                arrayJugadores[i].setDinero(dinero);
                            } else{
                                System.out.println("\nLa letra no puede ser una consonante");
                            }
                       }

                       System.out.println("\nTotal de dinero: "+arrayJugadores[i].getDinero());
                    }else{
                        System.out.println(" ");
                    }


                }
               
            
                /**
                * ↓ Añadir dinero ↓
                */

                

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

   /*  public static void selectorVocal(){
        System.out.println("Desea comprar una vocal");
        System.out.println("Si");
        System.out.println("No");
        String decidirComprarVocal= input.next();
        decidirComprarVocal= decidirComprarVocal.toLowerCase();
        decidirComprarVocal= decidirComprarVocal Strin
        if (decidirComprarVocal.equals("si")){
            jugador.comprarVocal(decidirComprarVocal, dineroJugador);
        }
    } */ 

    
    public static void gastarDineroVocal(int i){
        boolean verificacionVocal= false;
        char letraIntroducidaJugador ;
                System.out.println("Introduce una letra: ");
               while (verificacionVocal == false) {
                    /*"[^aeiou]" */
                    letraIntroducidaJugador = input.next().charAt(0); 
                    if (letraIntroducidaJugador != 'a' || letraIntroducidaJugador != 'e' || letraIntroducidaJugador != 'i' || letraIntroducidaJugador != 'o' || letraIntroducidaJugador != 'u'){
                        System.out.println("\nLa letra no puede ser una consonante");
                    } else{
                        Panel.comprobarLetraJugador(letraIntroducidaJugador);  
                        verificacionVocal = true;
                        int dinero = arrayJugadores[i].getDinero();
                        dinero = dinero-100;
                        arrayJugadores[i].setDinero(dinero);
                    }
               }
    }

}
