package MultiplicationGame;

import java.util.Scanner;
import MultiplicationGame.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el juego:");
        System.out.println("1. Juego de Multiplicación");
        System.out.println("2. Juego del Ahorcado");
        System.out.print("Ingrese su elección: ");
        int opcion = sc.nextInt();

        Juego juego;

        switch (opcion) {
            case 1:
                juego = new MultiplicationGame.Juego() {};
                break;
            case 2:
                juego = new Ahorcado();
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
                return;
        }

        juego.jugar();
        sc.close();
    }
}
