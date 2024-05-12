package bingo;

import bingo.clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bingo {

    static Scanner sc = new Scanner(System.in);

    private static Logger LOGGER = LogManager.getLogger();

    static List<Jugador> jugadores = new ArrayList<>();
    static List<Carton> cartones = new ArrayList<>();
    static List<Integer> numerosSacados = new ArrayList<>();
    //final String CARPETA_PARTIDAS = "/bingo/partidas/";


    public static void main(String[] args) {

        //TODO Nacho: Falta implementar junto con los demás juegos

        System.out.println("Bienvenido al Bingo Vikingo");

        //cargarPartidaGuardada(); //TODO Nacho: Falta sistema de guardado y carga de partidas

        System.out.println("Cuantos personas van a jugar?");
        int numJugadores = sc.nextInt();

        for (int i = 1; i <= numJugadores; i++) {

            try {
                crearJugador(i);
            } catch (MenorDeEdadException e) {
                LOGGER.error(e.getMessage());
                jugadores.remove(jugadores.size() - 1);
            }
        }

        if (jugadores.size() > 1) {

            try {

                juego();
            } catch (InterruptedException e) {
                LOGGER.error("El programa ha sido interrumpido");
            } finally {
                sc.close();
            }
        } else {

            System.out.println("No hay suficientes jugadores para jugar. \n Adios. :)");
        }

    }

    private static void juego() throws InterruptedException {

        System.out.println("Estos son los cartones de los jugadores;");

        mostrarCartones(cartones);

        boolean respuesta = empezamos();

        if (respuesta) {
            System.out.println("Empecemos a jugar!");

            boolean acabar = Boolean.TRUE;

            while (acabar) {
                int num;
                do {
                    Thread.sleep(1000);
                    num = (int) (Math.random() * 90) + 1;
                } while (numerosSacados.contains(num));

                System.out.println("Número " + num);
                numerosSacados.add(num);

                acabar = revisionCartones(jugadores, cartones, num);

                /*
                if (numerosSacados.size() % 10 == 0) {
                    boolean seguirJugando = preguntarSeguirJugando();
                    if (!seguirJugando) {
                        guardarPartida();
                        break;
                    }
                }
                 */
            }

        } else {
            System.out.println("Adios. :)");
        }
    }

    private static boolean revisionCartones(List<Jugador> jugadores, List<Carton> cartones, int num) {
        int numCarton = 0;

        for (Jugador jugador : jugadores) {

            if (cartones.get(numCarton).comprobarNumero(num)) {

                System.out.println("El jugador " + jugador.getNombre() + " tiene ese número");
                cartones.get(numCarton).mostrarCartonCopia();
            }

            if (cartones.get(numCarton).comprobarBingo()) {

                ganador(jugador, cartones.get(numCarton));

                mostrarLosDemasCartones(jugadores, cartones, jugador);

                return Boolean.FALSE;
            }

            numCarton++;
        }
        return Boolean.TRUE;
    }

    private static void crearJugador ( int i) throws MenorDeEdadException {

        System.out.println("Nombre del Jugador " + i + ":");
        String nombre = sc.next();

        System.out.println("Ciudad del Jugador " + i + ":");
        String ciudad = sc.next();

        System.out.println("Edad del Jugador " + i + ":");
        int edad = sc.nextInt();

        sc.nextLine();

        Jugador jugador = new Jugador(nombre, ciudad, edad);
        jugadores.add(jugador);

        if (edad < 18) {
            throw new MenorDeEdadException(jugador);
        }

    }

    private static void mostrarCartones(List<Carton> cartones) {

        for (Jugador jugador : jugadores) {

            Carton carton = new Carton();
            cartones.add(carton);

            System.out.println("Carton de " + jugador.getNombre());
            carton.mostrarCarton();
        }
    }

    private static boolean empezamos() {

        System.out.println("Empezamos a jugar? (S/N)");
        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("S")) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    private static void ganador(Jugador jugador, Carton carton) {
        System.out.println("El jugador " + jugador.getNombre() + " cantó Bingo!");
        System.out.println(jugador);
        carton.mostrarCarton();
    }

    private static void mostrarLosDemasCartones(List<Jugador> jugadores, List<Carton> cartones, Jugador jugadorGanador) {
        int numCarton = 0;

        for (Jugador jugador : jugadores) {

            if (!jugadorGanador.equals(jugador)) {
                System.out.println("Carton de " + jugador.getNombre());
                cartones.get(numCarton).mostrarCarton();
            }

            numCarton++;
        }
    }

}
