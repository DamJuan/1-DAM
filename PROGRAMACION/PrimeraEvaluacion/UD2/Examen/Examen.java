import java.util.Scanner;

public class Examen{
	
public static void main(String[] args) {
	
	//Ejercicio1();
	//Ejercicio2();
	Ejercicio3();	
}



public static void Ejercicio1(){
	
	Scanner sc = new Scanner(System.in);
	
	double Celsius = 0; 
	double Kelvin = 273.15;
	
	System.out.println("Introduce la cantidad");
	Celsius = sc.nextDouble();
	
	double Resultado = Kelvin *	Celsius;
	
	System.out.println("La cantidad en grados Kelvin son: " + Resultado + ".");
	
}

public static void Ejercicio2(){
	
	Scanner sc = new Scanner(System.in);
	
	double Peso, Altura;
	
	System.out.println("Cual es tu peso en kg? ");
	Peso = sc.nextDouble();
	
	System.out.println("Cual es tu estatura en metros? ");
	Altura = sc.nextDouble();
	
	double Imc = Math.round(Peso / (Altura * Altura));
	
	System.out.println("Tu IMC es: " + Imc + ".");
	
}




public static void Ejercicio3(){

	
	Scanner sc = new Scanner(System.in);
	
	int Edad = 0, Carreras = 0, Tiempo = 0;
		
	
	System.out.println("Introduce tu edad");
    Edad = sc.nextInt();
		
if ( Edad < 18 ) {

	System.out.println("No puedes participar");

} else 
	
	{
		
	System.out.println("Has participado en alguna maraton? (Introduce el numero)");
	Carreras = sc.nextInt();
	
	if ( Carreras <= 1 ) {

		System.out.println("No puedes participar");
		
	} else
		
		{

		if ( Edad <= 35 ) 
			
			{
			
				System.out.println("En cuanto tiempor acabaste la maraton?");
				Tiempo = sc.nextInt();

					if ( Tiempo < 190 ) {
						
											
						System.out.println("Persona seleccionada");
											
					} else System.out.println("No puedes participar");
										
			} else {
				
				System.out.println("En cuanto tiempor acabaste la maraton?");
				Tiempo = sc.nextInt();
										
				if ( Tiempo < 225 ) {
										
					System.out.println("Persona seleccionada");
											
				} else {
											
				System.out.println("No puedes participar");
				
				}
			}
			
		}
	}
}
}