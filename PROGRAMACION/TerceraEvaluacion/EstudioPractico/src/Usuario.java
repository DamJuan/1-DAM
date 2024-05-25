import java.util.List;

public class Usuario {
    private String id;
    private String nombre;
    private List<Libro> librosPrestados;

    //constructor

    public Usuario(String id, String nombre, List<Libro> librosPrestados){
        this.id = id;
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
    }

    //getters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    //setters

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    //toString

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nLibros Prestados: " + librosPrestados;
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
        Usuario usuario = (Usuario) obj;
        return this.id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


}
