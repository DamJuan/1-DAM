package CajaAventura;

import java.util.Scanner;
import CajaAventura.*;

public class Aventurero {
    private static Scanner sc = new Scanner(System.in);
    private static CajaMagica caja = new CajaMagica();
    private static Weapon currentWeapon;

    public static void main(String[] args) {
        jugarAventura();
        sc.close();
        System.out.println("Fin de la aventura");
    }


    public static void jugarAventura() {
        do {
            System.out.println("Introduce el nombre de tu Aventurero: ");
            String nombre = sc.nextLine();

            System.out.println("Te has encontrado un monton de madera sin utilizar");
            mostrarOpcionesMadera();

            int eleccionMadera = obtenerOpcionMadera();
            switch (eleccionMadera) {
                case 1:
                    System.out.println("Has elegido crear un arma. Tienes dos crafteos posibles /n  1 Espada /n 2 Hacha");
                    int eleccionArmaWood = sc.nextInt();

                    switch (eleccionArmaWood) {
                        case 1:
                            //equipWeapon(Weapon.woodenSword, "Aventurero");
                            //System.out.println("Detalles del arma equipada:\n" + woodenSword.getWeaponDetails());
                            break;
                        case 2:
                            //equipWeapon(Weapon.woodenAxe, "Aventurero");
                            //System.out.println("Detalles del arma equipada:\n" + woodenAxe.getWeaponDetails());
                            break;
                        default:
                            System.out.println("El valor introducido no es una opción válida.");
                            break;
                    }
                case 2:
                    System.out.println("Has elegido dejar la madera. Podria haber sido util quizas");
                    break;
                default:
                    System.out.println("El valor introducido no es una opción válida.");
            }


            System.out.println("Enhorabuena Aventurero " + nombre + " has encontrado una caja magica");

            mostrarOpciones();
            int eleccion = obtenerOpcion();

            switch (eleccion) {
                case 1:
                    caja.verCaja();
                    break;
                case 2:
                    caja.manejarObjeto();
                    break;
                case 3:
                    System.out.println("Has elegido huir. Buena eleccion pero no honorable");
                    break;
                default:
                    System.out.println("El valor introducido no es una opción válida.");
            }

            System.out.println("Deseas hacer otra aventura Aventurero? (s/n)");
        }
        while (sc.nextLine().equalsIgnoreCase("s"));
    }

    // Método para cambiar el arma actual del aventurero
    public static void equipWeapon(Weapon newWeapon, String nombre) {
        currentWeapon = newWeapon;
        System.out.println(nombre + " ha equipado " + newWeapon.getName());
    }

    // Método para realizar un ataque
    public static void attack(String nombre) {
        if (currentWeapon != null) {
            System.out.println(nombre + " ha atacado con " + currentWeapon.getName() +
                    " causando " + currentWeapon.getDamage() + " puntos de daño.");
        } else {
            System.out.println("No tienes un arma equipada.");
        }
    }

    private static void mostrarOpcionesMadera() {
        System.out.println("Que desea hacer con la madera encontrada:");
        System.out.println(" 1.- Crear un arma  ");
        System.out.println(" 2.- No hacer nada ");
    }


    private static void mostrarOpciones() {
        System.out.println("Que desea hacer con la caja magica:");
        System.out.println(" 1.- Ver la caja ");
        System.out.println(" 2.- Meter un objeto ");
        System.out.println(" 3.- No hacer nada ");
    }

    private static int obtenerOpcion() {
        int eleccion = -1;
        do {
            try {
                eleccion = Integer.parseInt(sc.nextLine());
                if (eleccion < 1 || eleccion > 3) {
                    System.out.println("Por favor, ingresa una opción válida (1-3).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número.");
            }
        } while (eleccion < 1 || eleccion > 3);
        return eleccion;
    }

    private static int obtenerOpcionMadera() {
        int eleccionMadera = -1;
        do {
            try {
                eleccionMadera = Integer.parseInt(sc.nextLine());
                if (eleccionMadera < 1 || eleccionMadera > 2) {
                    System.out.println("Por favor, ingresa una opción válida (1-2).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número.");
            }
        } while (eleccionMadera < 1 || eleccionMadera > 2);
        return eleccionMadera;
    }
}
