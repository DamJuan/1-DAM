package PrimeraEvaluacion.UD4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ejerMetodos {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {

        System.out.println("Introduce un numero entero");
        int num = sc.nextInt();

        double[] vector = new double[num];
        llenarVector(vector, num);

        double media = calcularmedia(vector, num);
        System.out.println("La media es: " + df.format(media));

        numCercanoMedia(vector, (int) media);

    }

    public static void llenarVector(double[] vector, int num) {
        for (int contador = 0; contador < num; contador++) {
            vector[contador] = Math.random() * 51;
            System.out.println(df.format(vector[contador]));
        }
    }

    public static double calcularmedia(double[] vector, int num) {

        double media = 0;

        for (int contador = 0; contador < vector.length; contador++) {

            media += vector[contador];
        }

        return media / vector.length;
    }


    public static double numCercanoMedia(double[] vector, int media) {

        double numCercano = vector[0];
        double diferenciaMinima = Math.abs(vector[0] - media);
        for (double num : vector) {
            double diferenciaActual = Math.abs(num - media);
            if (diferenciaActual < diferenciaMinima) {
                diferenciaMinima = diferenciaActual;
                numCercano = num;
            }
        }

        System.out.println("El número más cercano a la media es: " + df.format(numCercano)); // Corregido aquí

        return numCercano;
    }

}

