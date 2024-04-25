import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Solicitar al usuario los dos operandos
            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();

            // Realizar la división
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Gracias por usar el programa.");
        }
    }
}
