import java.util.Comparator;

public class OrdenarPorNotaMedia implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        int anterior = o2.notaMedia.compareTo(o1.notaMedia);
        return anterior == 0 ? o1.fechaNacimiento.compareTo(o2.fechaNacimiento) : anterior;
    }
}