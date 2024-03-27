import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Selecciona la operacion que desea realizar: \n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicacion\n" +
                "4. Division\n");

        int operacion = sc.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + multiplicar(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero.");
                } else {
                    System.out.println("El resultado de la division es: " + division(num1, num2));
                }
                break;
            default:
                System.out.println("Operacion invalida.");
        }

        sc.close();
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return (double) num1 / num2;
    }

}
