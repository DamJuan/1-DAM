import java.util.Date;
import java.util.LinkedList;

public class ejercicioEstudiante {

    String nombre;
    String apellidos;
    Date fechaNacimiento;
    Double notaMedia;

    public ejercicioEstudiante(String nombre, String apellidos, Date fechaNacimiento, Double notaMedia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.notaMedia = notaMedia;
    }

    public String toString() {
        return "Estudiante{ " +
                "nombre: '" + nombre + '\'' +
                ", apellidos: '" + apellidos + '\'' +
                ", fechaNacimiento: " + fechaNacimiento +
                ", notaMedia: " + notaMedia +
                '}';
    }


    public static void main(String[] args) {

        LinkedList<ejercicioEstudiante> listaEstudiantes = new LinkedList<>();

        listaEstudiantes.add(new ejercicioEstudiante("Juan", "Pérez", new Date(), 7.5));
        listaEstudiantes.addFirst(new ejercicioEstudiante("Ana", "López", new Date(), 8.5));
        listaEstudiantes.add(new ejercicioEstudiante("Pedro", "Gómez", new Date(), 6.5));
        listaEstudiantes.add(new ejercicioEstudiante("María", "Martínez", new Date(), 9.5));
        listaEstudiantes.addLast(new ejercicioEstudiante("Luis", "García", new Date(), 5.5));
        listaEstudiantes.push(new ejercicioEstudiante("Carmen", "Fernández", new Date(), 4.5));
        listaEstudiantes.add(2, new ejercicioEstudiante("Antonio", "Sánchez", new Date(), 3.5));
        listaEstudiantes.offerFirst(new ejercicioEstudiante("Rosa", "Ramírez", new Date(), 2.5));
        listaEstudiantes.offerLast(new ejercicioEstudiante("Javier", "Jiménez", new Date(), 1.5));

        listaEstudiantes.set(5, new ejercicioEstudiante("Sara", "Díaz", new Date(), 0.5));
        listaEstudiantes.element().nombre = "Carlos";
        listaEstudiantes.peekFirst().nombre = "Elena";
        listaEstudiantes.peekLast().nombre = "Raúl";

        System.out.println("Lista de estudiantes: ");
        System.out.println(listaEstudiantes);

        System.out.println("Estudiante en la posición 3: ");
        System.out.println(listaEstudiantes.get(3));

        System.out.println("Estudiante en la primera posición: ");
        System.out.println(listaEstudiantes.getFirst());

        System.out.println("Estudiante en la última posición: ");
        System.out.println(listaEstudiantes.getLast());

        listaEstudiantes.remove();
        listaEstudiantes.removeFirst();
        listaEstudiantes.removeLast();
        listaEstudiantes.pop();
        listaEstudiantes.remove(2);
        listaEstudiantes.pollFirst();
        listaEstudiantes.pollLast();

        System.out.println("Lista de estudiantes después de borrar elementos: ");
        System.out.println(listaEstudiantes);

    }

}
