package juego;

import java.util.ArrayList;

public class Panel {
    static String panelJugadorAdivinar;
    static String PistaJugador;

    static ArrayList listaFrases = new ArrayList<String>();
    static ArrayList listaPistas = new ArrayList<String>();
    
    private static String pista;
    private static String frase;
    static int generador;

    static void IniciarPanelJuego(){
        panelJugadorAdivinar = generarFrase();
        PistaJugador =  generarPista();
        System.out.println("Pista del panel: " + PistaJugador);
    }




    public static void comprobarLetraJugador(char LetraEnviadaJugador){

        System.out.println(panelJugadorAdivinar);

       int lenghtPanelJugador = panelJugadorAdivinar.length();

        
        char[] characterStringConvert;
        characterStringConvert  = panelJugadorAdivinar.toCharArray();

        for (int i = 0; i < lenghtPanelJugador; i++){
            if(characterStringConvert[i] == LetraEnviadaJugador){
                System.out.println("Bien funciona");
            }
        }
        
        /*String[][] panelParaMostrar= new String [lenghtPanelJugador][2];*/
    }

    public static int random(){
        generador = new java.util.Random().nextInt(8);
        return generador;
    }
    
    public static void insertArrayListFrase(){
        listaFrases.add("Bocadillo de tortilla");
        listaFrases.add("Jamon asado con patatas");
        listaFrases.add("Clara de limón");
        listaFrases.add("Sushi, onigiri y udon");
        listaFrases.add("Pablo Motos");
        listaFrases.add("Si tu me dices ven");
        listaFrases.add("Abel Ramon Caballero Alvarez");
        listaFrases.add("Teclado y ratón");
    }

    public static void insertArrayListPista(){
        listaPistas.add("Pincho de bar");
        listaPistas.add("Plato asado");
        listaPistas.add("Bebida fría");
        listaPistas.add("3 asiáticos");
        listaPistas.add("Presentador español");
        listaPistas.add("Éxito del cigala");
        listaPistas.add("Skater, B-Boy, bmxer, fresstyler y fanático de las led");
        listaFrases.add("Periféricos del ordenador");
    }


    public static String generarFrase() {
        /*
         ! Se necesita generar siempre la frase para poder obtener la Pista
        */


        generador = random();
        insertArrayListFrase();
        String frase = (String) listaFrases.get(generador);
        return frase;
    }

    public static String generarPista(){
        insertArrayListPista();
        String PistaJugador = (String) listaPistas.get(generador);
        return PistaJugador;
    }
    
   public void borrarPanel() {
        listaFrases.remove(generador);
        listaPistas.remove(generador);
    }
}
