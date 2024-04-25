import java.util.Objects;

public class ProductoCongelado extends Producto{
    private double temperaturaCongelacion;

    public ProductoCongelado(String nombre, String fechaCaducidad, int numeroLote, double precio, int stock, double temperaturaCongelacion) {
        super(nombre, fechaCaducidad, numeroLote, precio, stock);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductoCongelado that = (ProductoCongelado) o;
        return Double.compare(temperaturaCongelacion, that.temperaturaCongelacion) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperaturaCongelacion);
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" +
                "temperaturaCongelacion=" + temperaturaCongelacion +
                '}';
    }
}
