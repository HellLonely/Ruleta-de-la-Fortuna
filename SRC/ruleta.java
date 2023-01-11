package SRC;

public class ruleta{

    private int cantidadDinero;

    public static void giro(int cantidadDinero){
        int generador = new java.util.Random().nextInt(22);
        switch (generador) {
            case 0,1,2,3,4:
                cantidadDinero=150;
                System.out.println("Has caido en 50€");
                break;
            case 5,6,7,8,9:
                cantidadDinero=50;
                System.out.println("Has caido en 150€");
                break;
            case 10,11,12,13,14,15,16:
                cantidadDinero=100;
                System.out.println("Has caido en 100€");
                break;
            case 17,18:
                cantidadDinero=200;
                System.out.println("Has caido en 200€");
                break;
            case 19:
                
            default:
                throw new AssertionError();
        }

    }

}