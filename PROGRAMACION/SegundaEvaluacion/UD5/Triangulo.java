import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la altura del triangulo: ");
        int altura = scanner.nextInt();

        imprimirTriangulo(altura, 0);
    }

    public static void imprimirTriangulo(int altura, int linea) {

        if (linea < altura) {

            imprimirLinea(linea + 1);
            imprimirTriangulo(altura, linea + 1);

        }

    }

    public static void imprimirLinea(int longitud) {

        if(longitud > 0){

            System.out.print("*");
            imprimirLinea(longitud - 1);

        }else {

            System.out.println();

        }


    }
}
