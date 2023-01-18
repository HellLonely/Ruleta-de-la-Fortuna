package juego;

public class ruleta{

    private int cantidadDinero;

    public int giro(){
        int generador = new java.util.Random().nextInt(24);
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
                System.out.println("Has ganado un comodín");
                break;
            case 20:
                System.out.println("Has perdido el turno");
                break;
            case 21:
                System.out.println("Has caido en 1/2, divides tu dinero a la mitad");
                break;
            case 22:
                System.out.println("Has caido en x2, multiplicas tu dinero al doble");
                break;
            case 23:
                System.out.println("Has quebrado");
                break;
            default:
                throw new AssertionError();
        }
        return cantidadDinero;

    }

}