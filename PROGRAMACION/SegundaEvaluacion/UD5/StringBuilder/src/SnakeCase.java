import java.util.Scanner;

public class SnakeCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena en formato Camel Case: ");
        String camelCaseInput = sc.nextLine();

        String snakeCaseOutput = convertirASnakeCase(camelCaseInput);
        System.out.println("Cadena en Snake Case: " + snakeCaseOutput);
    }

    private static String convertirASnakeCase(String camelCaseInput) {
        StringBuilder snakeCaseBuilder = new StringBuilder();

        for (int i = 0; i < camelCaseInput.length(); i++) {
            char caracter = camelCaseInput.charAt(i);

            if (Character.isUpperCase(caracter) && i > 0) {
                snakeCaseBuilder.append("_");
            }

            snakeCaseBuilder.append(Character.toLowerCase(caracter));
        }

        return snakeCaseBuilder.toString();
    }
}
