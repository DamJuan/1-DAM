import java.util.Scanner;

public class Depuracion3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //ejer1();
        //ejer2();
        //ejer3();
        //ejer4();
        ejer5();

    }

    public static void ejer1() {
        int n1, n2;

        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();

        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();

        if (n1 % 10 != n2 % 10) {

            System.out.println("Los números acaban con cifras distintas");

        } else {

            System.out.println("Los dos números acaban con la misma cifra");

        }

    }

    public static void ejer2() {

        int N;
        double factorial;

        do {

            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();

        } while (N < 0);

        for (int i = 1; i <= N; i++) {

            factorial = 1;
            for (int j = 1; j <= i; j++) {

                factorial *= j;

            }

            System.out.printf("%2d! = %.0f %n", i, factorial);

        }

    }

    public static void ejer3() {

        int i, suma = 0, n1, n2;

        System.out.print("Introduce primer número: ");
        n1 = sc.nextInt();

        System.out.print("Introduce segundo número: ");
        n2 = sc.nextInt();

        for (i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                suma = suma + i;
            }
        }

        if (suma != n2) {

            suma = 0;

            for (i = 1; i <= n2; i++) {
                if (n2 % i == 0) {
                    suma = suma + i;
                }
            }
            if (suma == n1) {
                System.out.println("No son Amigos");
            } else {
                System.out.println("Son amigos");
            }
        } else {
            System.out.println("No son amigos");
        }
    }

    public static void ejer4() {

        int i, N;
        int contMas = 0, contMenos = 0;
        double media = 0;

        do {
            System.out.print("Número de personas: ");
            N = sc.nextInt();
        } while (N < 0);

        double[] alto = new double[N + 1];

        System.out.println("Lectura de la altura de las personas: ");

        for (i = 1; i <= N; i++) {
            System.out.print("persona " + i + " = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i];
        }

        media /= N;

        for (i = 1; i < N; i++) {
            if (alto[i] > media) {
                contMas++;
            } else if (alto[i] < media) {
                contMenos++;
            }
        }

        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura superior a la media: " + contMas);
        System.out.println("Personas con estatura inferior a la media: " + contMenos);

    }



    public static void ejer5() {

        for (int i = 0; i <= 10; i++) {

            System.out.print(i == 3 ? "E" : i);

            for (int j = 0; j <= i; j++) {

                System.out.print(j == 3 ? "E" : j);

                for (int k = 0; k <= j; k++) {

                    System.out.print(k == 3 ? "E" : k);

                    for (int l = 0; l <= k; l++) {

                        for (int m = 0; m <= l; m++) {

                            System.out.println(m == 3 ? "E" : m);
                        }
                    }
                }
            }
        }

    }
}


