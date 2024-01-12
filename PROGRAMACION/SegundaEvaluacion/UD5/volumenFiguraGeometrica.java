import java.util.Scanner;

public class volumenFiguraGeometrica {

    static String tipoFigura;
    static double medida1, medida2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Volumen de Figuras Geométricas");
        System.out.println("Ingrese el tipo de figura (esfera, cubo, cilindro):");
        tipoFigura = sc.nextLine().toLowerCase();

            switch (tipoFigura) {
                case "Esfera":
                    System.out.println("Ingrese el radio de la esfera:");
                    medida1 = sc.nextDouble();
                    calcularVolumenEsfera();
                    break;

                case "Cubo":
                    System.out.println("Ingrese el lado del cubo:");
                    medida1 = sc.nextDouble();
                    calcularVolumenCubo();
                    break;

                case "Cilindro":
                    System.out.println("Ingrese el radio del cilindro:");
                    medida1 = sc.nextDouble();
                    System.out.println("Ingrese la altura del cilindro:");
                    medida2 = sc.nextDouble();
                    calcularVolumenCilindro();
                    break;

                case "exit":
                    System.out.println("Saliendo del programa.");
                    return;

                default:
                    System.out.println("Operación no válida.");
                    break;

            }


    }

    //Estas son las operaciones que se pueden realizar
    public static void calcularVolumenEsfera() {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(medida1, 3);
        System.out.println("El volumen de la esfera es: " + volumen);
    }

    public static void calcularVolumenCubo() {
        double volumen = Math.pow(medida1, 3);
        System.out.println("El volumen del cubo es: " + volumen);
    }

    public static void calcularVolumenCilindro() {
        double volumen = Math.PI * Math.pow(medida1, 2) * medida2;
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
