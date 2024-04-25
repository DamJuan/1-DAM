import java.util.Scanner;

public class RetoA {

    static Scanner sc = new Scanner(System.in);

    public static boolean casoDePrueba() {

        int cantNum = sc.nextInt();
        sc.nextLine();
        String numeros = sc.nextLine();
        String[] num = numeros.split(" ");

        boolean isCorrect = true;
        for (int i = 0; i < cantNum - 1; i++) {
            int numActual = Integer.parseInt(num[i]);
            int numSig = Integer.parseInt(num[i + 1]);
            if (Math.abs(numActual) < Math.abs(numSig)) {
                if (Math.signum(numActual) == Math.signum(numSig)) {
                    isCorrect = false;
                    break;
                }
            } else if (Math.signum(numActual) != Math.signum(numSig)) {
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }

    public static void main(String[] args) {

        int numCasos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCasos; i++) {
            if (casoDePrueba()) {
                System.out.println("CORRECTA");
            } else {
                System.out.println("INCORRECTA");
            }
        }
    }
}