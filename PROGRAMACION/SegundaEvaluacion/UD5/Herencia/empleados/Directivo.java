package empleados;

import empleados.*;
public class Directivo extends Empleado {

    // Constructor por defecto
    public Directivo() {
        super();
    }

    // Constructor con parámetros
    public Directivo(String nombre) {
        // Llamada al constructor de la clase padre para inicializar el nombre
        super(nombre);
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Empleado " + getNombre() + "-> Directivo";
    }
}

