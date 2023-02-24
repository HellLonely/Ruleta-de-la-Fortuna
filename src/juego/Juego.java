package juego;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    static jugador[] arrayJugadores;
    private static String nome;
    private static Scanner input = new Scanner(System.in);
    private static char[] panel;
    private static byte numJugadores;
    static ArrayList listaLetrasProhibidas = new ArrayList<String>();


    public static void Comenzar(){
        desings.selectorJugadores();

        numJugadores = input.nextByte();

        arrayJugadores = new jugador[numJugadores];

        desings.selectorNombre();

        /*
         * Creacion de jugadores con un array de Juagador
        */

        for (int i=0; i<arrayJugadores.length; i++){
            System.out.print("Player "+i+" -> ");
            nome = input.next();
            arrayJugadores[i] = new jugador(nome, 50); 
        }
    }


    public static void Turnos(){
        int partidas = 0;

        /*
         * Cada partida se pone el dinero de los jugadores a cero
        */

        for(int i = 0; i < arrayJugadores.length; i++){
            arrayJugadores[i].setDinero(50);
        }

        Panel.IniciarPanelJuego();

        int money = 0;
        byte comodines=0;
        money = 0;

        Panel.generarArrayListFrase();
        while(partidas < 1){

            for(int i = 0; i < arrayJugadores.length; i++){

                boolean siguienteTurno = false;

                desings.separador();

                System.out.println("\n\nTurno de: "+arrayJugadores[i].getNombre());

                
                
                System.out.println("");
                
                boolean verificacionLetra = false;
                siguienteTurno = false;
                
                while(siguienteTurno == false){
                    verificacionLetra = false;

                    /* Tiro de ruleta */

                    nome = arrayJugadores[i].getNombre();
                    System.out.println("\n "+nome + " a tirado de la ruleta.  \n");
                    int ruletaOutput;
                    

                    ruletaOutput = ruleta.giro();

                    /*
                     * Switch que funciona segun la opcion del giro de la ruleta
                    */

                    switch (ruletaOutput){
                        case 1:
                        
                        comodines+=1;

                        break;
                        case 2:
                        
                        System.out.println("¿Quieres usar un comodin para seguir jugando [s/n]");
                        String comSelector = input.next();
                        if (comSelector.equals("n")){
                            siguienteTurno= true;
                        } else{
                            if (comodines>=1){
                            comodines-=1;
                            } else {
                                System.out.println("No tienes suficientes comodines");
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
                        break;

                    }

                    /* Tarea para clase
                     * 1. Crear un menu para cada opcion. (Facil)
                     * 2. Pulir los diseños de la interfaz. (Muy Facil, Opcional)
                    */

                    /* Solucionado
                     * 1. Print del dinero, ya muestra la cantidad de manera exacta.
                     * 2. Paso de turno al no tener comodines
                     * 3. Perdida de turno
                     * 4. Varias partidas
                    */

                    /*
                     * Menu de Juego
                    */

                    System.out.println("\nDinero: "+arrayJugadores[i].getDinero());
                    System.out.println("¿Que quieres hacer? \n (1) Probar una letra.\n (2) Resolver el panel.\n (3) Comprar una vocal\n");
                    int opcionMenuJugador = input.nextInt() ;
                    char letraIntroducidaJugador ;

                    Panel.mostrarPanel();

                    switch (opcionMenuJugador){
                        case 1:

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
                                }
                            }
                        break;

                        case 2:
                            boolean caso= Panel.resolverPanel();
                            if (caso==true){

                                Panel.borrarPanelOculto();
                                return;

                            }else{
                                System.out.println("¿Quieres usar un comodin [s/n]");
                        String comSelector = input.next();
                        if (comSelector.equals("n")){
                            siguienteTurno= true;
                        } else{
                            if (comodines>=1){
                            comodines-=1;


                            } else {
                                System.out.println("No tienes suficientes comodines\nPasamos al siguiente jugador \n");
                                siguienteTurno= true;
                            }
                        }
                            }
                        break;

                        case 3:

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
                                    }else{
                                        System.out.println("\nLa letra no puede ser una consonante");
                                    }
                            }

                            
                            }else{
                                System.out.println(" ");
                            }

                    }


                }
               
            }
            System.out.println("    ");
        }
    }
}