       import java.util.Scanner;

public class EjerBuclesW {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		ejercicio1();
		ejercicio2();
		ejercicio3();
		
		
	}

	public static void ejercicio1(){

	   int inicio = 1;
        int fin = 10;
        int suma = 0;

        while (inicio <= fin) {
            suma += inicio;
            inicio++;
        }

        System.out.println("El sumatorio de los números entre 1 y 10 es: " + suma);
    }
	
	
	public static void ejercicio2(){
		
		        int i = 1;
        while (i <= 10) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println(); // Agrega una línea en blanco entre tablas
            i++;
        }
		
	}
	
	public static void ejercicio3(){
		
		    
        Scanner scanner = new Scanner(System.in);
        int valorUsuario;

        do {
            System.out.print("Introduce un valor entero mayor que 10: ");
            valorUsuario = scanner.nextInt();
        } while (valorUsuario <= 10);

        int suma = 0;
        String serie = "";
        int termino = 1;

        while (termino <= valorUsuario) {
            suma += termino;
            serie += termino;
            if (termino + 3 <= valorUsuario) {
                serie += "+";
            }
            termino += 3;
        }

        System.out.println("Valor que introduce el usuario: " + valorUsuario + ": " + serie + "=" + suma);
    }
}
