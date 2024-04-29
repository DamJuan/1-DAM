package Bingo;

import java.util.Scanner;

public class JuegoBingo {

    public static void bingo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos jugadores jugaran al Bingo?");
        int numJugadores = sc.nextInt();
        sc.nextLine();

        Jugador[] jugadores = new Jugador[numJugadores];

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Introduzca el nombre del jugador " + (i + 1) + ":");
            String nombre = sc.nextLine();
            System.out.println("Introduzca la ciudad del jugador " + (i + 1) + ":");
            String ciudad = sc.nextLine();
            System.out.println("Introduzca la edad del jugador " + (i + 1) + ":");
            int edad = sc.nextInt();
            sc.nextLine();
            jugadores[i] = new Jugador(nombre, ciudad, edad);
        }

        System.out.println("Los cartones se han generado correctamente.");

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Cartón del jugador " + (i + 1) + ":");
            jugadores[i].mostrarCarton();
            System.out.println();
        }

        System.out.println("¿Estais listos para empezar el juego? (s/n)");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Empezamos el juego.");
            jugarBingo(jugadores);
        } else {
            System.out.println("Saliendo del juego.");
            sc.close();
        }
    }

    public static void jugarBingo(Jugador[] jugadores) {
        int numGanadores = 0;
        int numBolas = 0;
        boolean bingo = false;
        while (!bingo) {
            numBolas++;
            System.out.println("Bola número " + numBolas + ":");
            int bola = (int) (Math.random() * 90) + 1;
            System.out.println("Bola: " + bola);
            for (int i = 0; i < jugadores.length; i++) {
                if (jugadores[i].contieneNumero(bola)) {
                    System.out.println("El jugador " + jugadores[i].getNombre() + " tiene el número " + bola + " en su cartón.");
                    if (jugadores[i].cartonCompletado()) {
                        System.out.println("El jugador " + jugadores[i].getNombre() + " ha completado el cartón.");
                        numGanadores++;
                        if (numGanadores == jugadores.length) {
                            bingo = true;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("¡BINGO!");
    }
}