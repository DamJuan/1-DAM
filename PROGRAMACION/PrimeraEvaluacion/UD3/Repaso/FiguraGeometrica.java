package Repaso;

import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {

        ejer1();

    }

    public static void ejer1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de filas: ");
        int filas = sc.nextInt();


        //Se hace la parte de arriba del rombo

        //Se inicia la variable num1 y si es menor se incrementa 2
        for (int num1 = 1; num1 <= filas; num1 ++) {

            for (int num2 = 0; num2 < num1; num2++) {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();


    }

}