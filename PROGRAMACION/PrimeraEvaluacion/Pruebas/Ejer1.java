import java.util.Scanner;

public class Ejer1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n1, n2;
		
		System.out.println("Introduce el primer valor que queiras sumar");
		n1 = sc.nextInt();
				
		System.out.println("Introduce el segundo valor que queiras sumar");
		n2 = sc.nextInt();
		
		int ntotal = n1 + n2;
		
		System.out.println("El total de "+n1+"y "+n2+" es "+ntotal+".");
	}
}