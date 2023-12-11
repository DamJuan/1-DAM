package PrimeraEvaluacion.UD4;

import java.util.Arrays;

public class pruebasArrays {

    public static void main(String[] args) {

        //ejer1();
        //ejer2();
        //ejer3();
        //ejer4();
        //ejer5();
        ejer6();

    }

    public static void ejer1() {

        int[] nArray = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(nArray));

    }

    public static void ejer2() {

        int nuevoValor = 6;

        int[] nArray = {1, 2, 3, 4, 5};

        int[] nuevoArray = Arrays.copyOf(nArray, 6);

        int[] todoArray = Arrays.copyOf(nArray, nArray.length);

        int[] numArray = Arrays.copyOf(nArray, nArray.length + 1);
        numArray [nArray.length] = nuevoValor;



        System.out.println(Arrays.toString(nArray));
        System.out.println(Arrays.toString(nuevoArray));
        System.out.println(Arrays.toString(todoArray));
        System.out.println(Arrays.toString(numArray));


    }

    public static void ejer3() {

        int[] nArray = {1, 2, 3, 4, 5};

        int[] nuevoArray = Arrays.copyOfRange(nArray, 1, 4 );

        System.out.println(Arrays.toString(nuevoArray));

    }

    public static void ejer4() {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean igual = Arrays.equals(array1, array2);

        System.out.println("¿Los arrays son iguales? " + igual);


    }

    public static void ejer5() {

        String[] nArray = {"e", "c", "d", "a", "b"};

        Arrays.sort(nArray);

        for (int i = 0; i < nArray.length; i++) {
            System.out.println(nArray[i]);
        }

    }

    public static void ejer6() {

        String[] nArray = {"e", "c", "d", "a", "b"};

        Arrays.parallelSort(nArray, 0, 5);

        System.out.println(Arrays.toString(nArray));

    }

}
