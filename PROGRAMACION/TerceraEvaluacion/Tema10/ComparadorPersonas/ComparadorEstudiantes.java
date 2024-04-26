import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparadorEstudiantes {

    public static void main(String[] args) throws Exception {
        List<Estudiante> estudiantes = readEstudiantesFromFile("estudiantes");

        printEstudiantes("Lista sin ordenar: ", estudiantes);

        OrdenarMostrarEstudiantes("Lista ordenada por nombre y apellidos: ", estudiantes, null);

        OrdenarMostrarEstudiantes("Lista ordenada por edad: ", estudiantes, new OrdenarPorEdad());

        OrdenarMostrarEstudiantes("Lista ordenada por nota media: ", estudiantes, new OrdenarPorNotaMedia());
    }

    private static List<Estudiante> readEstudiantesFromFile(String fileName) throws Exception {
        List<Estudiante> estudiantes = new ArrayList<>();

        //TODO falta implementar el control de excepciones a la hora de leer el fichero
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String linea;
        br.readLine();

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            estudiantes.add(new Estudiante(datos[0], datos[1], datos[2], datos[3]));
        }
        br.close();

        return estudiantes;
    }
    

    private static void printEstudiantes(String message, List<Estudiante> estudiantes) {
        System.out.println(message);
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }


    private static void OrdenarMostrarEstudiantes(String message, List<Estudiante> estudiantes, Comparator<Estudiante> comparator) {
        if (comparator == null) {
            Collections.sort(estudiantes);
        } else {
            estudiantes.sort(comparator);
        }
        printEstudiantes(message, estudiantes);
    }
}