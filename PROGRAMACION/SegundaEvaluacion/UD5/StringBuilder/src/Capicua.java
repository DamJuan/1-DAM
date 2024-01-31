import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (esCapicua(numero)) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }
    }

    private static boolean esCapicua(int numero) {
        String cadenaOriginal = Integer.toString(numero);

        StringBuffer stringBuffer = new StringBuffer(cadenaOriginal);

        stringBuffer.reverse();

        return cadenaOriginal.equals(stringBuffer.toString());
    }
}
