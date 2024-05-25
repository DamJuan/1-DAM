import java.util.List;

public class Tienda {
    private List<Cliente> clientes;
    private List<Videojuego> videojuegos;

    // Constructor

    public Tienda(List<Cliente> clientes, List<Videojuego> videojuegos) {
        this.clientes = clientes;
        this.videojuegos = videojuegos;
    }

    // Getters

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    // Setters

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setVideojuegos(List<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    // toString

    @Override
    public String toString() {
        return "Clientes: " + clientes + "\nVideojuegos: " + videojuegos;
    }

    // equals

    @Override
    public boolean equals(Object o) {
        if (o instanceof Tienda) {
            Tienda t = (Tienda) o;
            return clientes.equals(t.clientes) && videojuegos.equals(t.videojuegos);
        }
        return false;
    }

    // hashCode

    @Override
    public int hashCode() {
        return clientes.hashCode() + videojuegos.hashCode();
    }

    // Método para agregar y eliminar un videojuego

    public void agregarVideojuego(Videojuego v) throws VideojuegoYaRegistradoException {
        if (!videojuegos.contains(v)) {
            videojuegos.add(v);
        } else {
            throw new VideojuegoYaRegistradoException("El videojuego ya está registrado");
        }
    }

    public void eliminarVideojuego(Videojuego v) throws VideojuegoNoDisponibleException {
        if (v.estaDisponible()) {
            videojuegos.remove(v);
        } else {
            throw new VideojuegoNoDisponibleException("El videojuego no está disponible");
        }
    }

    // Método para agregar y eliminar un cliente

    public void agregarCliente(Cliente c) throws ClienteYaRegistradoException {
        if (!clientes.contains(c)) {
            clientes.add(c);
        } else {
            throw new ClienteYaRegistradoException("El cliente ya está registrado");
        }

    }

    public void eliminarCliente(Cliente c) throws ClienteNoRegistradoException {
        if (clientes.contains(c)) {
            clientes.remove(c);
        } else {
            throw new ClienteNoRegistradoException("El cliente no está registrado");
        }

    }

    // Método para prestar y devolver un videojuego

    public void prestarVideojuego(Cliente c, Videojuego v) throws VideojuegoNoDisponibleException {
        if (v.estaDisponible()) {
            c.addVideojuego(v);
            v.prestar();
        } else {
            throw new VideojuegoNoDisponibleException("El videojuego no está disponible");
        }

    }

    public void devolverVideojuego(Cliente c, Videojuego v) throws VideojuegoYaRegistradoException {
        if (c.getVideojuegosPrestados().contains(v)) {
            c.devolverVideojuego(v);
            v.devolver();
        } else {
            throw new VideojuegoYaRegistradoException("El videojuego no está prestado");
        }
    }

    // Método para buscar un videojuego por título

    public Videojuego buscarVideojuego(String titulo) throws VideojuegoNoDisponibleException {

        for (Videojuego v : videojuegos) {
            if (v.getTitulo().equals(titulo)) {
                return v;
            }
        }
        throw new VideojuegoNoDisponibleException("El videojuego no está disponible");
    }

    // Método para mostrar el estado de la tienda

    public void mostrarEstado() {
        System.out.println("Clientes: ");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        System.out.println("Videojuegos: ");
        for (Videojuego v : videojuegos) {
            System.out.println(v);
        }
    }


}
