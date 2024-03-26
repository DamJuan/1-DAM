import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String[] paraules = {"hola1", "hola2", "hola3", "hola4"};
        int[] nums = {1, 2, 3, 4};
        double[] reals = {1.1, 2.2, 3.3, 4.4};

        try {
            PrintWriter printWriter = new PrintWriter("ficheroPrint.txt");
            for (int i = 0; i < paraules.length; i++) {
                printWriter.print(paraules[i] + " ");
                printWriter.println(nums[i] + " ");
                printWriter.printf("%.1f",reals[i]);
            }

            printWriter.close();
            System.out.println("Datos escritos en el fichero ficheroPrint.txt.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }


        try {
            Scanner sc = new Scanner(new File("ficheroPrint.txt"));
            while (sc.hasNext()) {
                String palabra = sc.next();
                int numero = sc.nextInt();
                double real = sc.nextDouble();
                System.out.println("Palabra: " + palabra + ", Número: " + numero + ", Real: " + real);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró.");
            e.printStackTrace();
        }
    }
}
