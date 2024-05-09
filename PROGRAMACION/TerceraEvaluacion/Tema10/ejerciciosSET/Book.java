import java.util.Objects;

public class Book {
    private String titulo;

    public Book(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book libro = (Book) o;
        return titulo.equals(libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}