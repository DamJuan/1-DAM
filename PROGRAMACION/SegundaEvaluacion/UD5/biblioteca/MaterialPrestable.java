public interface MaterialPrestable {
    boolean esPrestable();
    void prestar(Usuario usuario);
    void devolver();
    boolean estaPrestado();
}
