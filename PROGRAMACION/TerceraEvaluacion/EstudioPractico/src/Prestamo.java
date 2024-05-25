import java.util.Date;

public class Prestamo {

    private String libro;
    private String usuario;
    private Date fechaPrestamo;

    //constructor

    public Prestamo(String libro, String usuario, Date fechaPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    //getters

    public String getLibro() {
        return libro;
    }

    public String getUsuario() {
        return usuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    //setters

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    //toString

    public String toString() {
        return "Libro: " + libro + "\nUsuario: " + usuario + "\nFecha de Prestamo: " + fechaPrestamo;
    }

    //equals

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Prestamo prestamo = (Prestamo) obj;
        return this.libro.equals(prestamo.getLibro()) && this.usuario.equals(prestamo.getUsuario()) && this.fechaPrestamo.equals(prestamo.getFechaPrestamo());
    }

    //hashCode

    public int hashCode() {
        return libro.hashCode() + usuario.hashCode() + fechaPrestamo.hashCode();
    }



}
