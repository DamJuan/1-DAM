package PrimeraEvaluacion.UD4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Agenda {
	//TODO el main tiene casi 100 líneas...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// TODO poco UX con el usuario
        System.out.println("Cuantas personas quiere añadir a la agenda");
        int numPersonas = sc.nextInt();

        sc.nextLine();

        String[][] agenda = new String[numPersonas][4];
        //Guardo el numero de personas introducidas y le asigno el numero de informacion que quiero almacenar

        for (int contador = 0; contador < numPersonas; contador++) {

            boolean datosCompletos = false;

			// TODO compilar esto por cada una de las persona que introducimos en la agenda no es necesario
            Pattern patternNombre = Pattern.compile("^[A-Za-z]+([ -][A-Za-z]+)* [A-Za-z]+([ -][A-Za-z]+)*$");
            Pattern patternTel = Pattern.compile("^\\+\\(34\\)\\s?[6-9][0-9]{8}$");
            Pattern patternIP = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            Pattern patternCorreo = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$");

            while (!datosCompletos) {


                System.out.println("Introduce los datos de la persona: " + (contador + 1));
                String nombreApellidos = pedirNombreApellidos(sc, patternNombre);
                String telefono = pedirTelefono(sc, patternTel);
                String direccionIP = pedirIP(sc, patternIP);
                String correo = pedirCorreo(sc, patternCorreo);

                if (nombreApellidos != null && telefono != null && direccionIP != null && correo != null) {

                    agenda[contador][0] = nombreApellidos;
                    agenda[contador][1] = telefono;
                    agenda[contador][2] = direccionIP;
                    agenda[contador][3] = correo;
                    datosCompletos = true;

                } else {
					//TODO si hay algún error no introducimos a una persona nueva, con lo cual esa posición del array se queda vacía
					// TODO el ejercicio pedia volver a solicitar el dato hasta que fuera correcto. Además no informamos del formato nunca al usuario, con lo que es muy fácil que se equivoque al introducirlo.
                    System.out.println("Los  datos introducidos no son validos");

                }

				// TODO cuando llego al número de personas que he dicho, me pregunta y yo digo que sí, pero me echa de la aplicación.
                System.out.println("Quieres terminar de introducir personas? Si/No");
                String acabar = sc.nextLine();

                if (acabar.equalsIgnoreCase("Si")) {

                    break;
                }

            }
        }
        System.out.println("\nAgenda:");

        for (String[] persona : agenda) {
            if (persona[0] != null) {
                System.out.println("Nombre y apellidos: " + persona[0]);
                System.out.println("Correo electrónico: " + persona[1]);
                System.out.println("Dirección IP: " + persona[2]);
                System.out.println("Teléfono: " + persona[3]);
                System.out.println();
            }
        }

    }
	
	// TODO y este comentario aqui?

        /*

        Validacion de formato

        ^: Esto indica que comprueba que sea desde el principio.
        [A-Za-z]+: Esto comprueba que sean letras de la A a la Z mayus o minus".
        ([ -][A-Za-z]+)*: Esto indica que se pueden meter espacios y guiones
        , : Esto es un valor como "plantilla" aparece siempre despues de cada nombre o apellido
        $: Esto indica que comprueba hasta final.

        */

	// TODO quizá sería mas legible tener aqui el patrón
    public static String pedirNombreApellidos(Scanner sc, Pattern patternNombre) {
        System.out.println("Nombre y apellidos (Apellido1 Apellido2, Nombre): ");
        String nombreApellidos = sc.nextLine();

        Matcher matcherNombre = patternNombre.matcher(nombreApellidos);

        if (matcherNombre.matches()) {

            return nombreApellidos;
        } else {
            return null;
        }
    }

    public static String pedirTelefono(Scanner sc, Pattern patternTel) {
        System.out.println("Teléfono (+34 número de teléfono): ");
        String telefono = sc.nextLine();

        Matcher matcherTel = patternTel.matcher(telefono);

        if (matcherTel.matches()) {
            return telefono;
        } else {
            return null;
        }
    }

    public static String pedirIP(Scanner sc, Pattern patternIP) {
        System.out.println("Dirección IP (IPv4): ");
        String direccionIP = sc.nextLine();

        Matcher matcherIP = patternIP.matcher(direccionIP);

        if (matcherIP.matches()) {
            return direccionIP;
        } else {
            return null;
        }
    }

    public static String pedirCorreo(Scanner sc, Pattern patternCorreo) {
        System.out.println("Correo electrónico: ");
        String correo = sc.nextLine();

        Matcher matcherCorreo = patternCorreo.matcher(correo);

        if (matcherCorreo.matches()) {
            return correo;
        } else {
            return null;
        }
    }

}


