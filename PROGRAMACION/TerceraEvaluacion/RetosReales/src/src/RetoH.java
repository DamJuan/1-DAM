import java.util.Scanner;

public class RetoH {
    static Scanner sc = new Scanner(System.in);


    public static void casoDePrueba() {
        int participantes = sc.nextInt();
        int[] puntuaciones = new int[participantes];

        for (int i = 0; i < participantes; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            puntuaciones[i] = num;
        }
        int[] puntuacionesUnicas = new int[participantes];
        for (int i = 0; i < puntuaciones.length; i++) {
            if (esUnico(puntuaciones, puntuaciones[i])) {
                puntuacionesUnicas[i] = puntuaciones[i];
            }
        }
        //if (puntuacionesUnicas[0]) {
            //System.out.println(puntuacionesUnicas[0]);
        //}


    }

    public static boolean esUnico(int[] puntuaciones, int num) {

        for (int i = 0; i < puntuaciones.length; i++) {
            if (puntuaciones[i] == num) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {


        int numCasos = sc.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}