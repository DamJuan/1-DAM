import java.util.Scanner;

public class RetoB {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numProblemas = sc.nextInt();


        int[][] matriz = new int[numProblemas][3];
        for (int i = 0; i < numProblemas; i++) {
            matriz[i] = leerEntradas(sc.nextLine());
        }


    }

    public static int[] leerEntradas(String input) {
        String[] datosProblema = input.split(" ");
        int[] numerosProblema = new int[3];


        for (int i = 0; i < datosProblema.length; i++) {
            numerosProblema[i] = Integer.parseInt(datosProblema[i]);
        }


        return numerosProblema;

    }

    public static int[] ordenarArray(int[] numerosProblema) {
        int[] numerosOrdenados = new int[3];
        int aux = 0;

        for (int i = 0; i < numerosProblema.length; i++) {
            for (int j = 0; j < numerosProblema.length; j++) {
                if (numerosProblema[i] < numerosProblema[j]) {
                    aux = numerosProblema[i];
                    numerosProblema[i] = numerosProblema[j];
                    numerosProblema[j] = aux;
                }
            }
        }

        return numerosOrdenados;

    }
}
