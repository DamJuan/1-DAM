
public class Main {

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();

        }

        //Ejercicio1

    public static void ejercicio1() {

        int numero = 5;
        System.out.println("El numero es: " + numero +".");
    }

        //Ejercicio2

    public static void ejercicio2() {

        int numero1 = 10;
        int numero2 = 5;

        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es : " +suma);

    }
        //Ejercicio3
    public static void ejercicio3() {

        int[] numeros = {1, 2, 3};
        System.out.println("El tercer número es: " + numeros[2]);


    }
        //Ejercicio4
    public static void ejercicio4(){

        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;


        }
    }

        //Ejercicio5
    public static void ejercicio5() {

            String texto1 = "Hola"; String texto2 = "hola";

            if (texto1 == texto2) {

                System.out.println("Las cadenas son iguales");

            } else {

                System.out.println("Las cadenas son diferentes");
            }

        }



    }
