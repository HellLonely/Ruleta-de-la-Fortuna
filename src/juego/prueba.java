package juego;

public class prueba {
    static String[][] frdase = new String[11][2];
    
    public static void rellenararray(){

        String frase = "Pablo motos";
        char[] chara;
        chara  = frase.toCharArray();
        System.out.println(chara[1]);

        for (int i = 0; i < frdase.length; i++){
            String str = Character.toString(chara[i]);
            frdase[i] = str;
        }
    }
}
