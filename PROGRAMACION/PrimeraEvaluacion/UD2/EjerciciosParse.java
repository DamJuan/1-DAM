public class EjerciciosParse {
	
	public static void main(String[] args) {

		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
	
	}	
		
	public static void ejercicio1(){
		String texto ="2";
		int numero =Integer.parseInt(texto);
		System.out.println(texto);
	}
	
	
	public static void ejercicio2(){
		int num = 1985;
		String numero =String.valueOf(num);
		System.out.println(numero);
	}
	
	
	public static void ejercicio3(){
		char letra = 'P';
		String charToString =String.valueOf(letra);
		System.out.println(charToString);
	}
	
	
	public static void ejercicio4(){
		String texto = "true";
		Boolean stringToBoolean =Boolean.parseBoolean(texto);
		System.out.println(stringToBoolean);
	}
	
	
	public static void ejercicio5(){
		String texto = "2.5";
		Double stringToDouble =Double.parseDouble(texto);
		System.out.println(stringToDouble);
	}
	
}
