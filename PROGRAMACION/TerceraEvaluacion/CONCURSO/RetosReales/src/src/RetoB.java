import java.util.Scanner;

public class RetoB {

    static Scanner sc = new Scanner(System.in);

    public static void casoDePrueba() {

        String linea = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < linea.length(); i++) {

            if (linea.charAt(i) == '1') {
                contador++;
            }
        }
        if (linea.length() - contador == contador) {
            if (linea.length() >= 4 && linea.substring(0, 2).equals(linea.substring(linea.length() - 2, linea.length()))) {
                System.out.println("EQUILIBRADA");

            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public static void main(String[] args) {



        int numCasos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }

    }
}