import java.time.LocalDate;

public class Publicacion implements MaterialPrestable {
    private final int id;
    private final String titulo;
    private final String editorial;
    private boolean prestado;
    private Usuario usuarioPrestado;
    private LocalDate fechaPrestamo;

    public Publicacion(int id, String titulo, String editorial) {
        this.id = id;
        this.titulo = titulo;
        this.editorial = editorial;
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
    public void devolver() {
        prestado = false;
        usuarioPrestado = null;
        fechaPrestamo = null;
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

    public String getEditorial() {
        return editorial;
    }
}
