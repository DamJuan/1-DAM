public class Videojuego implements Item {
    private String titulo;
    private String genero;
    private String plataforma;
    private boolean disponible;

    // Constructor
    public Videojuego(String titulo, String genero, String plataforma, boolean disponible) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.disponible = disponible;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    // Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // toString

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nGenero: " + genero + "\nPlataforma: " + plataforma + "\nDisponible: " + disponible;
    }

    // equals

    @Override
    public boolean equals(Object o) {
        if (o instanceof Videojuego) {
            Videojuego v = (Videojuego) o;
            return titulo.equals(v.getTitulo()) && genero.equals(v.getGenero()) && plataforma.equals(v.getPlataforma());
        }
        return false;
    }

    // hashCode

    @Override
    public int hashCode() {
        return titulo.hashCode() + genero.hashCode() + plataforma.hashCode();
    }

    // clone

    @Override
    public Videojuego clone() {
        return new Videojuego(titulo, genero, plataforma, disponible);
    }

    // compareTo

    @Override
    public int compareTo(Videojuego v) {
        return titulo.compareTo(v.getTitulo());
    }


    // metodo para prestar un videojuego

    public void prestar() {
        if (disponible) {
            disponible = false;
        } else {
            System.out.println("El videojuego no está disponible");
        }
    }

    // metodo para devolver un videojuego

    public void devolver() {
        if (!disponible) {
            disponible = true;
        } else {
            System.out.println("El videojuego ya está disponible");
        }
    }

}
