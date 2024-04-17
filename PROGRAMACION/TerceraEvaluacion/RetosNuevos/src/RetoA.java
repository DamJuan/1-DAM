import java.util.Scanner;

public class RetoA {
    static Scanner in = new Scanner(System.in);

    public static boolean casoDePrueba() {

        String input = in.nextLine();
        int[] array = intArray(input);

        if (array.length == 1) {
            return Boolean.FALSE;
        }

        imprimirPaginas(array);

        return Boolean.TRUE;

    }

    public static int[] intArray(String input) {
        String[] parts = input.split(" ");
        int[] res = new int[parts.length];
        for (int i = 0; i < parts.length; i++)
            res[i] = Integer.parseInt(parts[i]);
        return res;

    }

    public static void imprimirPaginas(int[] array) {
        StringBuilder sb  = new StringBuilder();
        boolean hayGuion = Boolean.FALSE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                break;
            }

            if (array[i] - array[i + 1] == -1) {
                if (!hayGuion) {
                    sb.append(array[i]).append("-");
                    hayGuion = Boolean.TRUE;
                }
            } else if (hayGuion) {
                sb.append(array[i]).append(",");
                hayGuion = Boolean.FALSE;
            } else {
                sb.append(array[i]).append(",");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }


    public static void main(String[] args) {
        boolean seguir = casoDePrueba();
        while (seguir) {
            seguir = casoDePrueba();
        }
    }
}