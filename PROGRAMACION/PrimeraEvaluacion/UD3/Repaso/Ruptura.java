package Repaso;

public class Ruptura {

    public static void main(String[] args) {

        //ejer1();
        //ejer2();
        ejer3();

    }


    public static void ejer1() {


        int a = 10, b = 20;

        if (a == 10) {

            for (a = 10; a <= b; a += 2) {

                if (a != 16) {

                    System.out.println(a);

                }
            }

        }


    }

    public static void ejer2() {


        int a = 10, b = 20;

        if (a == 10) {

            for (a = 10; a <= b; a++) {

                if (a != 16) {

                    System.out.println(a);

                }
            }

        }


    }

    public static void ejer3() {

        int numero = 10;

        while (true) {

            if (numero % 2 == 0 && numero != 16) {
                System.out.println(numero);
            }

            numero++;

            if (numero > 20) {
                break;
            }
        }


    }

}