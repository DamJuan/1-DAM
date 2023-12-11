import java.util.Scanner;

public class RepasoEx {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

    //ejer1();
    ejer2();

}

public static void ejer1(){

    int x = 999, y = 144;

    int suma = x + y;
    int resta = x - y;
    int division = x / y;
    int multiplicacion = x * y;


    System.out.println("La suma de los valores: " + x + "y el valor " + y + "es: " + suma);
    System.out.println("La resta de los valores: " + x + "y el valor " + y + "es: " + resta);
    System.out.println("La division de los valores: " + x + "y el valor " + y + "es: " + division);
    System.out.println("La multiplicacion de los valores: " + x + "y el valor " + y + "es: " + multiplicacion);

    }

public static void ejer2(){

        double pfinal;

    System.out.println("Introduzca la base imponible");
    double precio = sc.nextDouble();

    System.out.println("Introduzca el iva");
    double iva = sc.nextDouble();


    pfinal = ((precio * iva)/100);

    System.out.println("El precio final es " + pfinal + "$.");



}



}
