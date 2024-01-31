import java.util.Scanner;

public class ConcatenarPalabras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la lista de palabras separadas por espacios: ");
        String listaPalabras = scanner.nextLine();

        String resultado = concatenarPalabras(listaPalabras);

        System.out.println("Resultado de la concatenación: " + resultado);
    }

    private static String concatenarPalabras(String listaPalabras) {
        String[] palabrasArray = listaPalabras.split("\\s+");

        StringBuilder resultadoBuilder = new StringBuilder();

        for (String palabra : palabrasArray) {
            resultadoBuilder.append(palabra);
        }

        return resultadoBuilder.toString();
    }
}
