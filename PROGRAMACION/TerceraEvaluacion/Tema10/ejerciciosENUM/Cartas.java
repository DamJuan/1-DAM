public class Cartas {
    public enum ValorCarta {
        AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), JACK(10), REINA(10), REY(10);

        private final int puntos;

        ValorCarta(int puntos) {
            this.puntos = puntos;
        }

        public int obtenerPuntos() {
            return puntos;
        }
    }

    public static void main(String[] args) {
        // Casos de prueba
        System.out.println(ValorCarta.AS + " vale " + ValorCarta.AS.obtenerPuntos() + " puntos.");
        System.out.println(ValorCarta.DOS + " vale " + ValorCarta.DOS.obtenerPuntos() + " puntos.");
        System.out.println(ValorCarta.JACK + " vale " + ValorCarta.JACK.obtenerPuntos() + " puntos.");
    }
}
