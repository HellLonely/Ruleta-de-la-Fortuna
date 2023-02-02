package juego;

public class desings {
    public static void start2(){
        String arrayText[] = new String[7];
        arrayText[0] = "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ \n";
        arrayText[1] = "        __________      .__          __               .___       .__             _________                     __          ";
        arrayText[2] = "        \\______   \\__ __|  |   _____/  |______      __| _/____   |  | _____     /   _____/__ __   ____________/  |_  ____  ";
        arrayText[3] = "         |       _/  |  \\  | _/ __ \\   __\\__  \\    / __ |/ __ \\  |  | \\__  \\    \\_____  \\|  |  \\_/ __ \\_  __ \\   __\\/ __ \\ ";
        arrayText[4] = "         |    |   \\  |  /  |_\\  ___/|  |  / __ \\_ / /_/ \\  ___/  |  |__/ __ \\_  /        \\  |  /\\  ___/|  | \\/|  | \\  ___/ ";
        arrayText[5] = "         |____|_  /____/|____/\\___  >__| (____  / \\____ |\\___  > |____(____  / /_______  /____/  \\___  >__|   |__|  \\___  >";
        arrayText[6] ="                \\/                \\/          \\/       \\/    \\/            \\/          \\/            \\/                 \\/ \n";
        for (int i = 0; i < arrayText.length; i++) {
            /*
             * Eliminación de la ultima fila
             ! No se usa !
             if (i == 7){
                System.out.println(arrayText[0]);
                }
            */
            System.out.println(arrayText[i]);
        }
    }

    public static void selectorNombre(){
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ Escribe el nombre de los jugadores   ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
    
    public static void selectorJugadores(){
        System.out.println("╔═════════════════════╗");
        System.out.println("║ Numero de jugadores ║");
        System.out.println("╚═════════════════════╝");
        System.out.print("$ -> ");
    }

    /*public static void panelExample(){
        String panelVision[][] = new String[5][10];

        /*
         * large1 es una variable que define el largo de la palabra, a palabra.lenght hay que sumarle 1 siempre
         */
        int large1 = 8;

       /* for (int i = 0; i < panelVision.length; i++) {
            for (int j = 0; j < panelVision[i].length; j++) {
                if (i == 0 || i == panelVision.length-1){
                    System.out.print(panelVision[i][j] = "═");
                }else if ( i == 1 && j >0 && j < large1){
                    String Phrase = Frases.generarFrase();
                    String PhraseArray[] = Phrase.split(" ");
                    for (int k = 0; k < PhraseArray.length; k++){
                        for (int l = 0; l < PhraseArray[k].length();l++){
                            System.out.print(PhraseArray[k].charAt(l));
                        }
                        System.out.println("    ");
                    }
                }
                else {
                    System.out.print(panelVision[i][j] = "■"); 
                }
            }
            System.out.println(" ");
        }
    }*/

    /*public static void panelExample2(){
        String panelHidden [][] = new String[3][1];
        String Phrase = Frases.generarFrase();

        char [] aPhrase = Phrase.toCharArray();

        for (int i = 0; i <panelHidden.length; i++){
            if (i == 0 || i == 2){
                separador2();
            }
            else {
                for (int j = 0; j < aPhrase.length; j++){

                    if (aPhrase[j] == ' '){
                        System.out.print("_");
                    }else{
                        System.out.print(aPhrase[j]);
                    }
                }
            }
        }
    }*/

    public static void pista(){
        System.out.println("╔═════════════════════╗");
        System.out.println("║  Comienza el juego  ║");
        System.out.println("╚═════════════════════╝");

    }

    public static void tiradaRuleta(String usuario){
        System.out.println("Le toca tirar de la ruleta a  " + usuario);
        System.out.println("    ");
    }

    public static void separador(){
        System.out.println("\n -_-_-_-_-_-_-_-_-_-_-_- \n");
    }
    public static void separador2(){
        System.out.println("\n|---------------------------------------|");
    }

    public static void decirLetras(){
        System.out.println("╔════════════════════╗");
        System.out.println("║    Adivina letra   ║");
        System.out.println("╚════════════════════╝");
    }

    public static void comprarVocales(){
        System.out.println("╔════════════════════╗");
        System.out.println("║   Compra vocales   ║");
        System.out.println("╚════════════════════╝");
    }
}
