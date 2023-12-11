public class Ejercicio1234 {
	
	public static void main (String[] args) {
		
		//Ejercicio1
		
		int x = 5;
		int y = 3;
		x--;
		x += y;
		System.out.println(x);
		
		//Ejercicio2
		
		int a = 4;
		a++;
		int b = a++ + a;
		b += a + a;
		System.out.println(b);
		
		//Ejercicio3
		
			int c = 4;
		c++;
		System.out.println(c);
		int d = c++ + c++;
		d += c + ++c;
		System.out.println(d);
		
		//Ejercicio4
		
		int e = 3;
		int f = -3;
		e = e + 1;
		System.out.println(e);
		e = e + 2 * f;
		System.out.println(e);
		e = e - 2 * f - 2;
		System.out.println(e);
		int g = e / f - 3;
		System.out.println(g);
		
		
		g = e % f - 3;
		System.out.println(g);
		
		
		
		
		
		
	}
}