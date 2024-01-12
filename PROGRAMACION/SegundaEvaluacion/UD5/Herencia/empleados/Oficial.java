package empleados;

import empleados.*;

public class Oficial extends Empleado {

    // Constructor por defecto
    public Oficial() {
        super();
    }

    // Constructor con parámetros
    public Oficial(String nombre) {
        // Llamada al constructor de la clase padre para inicializar el nombre
        super(nombre);
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Empleado " + getNombre() + " -> Operario -> Oficial";
    }
}