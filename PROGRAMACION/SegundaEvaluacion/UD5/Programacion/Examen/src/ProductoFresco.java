public class ProductoFresco extends Producto {

   private final int fechaEnvasado;
    private final String paisOrigen;

    public ProductoFresco(int fechaCaducidad, int numeroLote, int fechaEnvasado, String paisOrigen,double precio, int cantidad, String nombre, String tipoProducto) {
        super(fechaCaducidad, numeroLote, precio, cantidad, nombre, tipoProducto);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
}
