package PrimeraEvaluacion.UD2;

import java.util.Scanner;

public class Problema123 {
	
	//Problema1
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		System.out.println("Introduce las horas trabajadas");
		n1 = sc.nextInt();
				
		System.out.println("Introduce el precio de cada hora");
		n2 = sc.nextInt();
		
		int ntotal = n1 * n2;
		
		System.out.println("El total de " + n1 + " y " + n2 + " es " + ntotal + ".");
		
	//Problema2
		
		int no1, no2;
		
		System.out.println("Introduce tu peso");
		no1 = sc.nextInt();
				
		System.out.println("Introduce tu estatura");
		no2 = sc.nextInt();
		
		int nototal = no1 / (no2*no2);
		
		
		
		System.out.println("Tu indice de masa corporal es " + Math.ceil(nototal) + "");
	
	
	
	
	//Problema3
			
		int num1, num2;
		
		System.out.println("Introduce el primer numero");
		num1 = sc.nextInt();
				
		System.out.println("Introduce el segundo numero");
		num2 = sc.nextInt();
		
		int cociente = num1 / num2;
		int resto = num1 % num2;
		
		
		System.out.println("" + num1 + " entre " + num2 + " da un cociente " + cociente + " y un resto " + resto + " donde " + num1 + " y " + num2 + " son los numeros introducidos por el usuario, y " + cociente + " y " + resto + " son el cociente y el resto de la division entera respectivamente.");
	
	
		
	}
}