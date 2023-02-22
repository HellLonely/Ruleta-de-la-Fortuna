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
            arrayJugadores[i] = new jugador(nome, 50); 
        }
    }



    public static void Turnos(){
        int partidas = 0;

        /* System.out.println(Frases.generarFrase());*/


        Panel.IniciarPanelJuego();

        int money = 0;
        byte comodines=0;
        while(partidas < 1){
            /*System.out.println("Jugadores: "+arrayJugadores.length); */
            money = 0;

            for(int i = 0; i < arrayJugadores.length; i++){

                boolean siguienteTurno = false;

                desings.separador();

                System.out.println("Turno de: "+arrayJugadores[i].getNombre());

                System.out.println("Frase -----");
                Panel.generarArrayListFrase();
                
                System.out.println("");
                
                boolean verificacionLetra = false;
                
                while(siguienteTurno == false){
                    verificacionLetra = false;

                    /* Tiro de ruleta */

                    nome = arrayJugadores[i].getNombre();
                    System.out.println("\n"+nome + " a tirado de la ruleta.\n");
                    int ruletaOutput;
                    

                    ruletaOutput = ruleta.giro();

                    switch (ruletaOutput){
                        case 1:
                        
                        comodines+=1;

                        break;
                        case 2:
                        
                        System.out.println("¿Quieres usar un comodin [s/n]");
                        String comSelector = input.next();
                        if (comSelector.equals("n")){
                            siguienteTurno= true;
                        } else{
                            if (comodines>=1){
                            comodines-=1;
                            } else {
                                System.out.println("no tienes suficientes comodines");
                                siguienteTurno= true;
                            }
                        }
                        
                        break;
                        case 3:
                        
                        money=money/2;

                        break;
                        case 4:

                        money=money*2;
                        
                        break;
                        case 5:

                        money=0;
                        System.out.println("¿Quieres usar un comodin [s/n]");
                        String comSelector1 = input.next();
                        if (comSelector1.equals("n")){
                            siguienteTurno= true;
                        } else{
                            if (comodines>=1){
                            comodines-=1;
                            } else {
                                System.out.println("no tienes suficientes comodines");
                            }
                        }

                        break;
                        default:
                            money = ruletaOutput;
                             /* Decir letra  */

                    char letraIntroducidaJugador ;
                    Panel.mostrarPanel();

                    System.out.println("Introduce una letra: ");

                    while (verificacionLetra == false) {

                        /*"[^aeiou]" */
                        letraIntroducidaJugador = input.next().charAt(0); 
                        if (letraIntroducidaJugador == 'a' || letraIntroducidaJugador == 'e' || letraIntroducidaJugador == 'i' || letraIntroducidaJugador == 'o' || letraIntroducidaJugador == 'u'){
                            System.out.println("\nLa letra no puede ser una vocal");
                        } else{

                            Panel.comprobarLetraJugador(letraIntroducidaJugador); 
                            int numeroAciertosJugador = Panel.extraerNumeroAciertos();
                            
                            if (numeroAciertosJugador==0){
                                siguienteTurno= true;
                            }

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
                            if (letraIntroducidaJugador == 'a' || letraIntroducidaJugador == 'e' || letraIntroducidaJugador == 'i' || letraIntroducidaJugador == 'o' || letraIntroducidaJugador == 'u'){
                                
                                Panel.comprobarLetraJugador(letraIntroducidaJugador);  
                                verificacionVocal = true;
                                int dinero = arrayJugadores[i].getDinero();
                                dinero = dinero-50;
                                arrayJugadores[i].setDinero(dinero);
                            } else{
                                System.out.println("\nLa letra no puede ser una consonante");
                            }
                       }

                       System.out.println("\nTotal de dinero: "+arrayJugadores[i].getDinero());
                    }else{
                        System.out.println(" ");
                    }
                        break;

                    }

                }
               
                
            }
            System.out.println("    ");
            partidas++;
        }
    }
}