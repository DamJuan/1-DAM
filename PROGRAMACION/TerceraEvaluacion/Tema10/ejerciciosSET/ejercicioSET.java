import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ejercicioSET {
    public static void main(String[] args) throws Exception {

        List<Alumno> Alumnos = readAlumnosFromFile("estudiantes.csv");

        // HashSet
        Set<Alumno> hashSet = new HashSet<>();
        hashSet.addAll(Alumnos);
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        Set<Alumno> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Alumnos);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        Set<Alumno> treeSet = new TreeSet<>();
        treeSet.addAll(Alumnos);
        System.out.println("TreeSet: " + treeSet);

        // TreeSet con Comparator
        Set<Alumno> treeSetComparator = new TreeSet<>(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        treeSetComparator.addAll(Alumnos);
        System.out.println("TreeSet with Comparator: " + treeSetComparator);

        // TreeSet con



    }

    private static List<Alumno> readAlumnosFromFile(String fileName) throws Exception {
        List<Alumno> Alumnos = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String linea;
        br.readLine();

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            Alumnos.add(new Alumno(datos[0], datos[1], Integer.parseInt(datos[2]), Double.parseDouble(datos[3]), datos[4]));
        }
        br.close();

        return Alumnos;
    }
    
}