package juego;

public class ruleta{


    private static int selector[]= new int [2];
    

    public static int giro(){
        int generador = new java.util.Random().nextInt(24);
        /**
        *Se genera un número aleatorio comprendido del 0 al 23
        */
        switch (generador) {
            case 0,1,2,3,4:
                selector[0]=50;
                System.out.println("Has caido en 50€");
                break;
            case 5,6,7,8,9:
                selector[0]=150;
                System.out.println("Has caido en 150€");
                break;
            case 10,11,12,13,14,15,16:
                selector[0]=100;
                System.out.println("Has caido en 100€");
                break;
            case 17,18:
                selector[0]=200;
                System.out.println("Has caido en 200€");
                break;
            case 19:
                System.out.println("Has ganado un comodín");
                selector[0]=0;
                selector[1]=1;
                break;
            case 20:
                System.out.println("Has perdido el turno");
                selector[0]=0;
                selector[1]=2;
                break;
            case 21:
                System.out.println("Has caido en 1/2, divides tu dinero a la mitad");
                selector[0]=0;
                selector[1]=3;
                break;
            case 22:
                System.out.println("Has caido en x2, multiplicas tu dinero al doble");
                selector[0]=0;
                selector[1]=4;
                break;
            case 23:
                System.out.println("Has quebrado");
                selector[0]=0;
                selector[1]=5;
                break;
            default:
                throw new AssertionError();
        }
        /*
        * El selector 0 indica el dinero, es decir 100, 50,200 o 150
        * 
        * El selector 1 indica casillas especiales, 1="Comodín", 2="P. turno", 3="1/2", 4="x2", 5="Quiebra"
        */

        return selector[0&1];

    }

}