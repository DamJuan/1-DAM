import java.util.Objects;

public class ProductoFresco extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String nombre, String fechaCaducidad, int numeroLote, double precio, int stock, String fechaEnvasado, String paisOrigen) {
        super(nombre, fechaCaducidad, numeroLote, precio, stock);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductoFresco that = (ProductoFresco) o;
        return Objects.equals(fechaEnvasado, that.fechaEnvasado) && Objects.equals(paisOrigen, that.paisOrigen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaEnvasado, paisOrigen);
    }

    @Override
    public String toString() {
        return "ProductoFresco{" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
