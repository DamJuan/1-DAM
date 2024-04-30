import java.util.Scanner;

import Bingo.*;
import MultiplicationGame.*;
import Ahorcado.*;

public class Main {

    //TODO MEJORAR SISTEMA DE JUEGOS
    //TODO IMPLEMENTAR MEJORA BINGO
    //TODO AÑADIR EXCEPCIONES


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el juego:");
        System.out.println("1. Juego de Multiplicación");
        System.out.println("2. Juego del Ahorcado");
        System.out.println("3. Bingo");
        System.out.println("4. Hundir la flota (no implementado)");
        System.out.print("Ingrese su elección: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el número de jugadores para el Juego de Multiplicación: ");
                int numJugadoresMate = sc.nextInt();
                System.out.print("Ingrese el tipo de juego de multiplicación (2 o 3 jugadores): ");
                int tipoJuegoMate = sc.nextInt();
                MultiplicationGame game1;
                if (tipoJuegoMate == 2) {
                    game1 = new TwoPlayerGame(numJugadoresMate);
                } else if (tipoJuegoMate == 3) {
                    game1 = new ThreePlayerGame(numJugadoresMate);
                } else {
                    System.out.println("Tipo de juego de multiplicación no válido. Saliendo del programa.");
                    sc.close();
                    return;
                }
                game1.play();
                break;
            case 2:
                System.out.print("Ingrese el número de jugadores para el Juego del Ahorcado: ");
                int numJugadoresAhorcado = sc.nextInt();
                Ahorcado game2 = new Ahorcado(numJugadoresAhorcado);
                game2.Jugar();
                break;

            case 3:
                JuegoBingo.bingo();
                break;
            case 4:
                System.out.println("Hundir la flota no está implementado por el momento.");
                //TODO: Implementar juego de Hundir la flota
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
                break;
        }
        sc.close();
    }
}
