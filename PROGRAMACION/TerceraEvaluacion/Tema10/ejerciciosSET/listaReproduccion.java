import java.util.LinkedList;
import java.util.List;

public class listaReproduccion {
    public static void main(String[] args) {

        LinkedList<String> listaReproduccion = new LinkedList<>();
        listaReproduccion.add("Cancion 1");
        listaReproduccion.add("Cancion 2");
        listaReproduccion.add("Cancion 3");
        listaReproduccion.add("Cancion 4");
        listaReproduccion.add("Cancion 5");
        listaReproduccion.add("Cancion 6");
        listaReproduccion.add("Cancion 7");
        listaReproduccion.add("Cancion 8");
        listaReproduccion.add("Cancion 9");
        listaReproduccion.add("Cancion 10");
        listaReproduccion.add("Cancion 1");
        listaReproduccion.add("Cancion 2");
        listaReproduccion.add("Cancion 3");
        listaReproduccion.add("Cancion 4");
        listaReproduccion.add("Cancion 5");
        listaReproduccion.add("Cancion 6");
        listaReproduccion.add("Cancion 7");
        listaReproduccion.add("Cancion 8");
        listaReproduccion.add("Cancion 9");
        listaReproduccion.add("Cancion 10");


        System.out.println("Lista de reproduccion con canciones repetidas: ");
        for (String cancion : listaReproduccion) {
            System.out.println(cancion);
        }

        List<String> listaReproduccionSinRepetir = new LinkedList<>();
        for (String cancion : listaReproduccion) {
            if (!listaReproduccionSinRepetir.contains(cancion)) {
                listaReproduccionSinRepetir.add(cancion);
            }
        }

        System.out.println("\nLista de reproduccion sin canciones repetidas: ");
        for (String cancion : listaReproduccionSinRepetir) {
            System.out.println(cancion);
        }

        listaReproduccionSinRepetir.add("Cancion 11");
        listaReproduccionSinRepetir.add("Cancion 12");
        listaReproduccionSinRepetir.add("Cancion 13");

        System.out.println("\nLista de reproduccion con canciones añadidas: ");
        for (String cancion : listaReproduccionSinRepetir) {
            System.out.println(cancion);
        }

        listaReproduccionSinRepetir.remove("Cancion 1");
        listaReproduccionSinRepetir.remove("Cancion 2");
        listaReproduccionSinRepetir.remove("Cancion 3");

        System.out.println("\nLista de reproduccion con canciones eliminadas: ");
        for (String cancion : listaReproduccionSinRepetir) {
            System.out.println(cancion);
        }

    }
}
