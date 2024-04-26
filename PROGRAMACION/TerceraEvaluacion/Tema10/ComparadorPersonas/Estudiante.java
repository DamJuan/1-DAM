import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudiante implements Comparable<Estudiante> {
    String nombre;
    String apellidos;
    Date fechaNacimiento;
    Double notaMedia;
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

    public Estudiante(String nombre, String apellidos, String fechaNacimiento, String notaMedia) throws ParseException {
        this.nombre = nombre;
        this.apellidos = apellidos;
        //TODO falta implementar el control de excepciones a la hora de parsear la fecha
        this.fechaNacimiento = formatoFecha.parse(fechaNacimiento);
        //TODO falta implementar el control de excepciones a la hora de parsear la nota media
        this.notaMedia = Double.parseDouble(notaMedia);
    }

    //TODO falta implmentar getters y setters

    @Override
    public int compareTo(Estudiante o) {
        int anterior = this.nombre.compareTo(o.nombre);
        return anterior == 0 ? this.apellidos.compareTo(o.apellidos) : anterior;
    }

    @Override
    public String toString() {
        return "Estudiante{ " +
                "nombre: '" + nombre + '\'' +
                ", apellidos: '" + apellidos + '\'' +
                ", fechaNacimiento: " + formatoFecha.format(fechaNacimiento) +
                ", notaMedia: " + notaMedia +
                '}';
    }

    //TODO falta implementar el método equals

    //TODO falta implementar el método hashCode
}