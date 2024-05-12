import java.util.HashMap;
import java.util.Map;

public class ContadorPalabras {

    public static void main(String[] args) {

        //contar la frecuencia de cada palabra en una lista de palabras utilizando un mapa para almacenar las palabras y sus frecuencias

        String[] palabras = {"hola", "como", "estas", "hola", "bien", "gracias", "hola", "como", "estas", "bien"};

        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        for (String palabra : palabras) {
            if (frecuenciaPalabras.containsKey(palabra)) {
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.get(palabra) + 1);
            } else {
                frecuenciaPalabras.put(palabra, 1);
            }
        }

        System.out.println("Frecuencia de palabras: " + frecuenciaPalabras);

        //Imprimir la frecuencia de una palabra en particular
        System.out.println("Frecuencia de la palabra 'hola': " + frecuenciaPalabras.get("hola"));

        //Eliminar una palabra del mapa
        frecuenciaPalabras.remove("hola");

        System.out.println("Frecuencia de palabras después de eliminar 'hola': " + frecuenciaPalabras);

        //Imprimir el tamaño del mapa
        System.out.println("Tamaño del mapa: " + frecuenciaPalabras.size());



    }
}