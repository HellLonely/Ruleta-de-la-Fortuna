package juego;

public class ruleta{


    private static int selector;
    

    public static int giro(){
        int generador = new java.util.Random().nextInt(24);
        /**
        *Se genera un número aleatorio comprendido del 0 al 23
        */
        switch (generador) {
            case 0,1,2,3,4:
                selector=50;
                System.out.println("Has caido en 50 Euros \n");
                break;
            case 5,6,7,8,9:
                selector=150;
                System.out.println("Has caido en 150 Euros\n");
                break;
            case 10,11,12,13,14,15,16:
                selector=100;
                System.out.println("Has caido en 100 Euros\n");
                break;
            case 17,18:
                selector=200;
                System.out.println("Has caido en 200 Euros\n");
                break;
            case 19:
                System.out.println("Has ganado un comodín\n");
                selector=1;
                break;
            case 20:
                System.out.println("Has girado la ruleta y has perdido tu turno");
                selector=2;
                break;
            case 21:
                System.out.println("Has caido en 1/2, divides tu dinero a la mitad\n");
                selector=3;
                break;
            case 22:
                System.out.println("Has caido en x2, multiplicas tu dinero al doble\n");
                selector=4;
                break;
            case 23:
                System.out.println("Has quebrado\n");
                selector=5;
                break;
            default:
                throw new AssertionError();
        }

        return selector;

    }

}