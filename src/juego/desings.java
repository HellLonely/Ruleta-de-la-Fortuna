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
