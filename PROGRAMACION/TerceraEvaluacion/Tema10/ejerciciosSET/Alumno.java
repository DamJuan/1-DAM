
import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    public String nombre;
    public String nia;
    public int edad;
    public double notaMedia;
    public String apellidos;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String nia, int edad, double notaMedia, String apellidos) {
        this.nombre = nombre;
        this.nia = nia;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alumno alumno = (Alumno) o;

        if (edad != alumno.edad) return false;
        if (!Objects.equals(nombre, alumno.nombre)) return false;
        return Objects.equals(nia, alumno.nia);
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (nia != null ? nia.hashCode() : 0);
        result = 31 * result + edad;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }

    
    @Override
    public int compareTo(Alumno o) {
        int compareNota = this.notaMedia > o.notaMedia ? -1 : this.notaMedia < o.notaMedia ? 1 : 0;
        if (compareNota == 0) {
            int compareNombre = this.nombre.compareTo(o.nombre);
            return compareNombre == 0 ? this.apellidos.compareTo(o.apellidos) : compareNombre;
        } else {
            return compareNota;
        }
    }
}