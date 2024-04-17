import java.util.Scanner;
public class RetoD {

    static Scanner sc = new Scanner(System.in);


    public static void casoDePrueba() {

     String nombre = sc.nextLine();
     String parentesco = sc.nextLine();

     if (parentesco.equals("padre") && nombre.equals("Luke")) {
         System.out.println("TOP SECRET");
     } else {
         System.out.println( nombre + ", yo soy tu " + parentesco);
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