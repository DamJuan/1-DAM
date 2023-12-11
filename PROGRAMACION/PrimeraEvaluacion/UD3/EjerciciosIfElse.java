import java.util.Scanner;

public class EjerciciosIfElse {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		//ejercicio1();
		//ejercicio4();
		//ejercicio5();
		ejercicio6();

	
	}
	
	public static void ejercicio1(){
		
		int num;
		
		System.out.println("Introduce tu edad");
        num = sc.nextInt();
		
		if(num>18)
		{
			System.out.println("Eres mayor de edad");
		}
		else
		{
			System.out.println("Eres menor de edad");
		}

	}		
	
	
	public static void ejercicio4(){
		
	int x, y;
	
	System.out.println("Introduce el primer numero");
        x = sc.nextInt();
		
		//Pedimos el segundo numero
        System.out.println("Introduce el segundo numero");
        y = sc.nextInt();
	
	if(x == y){
		do{
		System.out.println("Introduce valores distintos");
		
		System.out.println("Introduce el primer numero");
        x = sc.nextInt();
		
		//Pedimos el segundo numero
        System.out.println("Introduce el segundo numero");
        y = sc.nextInt();
		}while(x == y);
	}
	else{
	
	//Definimos las variables max y min y usamos la operacion para sacar el numero mayor y el numero menor 
        int max = Math.max(x, y);
        int min = Math.min(x, y);
		
		//Sacamos por pantalla el numero mayor y el numero menor
        System.out.println("El numero mayor es: " + max);
        System.out.println("El numero menor es: " + min);
	}
	}
	
	

    public static void ejercicio5(){
		
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
	
	
	
	
	
	public static void ejercicio6(){
		
		Scanner sc = new Scanner(System.in);
		
		String tipoTarta, tipoChocolate, nata, nombre;

		double Precio = 0, PrecioNat = 0, PrecioNom = 0, PrecioTotal = 0;
		
		
		System.out.println("Elija un sabor (manzana, fresa o chocolate):");
        tipoTarta = sc.nextLine();
		
		if (tipoTarta.equals("manzana")) {
			
			Precio = 18;
			
			System.out.println(Precio);
		
			
		} else if (tipoTarta.equals("fresa")) {
			
			Precio = 16;
			
			System.out.println(Precio);
			
			
		} else if (tipoTarta.equals("chocolate")) {
			
			System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco): ");
			tipoChocolate = sc.nextLine();
		
			if (tipoChocolate.equals("negro")) {
				
				Precio = 14;
				
			} else if (tipoChocolate.equals("blanco")) {
				
				Precio = 15;
					
				System.out.println(Precio);
			} else System.out.println("No tenemos ese sabor lo lamentamos");
			
		} else System.out.println("No tenemos ese sabor lo lamentamos");

		
		System.out.println("Quieres nata? (si o no):");
        nata = sc.nextLine();
		
		if (nata.equals("si")) {
			
			PrecioNat = 2.50;
			
		} else if (nata.equals("no")) {
			
			PrecioNat = 0;
			
		} else System.out.println("Incorrecto");
			
		
		System.out.println("nombre (si o no):");
        nombre = sc.nextLine();
		
		if (nombre.equals("si")) {
			
			PrecioNom = 2.75;
			
		} else if (nombre.equals("no")) {
			
			PrecioNom = 0;
			
		} else System.out.println("Incorrecto");
		
		
		PrecioTotal = (Precio + PrecioNat + PrecioNom);
		
		
		System.out.println("Su tarta de " + tipoTarta + " le costa " + PrecioTotal + "$");
		sc.close();
	}
}