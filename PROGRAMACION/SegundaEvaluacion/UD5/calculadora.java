import java.util.Scanner;

public class calculadora {

    static double resultado = 0;
    static double num1, num2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String operando;

        do {
            System.out.println("Ingrese el primer número con el que quieras operar: ");
            num1 = sc.nextDouble();

            System.out.println("Ingrese el segundo númerocon el que quieras operar: ");
            num2 = sc.nextDouble();

            System.out.println("Seleccione la operación a realizar ( +, -, *, / o x para salir ): ");
            operando = String.valueOf(sc.next().charAt(0));

            switch (operando) {
                case "+":
                    sumar();
                    break;

                case "-":
                    restar();
                    break;

                case "*":
                    multiplicar();
                    break;

                case "/":
                    dividir();
                    break;

                case "x":
                    System.out.println("Saliendo de la calculadora.");

                    return;

                default:
                    System.out.println("Operación no válida.");
                    break;

            }

            System.out.println("El resultado es: " + resultado);
        } while (true);

    }


    //Estas son las operaciones que se pueden realizar
    static void sumar() {
        resultado = num1 + num2;
    }

    static void restar() {
        resultado = num1 - num2;
    }

    static void multiplicar() {
        resultado = num1 * num2;
    }

    static void dividir() {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}

