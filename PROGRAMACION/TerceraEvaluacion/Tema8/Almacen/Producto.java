import java.util.Objects;

public abstract class Producto {
    private String nombre;
    private String fechaCaducidad;
    private int numeroLote;
    private double precio;
    private int stock;


    public Producto(String nombre, String fechaCaducidad, int numeroLote, double precio, int stock) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return numeroLote == producto.numeroLote && Objects.equals(fechaCaducidad, producto.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaCaducidad, numeroLote);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                ", numeroLote=" + numeroLote +
                '}';
    }
}
