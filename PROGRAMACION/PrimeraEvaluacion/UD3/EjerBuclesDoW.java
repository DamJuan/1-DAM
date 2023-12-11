       import java.util.Scanner;

public class EjerBuclesDoW {
	
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

        do {
            suma += inicio;
            inicio++;
        } while (inicio <= fin);

        System.out.println("El sumatorio de los números entre 1 y 10 es: " + suma);
    }


	
	public static void ejercicio2(){
		
	 int numero = 1;

        do {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            int multiplicador = 1;

            do {
                System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
                multiplicador++;
            } while (multiplicador <= 10);

            numero++;
            System.out.println(); // Agrega una línea en blanco entre tablas
        } while (numero <= 10);
		
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

        do {
            suma += termino;
            serie += termino;
            if (termino + 3 <= valorUsuario) {
                serie += "+";
            }
            termino += 3;
        } while (termino <= valorUsuario);

        System.out.println("Valor que introduce el usuario: " + valorUsuario + ": " + serie + "=" + suma);
        
    }
}