
import java.util.Scanner;

public class RetoC {

    static Scanner sc = new Scanner(System.in);
    static final int[] array = llenarArray();


    public static void main(String[] args) {

        boolean seguir = casoDePrueba();
        while (seguir) {
            seguir = casoDePrueba();
        }

    }

    public static int[] llenarArray() {
        int[] array = new int[1414];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + i + 1;
        }
        return array;
    }


    public static boolean casoDePrueba() {

        int numeroUvas = sc.nextInt();
        sc.nextLine();

        if (numeroUvas == 0) {

            return Boolean.FALSE;

        }

        int numFilas = hallarFilaUvas(numeroUvas);
        System.out.println(numFilas);
        return Boolean.TRUE;


    }

    public static int hallarFilaUvas(int uvas) {
        for (int i = 0; i < array.length; i++) {
            if (uvas <= array[i]) {
                return (i + 1);

            }
        }
        return 0;
    }
}
