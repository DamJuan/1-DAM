public class valorCartasENUM {
    public enum valorCartas {
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, J, Q, K
    }

    public static void obtenerPuntos(valorCartas carta) {
        switch (carta) {
            case AS:
                System.out.println("El valor de la carta es 1");
                break;
            case DOS:
                System.out.println("El valor de la carta es 2");
                break;
            case TRES:
                System.out.println("El valor de la carta es 3");
                break;
            case CUATRO:
                System.out.println("El valor de la carta es 4");
                break;
            case CINCO:
                System.out.println("El valor de la carta es 5");
                break;
            case SEIS:
                System.out.println("El valor de la carta es 6");
                break;
            case SIETE:
                System.out.println("El valor de la carta es 7");
                break;
            case OCHO:
                System.out.println("El valor de la carta es 8");
                break;
            case NUEVE:
                System.out.println("El valor de la carta es 9");
                break;
            case DIEZ:
                System.out.println("El valor de la carta es 10");
                break;
            case J:
                System.out.println("El valor de la carta es 10");
                break;
            case Q:
                System.out.println("El valor de la carta es 10");
                break;
            case K:
                System.out.println("El valor de la carta es 10");
                break;
        }
    }


    public static void main(String[] args) {
        System.out.println("Que carta tienes?");
        valorCartas carta = valorCartas.AS;
        System.out.println(carta);
        obtenerPuntos(carta);

    }
}
