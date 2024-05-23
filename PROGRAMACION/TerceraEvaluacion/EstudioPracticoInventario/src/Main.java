public class Main {
    public static void main(String[] args) {

        // Crear un objeto de la clase GestionInventario
        GestionInventario gestionInventario = new GestionInventario();

        // Agregar productos al inventario
        gestionInventario.agregarProducto("Laptop", 1000, 5);
        gestionInventario.agregarProducto("Mouse", 20, 10);
        gestionInventario.agregarProducto("Teclado", 30, 10);

        // Mostrar todos los productos
        gestionInventario.mostrarTodosProductos();

        // Actualizar la cantidad de un producto
        gestionInventario.actualizarCantidadProducto("Mouse", 15);

        // Mostrar el precio de un producto
        System.out.println("El precio del producto es: " + gestionInventario.mostrarPrecioProducto("Mouse"));

        // Mostrar todos los productos
        gestionInventario.mostrarTodosProductos();

    }

}
