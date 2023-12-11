import java.util.Scanner;

public class EncuentraLetra {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Ejercicio1();
        Ejercicio2();


    }

    public static void Ejercicio1() {


        //Pedir una frase
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();


        //Pedir una letra
        System.out.println("Introduce una letra");
        char letra = sc.nextLine().charAt(0);


        //Se inicia el contador para contar las veces que se repite la letra
        int contador = 0;

        //Recorrer la frase y contar cuántas veces aparece la letra
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }


        System.out.println("La letra: " + letra + " en la frase: " + frase + " se repite: " + contador);


    }

    public static void Ejercicio2() {


        //Pedir un mes
        System.out.println("Introduce un mes");
        int mes = sc.nextInt();

        //Pedir un año
        System.out.println("Introduce un año");
        int anio = sc.nextInt();

        switch (mes) {

            case 1, 3, 5, 7, 8, 10, 12:

                System.out.println("Tiene 31");
                break;

            case 4, 6, 9, 11:

                System.out.println("Tiene 30");
                break;

            case 2:


                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0 && anio % 100 == 0)) {

                    System.out.println("Tiene 29");

                } else {
                    System.out.println("Tiene 28");
                }

                break;

            default:

                System.out.println("No esta dentro del rango del 1-12");

                break;


        }

    }

}


