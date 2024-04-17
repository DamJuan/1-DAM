import java.util.Scanner;

public class RetoB {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        personas();

    }


    public static void personas() {

        int numCasos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCasos; i++) {
            if (numCasos == 0) {
                break;
            }

            String fecha = sc.nextLine();




        }



        //TODO 4: Si hay mes y dia igual se devuelve un si
        //TODO 5: Si no se devuelve un no


    }


    public static void mes(String fecha){
        String[] parts = fecha.split(" ");

        for(int i = 0; i < parts.length; i++) {
            
        }


    }
}
