//Importar la utilidad
import java.util.Scanner;
public class SumaPrueba {	
//Nombrar la utilidad
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
		//Pedir el primer numero
		System.out.println( "Introduce el primer numero" );
		int n1 = sc.nextInt();
		//Pedir el segundo numero
		System.out.println( "Introduce el segundo numero" );  
		int n2 = sc.nextInt();
		//Sumar los numeros
		int rsuma = n1 + n2;
		System.out.println( "El resultado de "+n1+" y "+n2+" es "+rsuma+"");
	}
}  