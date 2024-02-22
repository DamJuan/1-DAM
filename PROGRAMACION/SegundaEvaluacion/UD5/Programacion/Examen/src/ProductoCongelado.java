public class ProductoCongelado extends Producto {
    private final int temperaturaCongelacion;


    public ProductoCongelado(int fechaCaducidad, int numeroLote, int temperaturaCongelacion, double precio, int cantidad, String nombre, String tipoProducto) {
        super(fechaCaducidad, numeroLote, precio, cantidad, nombre, tipoProducto);
        this.temperaturaCongelacion = temperaturaCongelacion;

    }
}
