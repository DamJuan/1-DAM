public class YelowSun {

    public static void main(String[] args) {
        String cadenaInicial = "Yellow Sun";

        StringBuffer stringBuffer = new StringBuffer(cadenaInicial);

        stringBuffer.delete(0, 6);

        System.out.println("Cadena después de eliminar los seis primeros caracteres: " + stringBuffer.toString());
    }
}
