public class OperacionesMath {
	
	//Ejercicio1
	
	
public static void main(String[] args) {
		
		int a = 3;
		int b = -3;
		
		int max = Math.max(a,b);
		System.out.println(max);
		
		int min =Math.min(a,b);
		System.out.println(min);
		
		
	//Ejercicio2
		
		
			double aleatoriodecimal = Math.random();
			System.out.println(aleatoriodecimal);
			
		
		//Ejercicio3
		
				
		int aleatorio1al9 = (int)(Math.random()*10-1);
		System.out.println(aleatorio1al9);
		
				
		//Ejercicio4
		
		
						
			int aleatorio1al10 = (int)(Math.random()*10+1);
			System.out.println(aleatorio1al10);
			
		
		//Ejercicio5
		
				
			int n1 = 9;
			int n2 = 43;
					
			double aleatoriovalores = (double)(Math.random()*(n1-n2+1)+n2);
			System.out.println(aleatoriovalores);
		
		
		//Ejercicio6
		
				
			int numentero1 = 9, nunentero2 = 10;					
			int aleatorioentero = (int)(Math.random()*(numentero1-nunentero2+1)+numentero1);
			System.out.println(aleatorioentero);
		
	}
}