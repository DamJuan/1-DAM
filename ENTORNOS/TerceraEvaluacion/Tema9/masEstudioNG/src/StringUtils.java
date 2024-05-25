public class StringUtils {
    // Método para obtener la longitud de una cadena
    public int longitud(String cadena) {
        return cadena.length();
    }

    // Método para invertir una cadena
    public String invertir(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método para contar las ocurrencias de un carácter en una cadena
    public int contarOcurrencias(String cadena, char caracter) {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == caracter) {
                contador++;
            }
        }
        return contador;
    }

    // Método para eliminar los espacios en blanco de una cadena
    public String eliminarEspacios(String cadena) {
        return cadena.replaceAll("\\s+", "");
    }
}
