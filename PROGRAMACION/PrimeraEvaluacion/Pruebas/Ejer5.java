//Importamos la utilidad Scanner para leer los numeros que introduzcamos
import java.util.Scanner;

public class Ejer5 {
	//Nombramos a la utilidad para poderla utilizar
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		
		//Nombramos las variables de los numeros para poderlas utilizar
        int n1, n2, n3;
		
		//Pedimos el primer numero
        System.out.println("Introduce el primer numero");
        n1 = sc.nextInt();
		
		//Pedimos el segundo numero
        System.out.println("Introduce el segundo numero");
        n2 = sc.nextInt();
		
		//Pedimos el tercer numero
        System.out.println("Introduce el tercer numero");
        n3 = sc.nextInt();
		
		//Nos metemos en el if si los numeros son iguales
        if (n1 == n2 && n1 == n3 && n2 == n3) {
			
            do {
				//Pedimos de nuevo los numeros distintos
				
                System.out.println("Introduce numeros distintos");
				//Pedimos el primer numero
                System.out.println("Introduce el primer numero");
                n1 = sc.nextInt();
				
				//Pedimos el segundo numero
                System.out.println("Introduce el segundo numero");
                n2 = sc.nextInt();
				
				//Pedimos el tercer numero
                System.out.println("Introduce el tercer numero");
                n3 = sc.nextInt();
				
				//Mientras sean iguales los numeros seguimos pidiendolos
            } while (n1 == n2 && n1 == n3 && n2 == n3);
        }
			
		//Definimos las variables max y min y usamos la operacion para sacar el numero mayor y el numero menor 
        int max = Math.max(Math.max(n1, n2), n3);
        int min = Math.min(Math.min(n1, n2), n3);
		
		//Sacamos por pantalla el numero mayor y el numero menor
        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);
    }
}
