import java.util.Scanner;

public class Billete {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio1();

    }

    public static void ejercicio1() {


        double PrecioKm = 0, PrecioT, Descuento = 0;

        System.out.printf("|----------------------------------------------|%n");
        System.out.printf("|  Introduce los kilometros que va a realizar  |%n");
        double km = sc.nextInt();


        System.out.printf("| Introduce el tipo de billete que va adquirir |%n");
        System.out.printf("|          1: Sencillo (0,33 cada km)          |%n");
        System.out.printf("|        2: Ida y Vuelta (0,26 cada km)        |%n");
        int billete = sc.nextInt();
        if (billete == 1) {

            PrecioKm = km * 0.33;
            System.out.printf("Ha escogido el billete Sencillo%n");
            System.out.printf("El precio son : " + PrecioKm + "%n");


        } else if (billete == 2) {

            PrecioKm = km * 0.26;
            System.out.printf("Ha escogido el billete Ida Y Vuelta%n");
            System.out.printf("El precio son : " + PrecioKm + "%n");

        }

        if (PrecioKm >= 50 && PrecioKm < 110) {

            Descuento = PrecioKm * 0.5;
            System.out.printf("Su descuento es " + Descuento + "%n");

        } else if (PrecioKm >= 110) {

            Descuento = PrecioKm * 0.10;
            System.out.printf("Su descuento es " + Descuento + "%n");
        } else {

            Descuento = PrecioKm;

        }


        System.out.printf("|   ¿Tiene tarjeta cliente?  |%n");
        System.out.printf("|  1 - Si  |%n");
        System.out.printf("|  2 - No  |%n");
        int Tarjeta = sc.nextInt();

        if (Tarjeta == 1) {

            PrecioT = Descuento * 0.25;
            System.out.printf("|  El precio a pagar son : " + PrecioT + "%n");


        } else {

            PrecioT = Descuento;
            System.out.printf("|  El precio a pagar son : " + PrecioT + "%n");

        }


    }

}