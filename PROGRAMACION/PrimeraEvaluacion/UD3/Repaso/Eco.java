package Repaso;

import java.util.Scanner;
public class Eco {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ejer1();


    }

    public static void ejer1() {

        String usuario;

        System.out.println("Escribe algo (o 'salir' para finalizar):");

        while (true) {
            usuario = sc.nextLine();

            System.out.println("Has escrito: " + usuario);

            if (usuario.equalsIgnoreCase("salir")) {
                System.out.println("¡Saliendo del programa!");
                break;
            }
        }


    }


}