import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws UsuarioNoRegistradoException, LibroYaRegistradoException, LibroNoDisponibleExcepptio {

        try {

        Biblioteca biblioteca = new Biblioteca(new HashMap<String, Libro>(), new HashMap<String, Usuario>());

        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-3-16-148410-0", true);
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "978-3-16-148410-1", true);
        Libro libro3 = new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", "978-3-16-148410-2", true);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        Usuario usuario1 = new Usuario("1", "Juan", new ArrayList<Libro>());
        Usuario usuario2 = new Usuario("2", "Pedro", new ArrayList<Libro>());


        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        biblioteca.prestarLibro(libro1, usuario1);
        biblioteca.prestarLibro(libro2, usuario2);

        biblioteca.mostrarEstado();

        biblioteca.devolverLibro(libro1, usuario1);

        biblioteca.mostrarEstado();

        biblioteca.buscarLibro("El Señor de los Anillos");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
