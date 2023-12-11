import java.util.Scanner;

public class EjerSwitch {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		ejercicio4();
		
	}
	
		public static void ejercicio1(){
			
			int mes;
			
			System.out.println("Introduce el numero del mes");
			mes = sc.nextInt();
			
			switch(mes) {
				
				case 1:
				
					System.out.println("Enero");
					break;
					
				case 2:
				
					System.out.println("Febrero");
					break;
					
				case 3:
				
					System.out.println("Marzo");
					break;
					
				case 4:
				
					System.out.println("Abril");
					break;
					
				case 5:
				
					System.out.println("Mayo");
					break;
					
				case 6:
				
					System.out.println("Junio");
					break;

				case 7:
				
					System.out.println("Julio");
					break;
					
				case 8:
				
					System.out.println("Agosto");
					break;
					
				case 9:
				
					System.out.println("Septiembre");
					break;
					
				case 10:
				
					System.out.println("Octubre");
					break;
					
				case 11:
				
					System.out.println("Noviembre");
					break;
					
				case 12:
				
					System.out.println("Diciembre");
					break;
					
				default: 

					System.out.println("No esta dentro del rango del 1-12");
					
					break;
			}
			
		}
	
	
		public static void ejercicio2(){
		
				
			System.out.println("Introduce el animal");
		
			String animal = sc.nextLine();
				
			switch(animal) {
			
				case "cat":
			
				System.out.println("Domestico");
				break;
					
					case "dog":
				
					System.out.println("Domestico");
					break;
					
				case "cow":
				
					System.out.println("Domestico tipo granja");
					break;
					
				case "tiger":
				
					System.out.println("No domestico");
					break;
					
				case "lion":
				
					System.out.println("No domestico");
					break;
					
				default:
				
					System.out.println("No es ningun animal");
					break;
			}
		
		}
		
		
		public static void ejercicio4(){
			
			Scanner sc = new Scanner(System.in);
		
			String tipoTarta, tipoChocolate, nata, nombre;
			
			double Precio = 0, PrecioNat = 0, PrecioNom = 0, PrecioTotal = 0;
		
			//Pedimos tipo de tarta
		
			System.out.println("Elija un sabor (manzana, fresa o chocolate):");
			tipoTarta = sc.nextLine();
			
			
			switch(tipoTarta) {
				
				case "manzana":
				
					Precio = 18;
				
					System.out.println(Precio);
				
					break;
				
				case "fresa":
				
					Precio = 16;
				
					System.out.println(Precio);
					
					break;
				
				
				case "chocolate":
				
							
					System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco): ");
					tipoChocolate = sc.nextLine();
				
					if (tipoChocolate.equals("negro")) {
					
						Precio = 14;
					
					} else if (tipoChocolate.equals("blanco")) {
					
						Precio = 15;
						System.out.println(Precio);
						
					} else System.out.println("No tenemos ese sabor lo lamentamos");
					
					break;
					
					
					default:
						System.out.println("No tenemos ese sabor");
				
			}


			//Pedimos la nata y el nombre

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
			
			
			
		}
		
		
		
	}