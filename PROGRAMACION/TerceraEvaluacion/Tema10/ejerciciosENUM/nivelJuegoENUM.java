public class nivelJuegoENUM {
    public enum nivelJuego {
        PRINCIPIANTE, INTERMEDIO, AVANZADO
    }

    public enum estadoJuego {
        INICIADO, EN_PROGRESO, PAUSADO, TERMINADO
    }

    public static boolean esAvanzado(nivelJuego nivel) {
        return nivel == nivelJuego.AVANZADO;
    }

    public static void mostrarEstado(estadoJuego estado) {
        switch (estado) {
            case INICIADO:
                System.out.println("El juego se ha iniciado");
                break;
            case EN_PROGRESO:
                System.out.println("El juego está en progreso");
                break;
            case PAUSADO:
                System.out.println("El juego está pausado");
                break;
            case TERMINADO:
                System.out.println("El juego ha terminado");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("En que nivel de juego estas? ");
        nivelJuego nivel = nivelJuego.AVANZADO;
        System.out.println(nivel);
        System.out.println("Es nivel avanzado? " + esAvanzado(nivel));

        System.out.println("Estado del juego:");
        estadoJuego estado = estadoJuego.EN_PROGRESO;
        mostrarEstado(estado);

    }
}
