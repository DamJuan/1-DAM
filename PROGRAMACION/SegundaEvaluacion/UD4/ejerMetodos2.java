package PrimeraEvaluacion.UD4;

import java.util.Arrays;
import java.util.Scanner;

public class ejerMetodos2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String vector[] = new String[5];

        System.out.println("Introduce 5 palabras: ");

        for (int contador = 0; contador < 5; contador++) {

            System.out.println("Palabra " + (contador + 1) + ": ");

            vector[contador] = sc.nextLine();

        }

        System.out.println("Introduce la palabra que quieras buscar: ");

        String palabraBuscada = sc.nextLine();

        int posicion = buscarPalabra(vector, palabraBuscada);

        if (posicion != -1) {
            System.out.println("La palabra '" + palabraBuscada + "' se encuentra en la posición " + (posicion + 1) + ".");
        } else {
            System.out.println("La palabra '" + palabraBuscada + "' no se encontró en el vector.");
        }


    }

    public static int buscarPalabra(String[] vector, String palabra) {

        for (int contador = 0; contador < vector.length; contador++) {

            if (vector[contador].equals(palabra)) {

                return contador;

            }

        }

        return -1;
    }

}
