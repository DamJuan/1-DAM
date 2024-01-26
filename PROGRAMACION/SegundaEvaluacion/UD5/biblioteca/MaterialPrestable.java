package biblioteca;

public interface MaterialPrestable {
    boolean esPrestable();
    void prestar(Usuario usuario);
    Usuario devolver();
    boolean estaPrestado();
}
