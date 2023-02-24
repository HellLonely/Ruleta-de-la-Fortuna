package juego;

import java.util.Scanner;

public class hub {
    public static void main(String[] args) {
        String nombre;
        desings.start2();
        Scanner input = new Scanner(System.in);
        
        Juego.Comenzar();
        for (int i = 0; i <4 ; i++){
            Juego.Turnos();

            System.out.println("Este panel a finalizado\n Comienza otra partida \n");
        }
        
    }
}
