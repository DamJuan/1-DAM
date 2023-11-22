public class Main {
    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();

        }

        //Ejercicio 1

        public static void ejercicio1(){

        int numero1 = 10;
        int numero2 = 5;

        int resultado = numero1 * numero2;

        System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es: " +resultado);

        }

    //Ejercicio 2

    public static void ejercicio2(){

        int[] numeros = {1, 2, 3};

        System.out.print("El tercer numero es: " + numeros[2]);

    }

    //Ejercicio3

    public static void ejercicio3(){

        int numero = 10;
        int contador = 0;

        while (contador < numero) {
            contador++;
            System.out.println("El contador es: " + contador);
        }

    }

    //Ejercicio4
    public static void ejercicio4(){

        String cadena = "Ejemplo";
        for (int i = 0; i <cadena.length();i++){
            char c = cadena.charAt(i);
            System.out.println("Caracter en la posicion "+ i + " : " + c);
        }

    }

}
