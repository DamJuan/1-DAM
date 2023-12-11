import java.util.Scanner;

public class EjerciciosFinal{
	
	public static void main(String[] args) {
		
		Ejercicio1();
		Ejercicio2();
		Ejercicio3();
		Ejercicio4();
		
	}
	
	public static void Ejercicio1(){
		
		int x = 144;
		int y = 999;
		
		int suma = y + x;
		int resta = y - x;
		int division = y / x;
		int multi = y * x;
		
		System.out.println("El primer valor es " + x + " y el segundo " + y + ".");
		System.out.println("La suma de los valores " + x + " y " + y + " es " + suma + ".");
		System.out.println("La resta de los valores " + x + " y " + y + " es " + resta + ".");
		System.out.println("La division de los valores " + x + " y " + y + " es " + division + ".");
		System.out.println("La multi de los valores " + x + " y " + y + " es " + multi + ".");
		
	}
	
	public static void Ejercicio2(){
		 Scanner sc = new Scanner(System.in);
		
		double precio, IVA, pfinal;
		
		System.out.println("Introduce el precio");
        precio = sc.nextDouble();	
		
		System.out.println("Introduce el IVA");
        IVA = sc.nextDouble();
	
		pfinal = precio + ((precio * IVA)/100);
		
		System.out.println("El precio final es " + pfinal + "$.");
		
		
	}
	
	public static void Ejercicio3(){
		
		String num1, num2;
		int valor1, valor2;
		
		
		num1 = System.console().readLine("Introduzca el primer numero ");
		
		num2 = System.console().readLine("Introduzca el segundo numero ");


		valor1 = Integer. parseInt(num1);
		valor2 = Integer. parseInt(num2);
	

		int max = Math.max(valor1, valor2);
        int min = Math.min(valor1, valor2);
		
		//Sacamos por pantalla el numero mayor y el numero menor
        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);
	}
	
	public static void Ejercicio4(){
		
		Scanner sc = new Scanner(System.in);
		
		double volumen, altura, radio, pi;
		
		final double PI = Math.PI;
		
		
		System.out.println("Introduce el radio");
        radio = sc.nextDouble();	
		
		System.out.println("Introduce la altura");
        altura = sc.nextDouble();
	
		volumen = (PI * radio * radio * altura) /3;
		
		System.out.println("El volumen final es " + volumen + ".");
		
		
	}
	
	
	
}
	
