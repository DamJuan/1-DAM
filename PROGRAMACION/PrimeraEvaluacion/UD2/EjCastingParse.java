public class EjCastingParse {
	public static void main(String[] args) {
		
        stringToInt();		// String texto ="2";
        intToString();		// int numero = 1950;
        charToString();		// char letra ='P';
        stringToBoolean();	// String texto = "true";
        stringToDouble();	// String texto = "2.5";
	}

    /**
     * Convertir una cadena de caracteres (String) a un tipo de dato int (número entero). 
     * Para ello la cadena de caracteres deben ser sólo números. Para hacer la conversión declaramos una variable String.
     */
    public static void stringToInt() {

        String texto ="2";
        int numero = Integer.parseInt(texto);
        System.out.println("El String convertido en int es " + numero + " y si lo multiplico por 2: " + numero * 2);
    }

    /**
     * Convertir un tipo de datos primitivo int (tipo entero) a una variable objeto de tipo String
     */
    public static void intToString() {

        int numero = 1950;
        String texto = Integer.toString(numero);
        System.out.println("El int convertido en String es " + texto);
    }

    /**
     * Convertir un tipo de datos primitivo char a una variable objeto de tipo String
     */
    public static void charToString() {

        char letra ='P';
        String texto = Character.toString(letra);
        System.out.println("El caracter en formato texto es " + texto);

        //Para pasar el char a int utilizariamos un casting explicito
        int numP = (int)letra;
        System.out.println("El caracter converito a int " + numP);

        //String to char no es posible, porque la cadena strign puede no contener un solo char
        //Podriamos hacer:
        letra = texto.charAt(0);
        System.out.println("El caracter es " + letra);
    }

    /**
     * Convertir una variable objeto de tipo String en un tipo de datos primitivo char.
     * Comprobar que solo es posible en caso de que sea una letra
     */
    public static void stringToBoolean() {

        String texto = "true";
        boolean condicion = Boolean.parseBoolean(texto);
        System.out.println("El texto convertido a condicion es " + condicion);

        if(condicion) System.out.println("Solo se imprimira si conversion es correcta");
    }

    /**
     * Convertir una variable objeto de tipo String a un tipo de datos primitivo double
     */
    public static void stringToDouble() {

        String texto = "2.5";
        double d = Double.parseDouble(texto);
        System.out.println("El String convertido en double es " + d + " y si lo multiplico por 2: " + d * 2);
    }

}

