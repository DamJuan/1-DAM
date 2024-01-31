public class YelowSun {

    public static void main(String[] args) {
        // Crear una cadena inicial
        String cadenaInicial = "Yellow Sun";

        // Crear un objeto StringBuffer a partir de la cadena inicial
        StringBuffer stringBuffer = new StringBuffer(cadenaInicial);

        // Eliminar los seis primeros caracteres
        stringBuffer.delete(0, 6);

        // Imprimir el resultado
        System.out.println("Cadena después de eliminar los seis primeros caracteres: " + stringBuffer.toString());
    }
}
