public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponibilidad;

    //constructor
    public Libro(String titulo, String autor, String isbn, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidad = disponibilidad;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    //toString

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nDisponibilidad: " + disponibilidad;
    }

    //equals

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Libro libro = (Libro) obj;

        return this.isbn.equals(libro.isbn);
    }

    //hashCode

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    //metodos

    public void prestarLibro() {
        if (disponibilidad) {
            disponibilidad = false;
        }
    }

    public void devolverLibro() {
        if (!disponibilidad) {
            disponibilidad = true;
        }
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }

    public void mostrarDisponibilidad() {
        if (disponibilidad) {
            System.out.println("El libro esta disponible");
        } else {
            System.out.println("El libro no esta disponible");
        }
    }

    public void mostrarTitulo() {
        System.out.println("Titulo: " + titulo);
    }

    public void mostrarAutor() {
        System.out.println("Autor: " + autor);
    }

    public void mostrarIsbn() {
        System.out.println("ISBN: " + isbn);
    }

}
