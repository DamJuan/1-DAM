import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        int anterior = o1.fechaNacimiento.compareTo(o2.fechaNacimiento);
        return anterior == 0 ? o1.nombre.compareTo(o2.nombre) : anterior;
    }
}