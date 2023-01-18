package juego;

public class Frases {
    private static String pista;
    private static String frase;
    public static int generador = new java.util.Random().nextInt(8);
    public static String generarFrase() {
        switch(generador){
            case 0:
                frase = "Bocadillo de tortilla";
                break;
            case 1:
                frase= "Jamon asado con patatas";
                break;
            case 2:
                frase= "Clara de limón";
                break;
            case 3:
                frase = "Sushi, onigiri y udon";
                break;
            case 4:
                frase = "Pablo Motos";
                break;
            case 5:
                frase = "Si tu me dices ven";
                break;
            case 6:
                frase = "Abel Ramon Caballero Alvarez";
                break;
            case 7:
                frase = "Teclado";
                break;
        }
        return frase;
    }
    
    public static String generarPista(){
        switch(generador){
            case 0:
                pista = "Comida de bar";
                break;
            case 1:
                pista = "Plato asado"; 
                break;
            case 2:
                pista = "Bebida alcoholica de verano";
                break;
            case 3:
                pista = "Tres orientales";
                break;
            case 4:
                pista = "Presentador Español";
                break;
            case 5:
                pista="Éxito del Cigala";
                break;
            case 6:
                pista="B-Boy, skater, bmexer, cantante y fan de las LED";
                break;
            case 7:
                pista = "Periferico del ordenador";
        }
        return pista;
    }
}
