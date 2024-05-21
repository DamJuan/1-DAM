import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {
            // Crear tienda
            Tienda tienda = new Tienda(new ArrayList<Cliente>(), new ArrayList<Videojuego>());

            // Crear videojuegos

            Videojuego v1 = new Videojuego("The Legend of Zelda: Breath of the Wild", "Aventura", "Nintendo Switch", true);
            Videojuego v2 = new Videojuego("Super Mario Odyssey", "Plataformas", "Nintendo Switch", true);
            Videojuego v3 = new Videojuego("The Witcher 3: Wild Hunt", "Rol", "PC", true);
            Videojuego v4 = new Videojuego("Red Dead Redemption 2", "Aventura", "PS4", true);
            Videojuego v5 = new Videojuego("The Last of Us Part II", "Aventura", "PS4", true);

            // Agregar videojuegos a la tienda

            tienda.agregarVideojuego(v1);
            tienda.agregarVideojuego(v2);
            tienda.agregarVideojuego(v3);
            tienda.agregarVideojuego(v4);
            tienda.agregarVideojuego(v5);

            // Crear clientes

            Cliente c1 = new Cliente("1", "Juan", new ArrayList<Videojuego>());
            Cliente c2 = new Cliente("2", "Pedro", new ArrayList<Videojuego>());
            Cliente c3 = new Cliente("3", "Ana", new ArrayList<Videojuego>());

            // Agregar clientes a la tienda

            tienda.agregarCliente(c1);
            tienda.agregarCliente(c2);
            tienda.agregarCliente(c3);

            // Prestar videojuegos

            tienda.prestarVideojuego(c1, v1);
            tienda.prestarVideojuego(c1, v2);
            tienda.prestarVideojuego(c2, v3);

            // Devolver videojuegos

            tienda.devolverVideojuego(c1, v1);
            tienda.devolverVideojuego(c1, v2);
            tienda.devolverVideojuego(c2, v3);

            // Mostrar estado de la tienda

            tienda.mostrarEstado();

            // Eliminar videojuegos de la tienda

            tienda.eliminarVideojuego(v1);
            tienda.eliminarVideojuego(v2);
            tienda.eliminarVideojuego(v3);
            tienda.eliminarVideojuego(v4);

            // Eliminar clientes de la tienda

            tienda.eliminarCliente(c1);
            tienda.eliminarCliente(c2);
            tienda.eliminarCliente(c3);

            // Mostrar estado de la tienda

            tienda.mostrarEstado();

            // Buscar videojuego

            tienda.buscarVideojuego("The Legend of Zelda: Breath of the Wild");
            System.out.println(tienda.buscarVideojuego("The Legend of Zelda: Breath of the Wild"));

        } catch (VideojuegoYaRegistradoException | VideojuegoNoDisponibleException | ClienteYaRegistradoException | ClienteNoRegistradoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
