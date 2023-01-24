package juego;


public class FrasesLogic {

    public static void soutFrase(){
        String Phrase = Frases.generarFrase();
        String PhraseArray[] = Phrase.split(" ");
        for (int i = 0; i < PhraseArray.length; i++){
            for (int j = 0; j < PhraseArray[i].length();j++){
                System.out.print(PhraseArray[i].charAt(j));
            }
            System.out.println("    ");
        }
    }
}
