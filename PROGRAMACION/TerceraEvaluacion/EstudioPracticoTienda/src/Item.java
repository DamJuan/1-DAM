public interface Item {
    String getTitulo();
    boolean estaDisponible();

    int compareTo(Videojuego v);
}
