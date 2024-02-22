public class ProductoRefrigerado extends Producto{
    private final int codigoOrganismo;

    public ProductoRefrigerado(int fechaCaducidad, int numeroLote, int codigoOrganismo,double precio, int cantidad, String nombre, String tipoProducto) {
        super(fechaCaducidad, numeroLote, precio, cantidad, nombre, tipoProducto);
        this.codigoOrganismo = codigoOrganismo;

    }
}
