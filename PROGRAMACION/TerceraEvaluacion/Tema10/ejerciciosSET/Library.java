import java.util.HashSet;

public class Library {
    HashSet<Book> libros = new HashSet<>();

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("El Quijote"));
        library.addBook(new Book("TITULO ALEATORIO"));
        library.addBook(new Book("El Quijote"));
        library.addBook(new Book("hgadvsd"));

        library.removeBook(new Book("hgadvsd"));
        library.removeBook(new Book("exsrdctvfygbuhnjikm"));

        library.findBook(new Book("El Quijote"));
        library.findBook(new Book("asbdhjhjasbdjhabdv"));

        library.showBooks();
    }

    public void addBook(Book libro) {
        if (libros.contains(libro)) {
            System.out.println("El libro ya existe en la lista y no se añadira " + libro.getTitulo());
        } else {
            libros.add(libro);
            System.out.println("El libro se ha añadido correctamente");
        }
    }

    public void removeBook(Book libro) {
        if (libros.contains(libro)) {
            System.out.println("El libro se ha eliminado de la lista " + libro.getTitulo());
            libros.remove(libro);
        } else {
            System.out.println("El libro no existe en la lista y no se eliminara " + libro.getTitulo());
        }
    }

    public void findBook(Book libro) {
        if (libros.contains(libro)) {
            System.out.println("El libro se ha encontrado en la lista " + libro.getTitulo());
        } else {
            System.out.println("El libro no existe en la lista " + libro.getTitulo());
        }
    }

    public void showBooks() {
        System.out.println("Lista de libros: ");
        for (Book libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}