import java.util.List;

public class Cliente {
    private String id;
    private String nombre;
    private List<Videojuego> videojuegosPrestados;

    // Constructor

    public Cliente(String id, String nombre, List<Videojuego> videojuegosPrestados) {
        this.id = id;
        this.nombre = nombre;
        this.videojuegosPrestados = videojuegosPrestados;
    }

    // Getters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Videojuego> getVideojuegosPrestados() {
        return videojuegosPrestados;
    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVideojuegosPrestados(List<Videojuego> videojuegosPrestados) {
        this.videojuegosPrestados = videojuegosPrestados;
    }

    // toString

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nVideojuegos prestados: " + videojuegosPrestados;
    }

    // equals

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cliente) {
            Cliente c = (Cliente) o;
            return id.equals(c.id) && nombre.equals(c.nombre) && videojuegosPrestados.equals(c.videojuegosPrestados);
        }
        return false;
    }

    // hashCode

    @Override
    public int hashCode() {
        return id.hashCode() + nombre.hashCode() + videojuegosPrestados.hashCode();
    }

    // Método para agregar un videojuego a la lista de videojuegos prestados

    public void addVideojuego(Videojuego v) {
        videojuegosPrestados.add(v);
    }

    // Metodo para devolver un videojuego prestado

    public void devolverVideojuego(Videojuego v) {
        videojuegosPrestados.remove(v);
    }


}
