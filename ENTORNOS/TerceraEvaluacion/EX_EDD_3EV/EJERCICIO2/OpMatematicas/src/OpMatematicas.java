/**
 *
 * @author Antonio Camarena Ivars
 */
public class OpMatematicas {
    // campo llamado numeros que es una lista (o ArrayList en este caso) que contendrá objetos de tipo Integer.
    private java.util.ArrayList<Integer> numeros;

    /**
     * Constructor de OpMatematicas.
     *
     * @param datos arreglo con los números para la lista
     */
    public OpMatematicas(int[] datos) {
        // Verifica si el array de datos es nulo o si su longitud es igual a 0.
        if (datos == null || datos.length == 0) {
            // Si se cumple alguna de las condiciones anteriores, lanza la
            // excepción IllegalArgumentException -> indica que un método ha
            // recibido un argumento ilegal o inapropiado.
            throw new IllegalArgumentException();
        }
        // Inicializa un atributo "numeros" como una nueva instancia de ArrayList.
        this.numeros = new java.util.ArrayList<>();
        // Recorre cada elemento del array "datos"
        for (int elemento : datos) {
            // Agrega cada elemento del array dentro de "numeros".
            numeros.add(elemento);
        }
    }

    /**
     * @return la suma total de los números de la lista.
     */
    public int getSuma() {
        int suma = 0;
        for (int elemento : numeros) {
            suma += elemento;
        }
        return suma;
    }

    /**
     * @return el número mínimo de la lista.
     */
    public int getMinimo() {
        int min = Integer.MAX_VALUE;
        for (int elemento : numeros) {
            if (elemento < min) {
                min = elemento;
            }
        }
        return min;
    }

    /**
     * @return el número máximo de la lista.
     */
    public int getMaximo() {
        int max = Integer.MIN_VALUE;
        for (int elemento : numeros) {
            if (elemento > max) {
                max = elemento;
            }
        }
        return max;
    }

    /**
     * Retorna el índice de un número buscado.
     *
     * @param numero Número buscado.
     * @return Retorna la posición de un número dentro de la lista.
     * @throws java.util.NoSuchElementException Si el número no existe en la
     *                                          lista.
     */
    public int getIndiceDe(int numero) throws java.util.NoSuchElementException {
        int pos = 0;
        for (int elemento : numeros) {
            if (elemento == numero) {
                return pos;
            }
            pos++;
        }
        // Si el número no existe, lanzamos la excepción NoSuchElementException ->
        // indica que no se puede acceder a un elemento en una colección
        throw new java.util.NoSuchElementException(String.valueOf(numero));
    }
}