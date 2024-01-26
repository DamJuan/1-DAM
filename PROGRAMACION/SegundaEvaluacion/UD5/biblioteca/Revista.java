package biblioteca;

import java.time.LocalDate;

public class Revista {

    private final int id;
    private final String titulo;
    private final String editorial;
    private boolean prestado;
    private Usuario usuarioPrestado;
    private LocalDate fechaPrestamo;

    public Revista(int id, String titulo, String editorial) {
        this.id = id;
        this.titulo = titulo;
        this.editorial = editorial;
        this.prestado = false;
    }

    public boolean esPrestable() {
        return false;
    }

    public void prestar(Usuario usuarioPrestado) {
    }

    public void devolver() {
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public boolean haExpiradoPrestamo() {
        if (fechaPrestamo != null) {
            LocalDate fechaDevolucionMaxima = fechaPrestamo.plusDays(15);
            return LocalDate.now().isAfter(fechaDevolucionMaxima);
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }
}
