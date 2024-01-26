package biblioteca;

public class GestionBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(1, "El señor de los anillos", "J.R.R. Tolkien");
        biblioteca.agregarLibro(2, "Cien años de soledad", "Gabriel García Márquez");

        biblioteca.agregarPublicacion(3, "Revista de Ciencia", "Editorial XYZ");

        biblioteca.agregarUsuario(101, "Juan");
        biblioteca.agregarUsuario(102, "María");

        biblioteca.prestarMaterial(1, 101);
        biblioteca.prestarMaterial(1, 102);
        biblioteca.devolverMaterial(1);
        biblioteca.devolverMaterial(1);
        biblioteca.prestarMaterial(3, 102);
    }
}
