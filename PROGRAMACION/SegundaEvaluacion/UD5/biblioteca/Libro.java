import java.time.LocalDate;

public class Libro implements MaterialPrestable {
    private final int id;
    private final String titulo;
    private final String autor;
    private boolean prestado;
    private Usuario usuarioPrestado;
    private LocalDate fechaPrestamo;

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    @Override
    public boolean esPrestable() {
        return true;
    }

    @Override
    public void prestar(Usuario usuarioPrestado) {
        if (usuarioPrestado != null) {
            this.usuarioPrestado = usuarioPrestado;
            prestado = true;
            fechaPrestamo = LocalDate.now();
        }
    }

    @Override
    public Usuario devolver() {
        prestado = false;
        usuarioPrestado = null;
        fechaPrestamo = null;
        return null;
    }

    @Override
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

    public String getAutor() {
        return autor;
    }
}
