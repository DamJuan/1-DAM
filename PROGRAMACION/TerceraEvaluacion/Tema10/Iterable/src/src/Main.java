import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        numerosAleatorios();
        recorrerLista();

    }


    public static void numerosAleatorios() {
        //TODO Hacer print de 100 numeros aleatorios con iterable

        List<Integer> listaNumeros = new ArrayList<Integer>();


        for (Iterator<Integer> it = listaNumeros.iterator(); it.hasNext(); ) {
            Integer numero = it.next();
            System.out.println(numero);


        }
    }

    public static void recorrerLista() {

        MiColeccion listaAlumnos = new MiColeccion();

        for (Iterator<Alumno> it = listaAlumnos.iterator(); it.hasNext(); ) {
            Alumno alumno = it.next();
            System.out.println(alumno);
        }

    }

    public static void pruebaPilaPersonalizada() {
        //TODO Crear una pila personalizada
        //TODO Hacer push, pop, peek, isEmpty
        //TODO Recorrer la pila con un for each
        //TODO Hacer algun ejercicio de prueba para demostar el funcionamiento
    }

}
