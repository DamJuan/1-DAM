package PrimeraEvaluacion.UD4;

import java.util.Arrays;

public class arraysMulti {

    public static void main(String[] args) {

        //ejer1();
        //ejer2();
        //ejer3();

    }

    public static void ejer1() {

        int[][] nArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
        };

        for (int fila = 0; fila < nArray.length; fila++) {

            for (int columna = 0; columna < nArray[fila].length; columna++) {
                System.out.println(nArray[fila][columna]);
            }

            System.out.println();

        }

        System.out.println(Arrays.toString(nArray));

    }

    public static void ejer3() {

        int total = 0;

        int[][] nArray = new int[4][5];

        for (int fila = 0; fila < nArray.length; fila++) {

            int sumaFila = 0;

            for (int columna = 0; columna < nArray[fila].length; columna++) {
                int nAleatorio = (int) (Math.random() * 10);
                nArray[fila][columna] = nAleatorio;

                System.out.print(nArray[fila][columna] + " | ");
                sumaFila += nArray[fila][columna];

            }


            System.out.println(sumaFila);
            System.out.println();

        }

        for (int columna = 0; columna < nArray[columna].length; columna++) {

            int sumaColumna = 0;

            for (int fila = 0; fila < nArray[fila].length; fila++) {
                int nAleatorio = (int) (Math.random() * 10);
                nArray[fila][columna] = nAleatorio;

                System.out.print(nArray[fila][columna] + " | ");
                sumaColumna += nArray[fila][columna];

            }


            System.out.println(sumaColumna);
            System.out.println();

        }

    }

    public static void ejer2() {
        int total = 0;
        int[][] nArray = new int[4][5];

        for (int fila = 0; fila < nArray.length; fila++) {
            int sumaFila = 0;

            for (int columna = 0; columna < nArray[fila].length; columna++) {
                int nAleatorio = (int) (Math.random() * 10);
                nArray[fila][columna] = nAleatorio;

                System.out.print(nArray[fila][columna] + " | ") ;
                sumaFila += nArray[fila][columna];
            }

            System.out.println(sumaFila);
            System.out.println();

            total += sumaFila;
        }

        for (int columna = 0; columna < nArray[0].length; columna++) {
            int sumaColumna = 0;

            for (int fila = 0; fila < nArray.length; fila++) {
                sumaColumna += nArray[fila][columna];
            }

            System.out.print(sumaColumna + "  ");

            total += sumaColumna;

        }

        System.out.println(total);

    }


}