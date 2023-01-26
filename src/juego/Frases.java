package juego;

import java.util.ArrayList;

public class Frases {
    private static String pista;
    private static String frase;
    static int generador;

    static ArrayList listaFrases = new ArrayList<String>();
    static ArrayList listaPistas = new ArrayList<String>();

    public static void random(){
        generador = new java.util.Random().nextInt(8);
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
        random();
        insertArrayListFrase();
        String frase = (String) listaFrases.get(generador);
        return frase;
    }

    public static String generarPista() {
        insertArrayListPista();
        String frase = (String) listaPistas.get(generador);
        return frase;
    }
    
}
