import java.util.Scanner;

public class RetoA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCasos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCasos; i++) {
            int numGlobos = Integer.parseInt(sc.nextLine());


            String cadenaValoresHelio = sc.nextLine();

            int[] valoresHelio = leerValoresHelio(cadenaValoresHelio, numGlobos);

            int valorMinimo = sacarValorMinimo(valoresHelio);

            int cantidadHelio = sacarHelioTotal(valoresHelio, valorMinimo);

            System.out.println(cantidadHelio);


        }
    }

    public static int[] leerValoresHelio(String cantHelio, int numGlobos) {
        String[] globos = cantHelio.split(" ");
        int[] globosInt = new int[numGlobos];

        for (int i = 0; i < globos.length; i++) {
            globosInt[i] = Integer.parseInt(globos[i]);
        }

        return globosInt;

    }

    public static int sacarValorMinimo(int[] globos) {

        int valorMinimo = globos[0];

        for (int i = 0; i < globos.length; i++) {
            if (globos[i] < valorMinimo) {
                valorMinimo = globos[i];
            }
        }

        return valorMinimo;
    }


    public static int sacarHelioTotal(int[] valoresHelio, int valorMinimo) {
        int helioTotal = 0;

        for (int i = 0; i < valoresHelio.length; i++) {

            if (valoresHelio[i] > valorMinimo) {
                helioTotal += valoresHelio[i] - valorMinimo;
            }

        }

        return helioTotal;
    }
//TODO retocar por cada caso de prueba sacar el valor correspondiente
}