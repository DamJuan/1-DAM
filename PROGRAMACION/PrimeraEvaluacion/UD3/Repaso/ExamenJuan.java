package Repaso;

import java.util.Scanner;

public class ExamenJuan {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();

    }

    public static void ejercicio1() {

        Scanner sc = new Scanner(System.in);

        String usuario;
        int numeroDiv;

        System.out.println("Introduce el numero que quieras comprobar: ");
        int numPar = sc.nextInt();

        while (true) {

            for (numeroDiv = 1; numeroDiv < numPar; numeroDiv++) {

                if (numeroDiv > numPar) {
                    break;
                }
            }

            System.out.println("CONTINUACION");

            double prueba = numPar % numeroDiv;

            System.out.println(prueba);


            if (numPar % numPar == 0 && numPar % 1 == 0 && numPar % numeroDiv + 1 != 0) {

                System.out.println("El numero es primo");
            } else {

                System.out.println("El numero no es primo");
            }


            System.out.println("Si quieres salir del programa escribe salir");
            usuario = sc.nextLine();

            if (usuario.equalsIgnoreCase("salir")) {
                System.out.println("¡Saliendo del programa!");
                System.exit(0);
            }

        }
    }


    public static void ejercicio2() {

        final int PRECIO_BASE = 8;
        final int PRECIO_MIER = 5;
        final int PRECIO_JUEV = 11;
        final double FIDELIDAD = 0.1;

        double total = 0;

        System.out.println("¿Cuantas personas van a ver la pelicula?");
        int num_entradas = sc.nextInt();

        System.out.printf("Escribe el numero de la semana que es hoy? %n ");
        System.out.printf("1- Lunes %n ");
        System.out.printf("2- Martes %n ");
        System.out.printf("3- Miercoles %n ");
        System.out.printf("4- Jueves %n ");
        System.out.printf("5- Viernes %n ");
        System.out.printf("6- Sabado %n ");
        System.out.printf("7- Domingo %n ");

        int dia_Sem = sc.nextInt();

        switch (dia_Sem) {

            case 1:

                System.out.println("Hoy es Lunes el precio de la entrada individual cuesta: " + PRECIO_BASE);

                total = num_entradas * PRECIO_BASE;
                break;

            case 2:

                System.out.println("Hoy es Martes el precio de la entrada individual cuesta: " + PRECIO_BASE);

                total = num_entradas * PRECIO_BASE;
                break;

            case 3:

                System.out.println("Hoy es Miercoles el precio de la entrada individual cuesta: " + PRECIO_MIER);

                total = num_entradas * PRECIO_MIER;

                break;

            case 4:

                System.out.println("Hoy es Jueves el precio de la entrada en pareja cuesta: " + PRECIO_JUEV);

                if (num_entradas % 2 == 0) {

                    num_entradas = num_entradas / 2;

                    total = num_entradas * PRECIO_JUEV;

                } else {

                    total = num_entradas * PRECIO_BASE;

                }
                break;

            case 5:

                System.out.println("Hoy es Viernes el precio de la entrada individual cuesta: " + PRECIO_BASE);

                total = num_entradas * PRECIO_BASE;
                break;

            case 6:

                System.out.println("Hoy es Sabado el precio de la entrada individual cuesta: " + PRECIO_BASE);

                total = num_entradas * PRECIO_BASE;
                break;

            case 7:

                System.out.println("Hoy es Domingo el precio de la entrada individual cuesta: " + PRECIO_BASE);

                total = num_entradas * PRECIO_BASE;
                break;

            default:

                System.out.println("El dia seleccionado no es correcto");
                System.exit(0);

        }

        System.out.printf("Tienes tarjeta de fidelizacion %n");
        System.out.printf("1- SI %n");
        System.out.printf("2- NO %n");


        int tarj_Fidelidad = sc.nextInt();

        if (tarj_Fidelidad == 1) {

            total = total - (total * FIDELIDAD);

            System.out.println("El total de entradas seleccionadas son: " + num_entradas + " el total a pagar son: " + total);
        } else {

            System.out.println("El total de entradas seleccionadas son: " + num_entradas + " el total a pagar son: " + total);

        }


        sc.close();
    }

}
