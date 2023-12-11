import java.util.Scanner;

public class EjerBuclesF {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		ejercicio1();
		ejercicio2();
		ejercicio3();

        sc.close();

	
	}
	
	public static void ejercicio1(){
		
        int suma = 0;

        for (int numero = 1; numero <= 10; numero++) {
            suma += numero;
        }

        System.out.println("El sumatorio de los números entre 1 y 10 es: " + suma);
    }

	public static void ejercicio2(){
		
		        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Agrega una línea en blanco entre tablas
        		
	}
	
	}
	
	public static void ejercicio3(){

        int valorUsuario;

        do {
            System.out.print("Introduce un valor entero mayor que 10: ");
            valorUsuario = sc.nextInt();
        } while (valorUsuario <= 10);

        int suma = 0;
        String serie = "";

        for (int i = 1; i <= valorUsuario; i += 3) {
            suma += i;
            serie += i;
            if (i + 3 <= valorUsuario) {
                serie += "+";
            }
        }

        System.out.println("Valor que introduce el usuario: " + valorUsuario + ": " + serie + "=" + suma);
    }
}
