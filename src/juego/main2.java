package juego;

import java.util.ArrayList;

public class main2 {
    static ArrayList<ArrayList<Character>> letras = new ArrayList<>();
    public static void main(String[] args) {


        String frase = "Pablo motos";
        char[] fraseEjemplo;
        fraseEjemplo  = frase.toCharArray();
        
        String fraseJugador = "o";

        for (int i = 0; i < 5 ; ++i){
            System.out.println("    ");
        }
        
        añadirLetra(fraseEjemplo, fraseJugador);

        for (int i = 0; i < 5 ; ++i){
            System.out.println("    ");
        }
    }

    public static void imprimirFrase(char[] fraseEjemplo){
        for (int i = 0; i < fraseEjemplo.length; i++) {
            System.out.print(fraseEjemplo[i]);
        }
    }

    public static void añadirLetra(char[] fraseEjemplo, String fraseJugador){

        char[] fraseJugadorchar;
        fraseJugadorchar  = fraseJugador.toCharArray();

        System.out.println("    ");
        for (int i = 0; i < fraseJugadorchar.length; i++) {
            
            for(int j = 0; j < fraseEjemplo.length; j++) {
                char res = fraseEjemplo[j];
                char temp = fraseJugadorchar[i];
                try{
                   
    
                    if (temp == res){
                        System.out.print(fraseEjemplo[j]);
                    }else{
                        System.out.print("*");
                    }
                }
                catch(Exception e){
                    if (res == ' '){
                        System.out.print("_");
                    }else{
                        System.out.print("*");
                    }
                }
            }

        }
    }
}
