package CajaAventura;

import java.util.Scanner;
import CajaAventura.*;

public class CajaMagica {
    private static Scanner sc = new Scanner(System.in);
    private static String objetoEnCaja;

    public static void main(String[] args) {
        Aventurero.jugarAventura();
        sc.close();
        System.out.println("Fin de la aventura.");
    }

    public static void verCaja() {
        if (objetoEnCaja == null || objetoEnCaja.isEmpty()) {
            System.out.println("La caja está vacía.");
            System.out.println("Deseas introducir un objeto? (s/n)");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                System.out.println("Introduce el objeto:");
                objetoEnCaja = sc.nextLine();
                System.out.println("Objeto introducido: " + objetoEnCaja);
            }
        } else {
            System.out.println("El objeto en la caja es: " + objetoEnCaja);
            System.out.println("Deseas coger el objeto? (s/n)");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                System.out.println("Has cogido el objeto: " + objetoEnCaja);
                objetoEnCaja = null;
            }
        }
    }

    public static void manejarObjeto() {
        if (objetoEnCaja != null && !objetoEnCaja.isEmpty()) {
            System.out.println("El objeto en la caja es: " + objetoEnCaja);
        } else {
            System.out.println("La caja está vacía.");
            System.out.println("Deseas introducir un objeto? (s/n)");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                System.out.println("Introduce el objeto:");
                objetoEnCaja = sc.nextLine();
                System.out.println("Objeto introducido: " + objetoEnCaja);
            }
        }
    }
}
