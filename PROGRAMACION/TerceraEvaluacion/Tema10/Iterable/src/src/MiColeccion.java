import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiColeccion<Alumnos> implements Iterable {
    private List<Alumnos> lista = new ArrayList<>();

    public void recorrerLista() {
        for (Iterator<Alumnos> it = lista.iterator(); it.hasNext(); ) {
            Alumnos elemento = it.next();
            System.out.println(elemento);
        }
    }

    public Iterator<Alumnos> iterator() {
        return lista.iterator();
    }

}
