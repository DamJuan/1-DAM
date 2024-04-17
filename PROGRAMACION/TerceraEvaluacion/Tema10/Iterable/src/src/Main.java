import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        numerosAleatorios();
        recorrerLista();
        pruebaPilaPersonalizada();

    }


    public static void numerosAleatorios() {

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
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Elements in the stack:");
        for (int element : stack) {
            System.out.println(element);
        }

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Esta vacio (isEmpty)? " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Esta vacio (isEmpty)? " + stack.isEmpty());
        System.out.println("Esta vacio (isEmpty)? " + stack.isEmpty());
    }

}
