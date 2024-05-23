import java.util.Objects;

public class Producto {

    //atributos
    private String nombre;
    private double precio;
    private int cantidad;

    //constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double Precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    //metodo equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(precio, producto.precio) == 0 && cantidad == producto.cantidad && Objects.equals(nombre, producto.nombre);
    }

    //metodo hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, cantidad);
    }

    //metodo compareTo
    public int compareTo(Producto producto) {
        return this.nombre.compareTo(producto.nombre);
    }
}
