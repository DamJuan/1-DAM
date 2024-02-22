public class Producto {
    final int fechaCaducidad;

    final int numeroLote;
    private final double precio;
    private final int cantidad;
    private final String nombre;
    private final String tipoProducto;

    public Producto(int fechaCaducidad, int numeroLote, double precio, int cantidad, String nombre, String tipoProducto) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
    }


}
