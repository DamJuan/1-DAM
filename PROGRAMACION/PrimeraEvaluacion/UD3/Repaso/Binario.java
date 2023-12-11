package Repaso;

import java.util.Scanner;

public class Binario {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String usuario;
        int contador;

        while (true) {

            System.out.println("Escribe el numero para ver si es binario o no (o salir para salir)");

            usuario = sc.nextLine();

            if (usuario.equalsIgnoreCase("salir")) {
                System.out.println("¡Saliendo del programa!");
                break;

            } else {

                int longitud = usuario.length();

                boolean binario = true;

                for (contador = 0; contador < longitud; contador++) {

                    char num = usuario.charAt(contador);

                    if (num != '0' && num != '1') {
                        binario = false;
                    }
                }

                if (binario) {
                    System.out.println("La cadena introducida es binario");
                } else {
                    System.out.println("La cadena introducida no es binario");
                }
            }
        }

    }

}