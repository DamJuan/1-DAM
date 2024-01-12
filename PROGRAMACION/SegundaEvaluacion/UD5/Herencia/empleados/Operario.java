package empleados;

import empleados.*;

public class Operario extends Empleado {

    // Constructor por defecto
    public Operario() {
        super();
    }

    // Constructor con parámetros
    public Operario(String nombre) {
        // Llamada al constructor de la clase padre para inicializar el nombre
        super(nombre);
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Empleado " + getNombre() + "-> Operario";
    }
}
