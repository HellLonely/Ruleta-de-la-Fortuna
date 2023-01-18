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

    public static void selectorNombre(byte numJugadores){
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ Escribe el nombre de los "+numJugadores+" jugadores ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
    
    public static void selectorJugadores(){
        System.out.println("╔═════════════════════╗");
        System.out.println("║ Numero de jugadores ║");
        System.out.println("╚═════════════════════╝");
        System.out.print("$ -> ");
    }

    public static void panelExample(){
        String panelVision[][] = new String[5][10];

        /*
         * large1 es una variable que define el largo de la palabra, a palabra.lenght hay que sumarle 1 siempre
         */
        int large1 = 8;

        for (int i = 0; i < panelVision.length; i++) {
            for (int j = 0; j < panelVision[i].length; j++) {
                if (i == 0 || i == panelVision.length-1){
                    System.out.print(panelVision[i][j] = "═");
                }else if ( i == 1 && j >0 && j < large1){
                    System.out.print(panelVision[i][j] = "_");
                }
                else {
                    System.out.print(panelVision[i][j] = "■"); 
                }
            }
            System.out.println(" ");
        }
    }

    public static void pista(){
        System.out.println("╔═════════════════════╗");
        System.out.println("║  Comienza el juego  ║");
        System.out.println("╚═════════════════════╝");
        System.out.println("Pista -> " + Frases.generarPista());

    }
}
