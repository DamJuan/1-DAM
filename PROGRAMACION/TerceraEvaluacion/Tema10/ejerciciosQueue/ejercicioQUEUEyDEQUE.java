import java.util.*;

public class ejercicioQUEUEyDEQUE {
    public static void main(String[] args) {

        Deque<Alumno> listaAlumnos = new LinkedList<>();

        Alumno e1 = new Alumno("Juan", "1234", 20, 7.5, "Perez");
        Alumno e2 = new Alumno("Ana", "5678", 21, 8.5, "Gomez");
        Alumno e3 = new Alumno("Luis", "9101", 22, 9.5, "Garcia");

        listaAlumnos.add(e1);
        listaAlumnos.add(e2);
        listaAlumnos.add(e3);

        System.out.println("Lista de alumnos");

        for (Alumno e : listaAlumnos) {
            System.out.println(e);
        }

        PriorityQueue<Alumno> pq = new PriorityQueue<>();

        pq.add(e1);
        pq.add(e2);
        pq.add(e3);

        System.out.println("PriorityQueue");
        for (Alumno e : pq) {
            System.out.println(e);
        }

        System.out.println("PriorityQueue usando poll()");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }

}