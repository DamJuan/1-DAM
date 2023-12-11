package Repaso;

import java.util.Scanner;

public class SumaPares {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();


    }


    public static void ejercicio1() {

        System.out.print("Introduce el límite inferior: ");
        int limiteInferior = sc.nextInt();
        System.out.print("Introduce el límite superior: ");
        int limiteSuperior = sc.nextInt();

        int suma = 0;

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 == 0) { // Verificar si el número es par
                suma += i;
            }
        }

        System.out.println("La suma de los números pares en el rango es: " + suma);

        sc.close();
    }


    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el límite inferior: ");
        int limiteInferior = sc.nextInt();
        System.out.print("Introduce el límite superior: ");
        int limiteSuperior = sc.nextInt();

        int suma = 0;

        if (limiteInferior % 2 != 0) {
            limiteInferior++; // Asegurarse de que el límite inferior sea par
        }

        for (int i = limiteInferior; i <= limiteSuperior; i += 2) {
            suma += i;
        }

        System.out.println("La suma de los números pares en el rango es: " + suma);
        sc.close();
    }

}
