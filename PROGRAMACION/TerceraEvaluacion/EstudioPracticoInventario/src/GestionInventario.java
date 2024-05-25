import java.util.*;

public class GestionInventario {

    //atributos
    private Map<String, Producto> inventario;
    private List<Producto> productosDisponibles;

    //constructor
    public GestionInventario() {
        this.inventario = new HashMap<>();
        this.productosDisponibles = new ArrayList<>();
    }

    //metodo agregarProducto
    public void agregarProducto(String nombre, double precio, int cantidad) {
        Producto producto = new Producto(nombre, precio, cantidad);
        inventario.put(nombre, producto);
        productosDisponibles.add(producto);
    }

    //metodo actualizarCantidadProducto
    public void actualizarCantidadProducto(String nombre, int nuevaCantidad) {
        Producto producto = inventario.get(nombre);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
        }else {
            System.out.println("El producto no existe");
        }
    }

    //metodo mostrarPrecioProducto
    public double mostrarPrecioProducto(String nombre) {
        Producto producto = inventario.get(nombre);
        if (producto != null) {
            return producto.getPrecio();
        }else {
            System.out.println("El producto no existe");
            return 0;
        }
    }

    //metodo mostrarTodosProductos
    public void mostrarTodosProductos() {
        for (Producto producto : productosDisponibles) {
            System.out.println(producto);
        }
    }

    //toString
    @Override
    public String toString() {
        return "GestionInventario{" + "inventario=" + inventario + ", productosDisponibles=" + productosDisponibles + '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestionInventario that = (GestionInventario) o;
        return Objects.equals(inventario, that.inventario) && Objects.equals(productosDisponibles, that.productosDisponibles);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(inventario, productosDisponibles);
    }

    //compareTo
    public int compareTo(GestionInventario gestionInventario) {
        return this.inventario.size() - gestionInventario.inventario.size();
    }
}