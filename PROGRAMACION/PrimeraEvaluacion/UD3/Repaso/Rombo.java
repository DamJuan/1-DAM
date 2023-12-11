package Repaso;

import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la mitad del ancho del rombo: ");
        int mitadAncho = sc.nextInt();

        ejer1(mitadAncho);
        sc.close();
    }

    public static void ejer1(int mitadAncho) {
        // Se utiliza directamente la mitad del ancho como altura
        int altura = mitadAncho;

        // Se hace la parte de arriba del rombo
        for (int num1 = 1; num1 <= altura * 2 - 1; num1 += 2) {
            int espacios = (altura * 2 - num1) / 2;
            for (int num2 = 0; num2 < espacios; num2++) {
                System.out.print(" ");
            }
            for (int num2 = 0; num2 < num1; num2++) {
                System.out.print("#");
            }
            System.out.println();
        }

        // Se hace la parte de abajo del rombo quitando la primera fila
        for (int num1 = altura * 2 - 3; num1 >= 1; num1 -= 2) {
            int espacios = (altura * 2 - num1) / 2;
            for (int num2 = 0; num2 < espacios; num2++) {
                System.out.print(" ");
            }
            for (int num2 = 0; num2 < num1; num2++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
