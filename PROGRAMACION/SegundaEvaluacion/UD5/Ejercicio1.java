class Estudiante {
    String nombre;
    int edad;
    String grado;

    // Constructor
    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Grado: " + grado);
        System.out.println();
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        // Instanciar objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 20, "10º grado");
        Estudiante estudiante2 = new Estudiante("María", 19, "11º grado");

        // Mostrar información de los estudiantes
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}
