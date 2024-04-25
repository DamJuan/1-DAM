import java.util.Objects;

public class ProductoRefrigerado extends Producto{
    String codigoOSA;

    public ProductoRefrigerado(String nombre, String fechaCaducidad, int numeroLote, double precio, int stock, String codigoOSA) {
        super(nombre, fechaCaducidad, numeroLote, precio, stock);
        this.codigoOSA = codigoOSA;
    }

    public String getCodigoOSA() {
        return codigoOSA;
    }

    public void setCodigoOSA(String codigoOSA) {
        this.codigoOSA = codigoOSA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductoRefrigerado that = (ProductoRefrigerado) o;
        return Objects.equals(codigoOSA, that.codigoOSA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codigoOSA);
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" +
                "codOSA='" + codigoOSA + '\'' +
                '}';
    }
}
