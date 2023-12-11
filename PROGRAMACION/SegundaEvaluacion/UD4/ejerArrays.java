package PrimeraEvaluacion.UD4;

import java.util.Arrays;
import java.util.Scanner;

public class ejerArrays {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //ejer1();
        //ejer2();
        //ejer3();
        ejer4();

    }

    public static void ejer1() {

        int[] nArray = {1, 2, 3, 4, 5};

        for (int i = nArray.length - 1; i >= 0; i--) {
            System.out.println(nArray[i]);
        }

    }

    public static void ejer2() {

        int[] nArray = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < nArray.length; i++) {
            suma += nArray[i];
        }

        System.out.println(suma);

    }

    public static void ejer3() {

        int[] nArray = {1, 2, 3, 4, 5};
        int mayor = 0;

        for (int i = 0; i < nArray.length; i++) {
            mayor = Math.max(mayor, nArray[i]);
        }

        System.out.println(mayor);

    }

    public static void ejer4() {
        String[] nArray = {"e", "c", "d", "a", "b"};

        Arrays.sort(nArray);

        for (int i = 0; i < nArray.length; i++) {
            System.out.println(nArray[i]);
        }
    }

}
