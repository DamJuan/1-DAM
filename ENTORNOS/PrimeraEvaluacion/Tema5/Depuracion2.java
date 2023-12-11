import java.util.Scanner;

public class Depuracion2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //ejer1();
        //ejer2();
        ejer3();
        //ejer4();
        //ejer5();
        //ejer5();
        //ejer6();

    }


    public static void ejer1() {
        Scanner entrada = new Scanner(System.in);
        int numfiguras;
        do {
            System.out.print("¿Cuántas figuras quieres?");
            numfiguras = entrada.nextInt();
        } while (numfiguras < 2);

        int nfiguras = numfiguras;
        int numlinea;
        do {
            System.out.print("¿Cuántos asteriscos quieres?");
            numlinea = entrada.nextInt();
        } while (numlinea < 2);

        int numespacios = 0;
        int posasterisco;
        int nespacios;
        while (numlinea > 0) {
            numfiguras = nfiguras;
            posasterisco = numlinea;
            nespacios = numespacios;
            while (numfiguras > 0) {
                while (posasterisco > 0) {
                    for (int i = 0; i < posasterisco; i++) {
                        System.out.print("*");
                    }
                    posasterisco = 0;
                }
                while (nespacios-- > 0) {
                    System.out.print(" ");
                }
                if (numfiguras > 1) {
                    System.out.print("||");
                }
                numfiguras = numfiguras - 1;
            }
            System.out.println("");
            numlinea = numlinea - 1;
            numespacios = numespacios + 1;
        }
    }

    public static void ejer2() {

        int num, i, aux, cont, cifra;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero positivo: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Número no válido");
            }
        } while (num <= 0);

        aux = num;
        cont = 0;
        while (aux != 0) {
            aux = aux / 10;
            cont++;
        }

        for (i = cont - 1; i >= 0; i--) {
            cifra = num / (int) Math.pow(10, i);
            switch (cifra) {
                case 0:
                    System.out.print("cero");
                    break;
                case 1:
                    System.out.print("uno");
                    break;
                case 2:
                    System.out.print("dos");
                    break;
                case 3:
                    System.out.print("tres");
                    break;
                case 4:
                    System.out.print("cuatro");
                    break;
                case 5:
                    System.out.print("cinco");
                    break;
                case 6:
                    System.out.print("seis");
                    break;
                case 7:
                    System.out.print("siete");
                    break;
                case 8:
                    System.out.print("ocho");
                    break;
                case 9:
                    System.out.print("nueve");
                    break;
            }
            if (i != 0) {
                System.out.print(" - ");
            }
            num = num % (int) Math.pow(10, i);
        }
        System.out.println();
        System.out.println("Fin de programa");
    }

    public static void ejer3() {
        int N, aux, cifra, numeroCifras = 0;
        double suma = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Error. Debe ser un número positivo");
            }
        } while (N <= 0);

        aux = N;

        while (aux != 0) {
            numeroCifras++;
            aux = aux / 10;
        }

        aux = N;

        while (aux != 0) {
            cifra = aux % 10;
            suma += Math.pow(cifra, numeroCifras);
            aux = aux / 10;
        }

        if (suma == N) {
            System.out.println("Es un número narcisista");
        } else {
            System.out.println("No es un número narcisista");
        }
    }
}
