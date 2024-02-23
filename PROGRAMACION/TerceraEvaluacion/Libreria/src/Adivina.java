import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Adivina {

    static final int N_300 = 300;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int longitud;
        int numDeseado;

        System.out.print("Introduzca el tamaño del vector: ");
        longitud = sc.nextInt();

        int[] vector = new int[longitud];

        completarAleatorio(vector);

        System.out.print("Introduzca el ultimo digito (0 - 9): ");
        numDeseado = sc.nextInt();

        buscarDato(numDeseado, vector);

        sc.close();
    }


    public static void completarAleatorio(int[] vector) {
        Random randy = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = randy.nextInt(N_300) + 1;
        }
        System.out.println(Arrays.toString(vector));
    }

    public static void buscarDato(int deseado, int[] vector) {

        for (int j : vector) {

            if (j % 10 == deseado) {
                System.out.print(j + " ");
            }
        }
    }
}