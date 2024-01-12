package empleados;

import empleados.*;

public class Tecnico extends Empleado {

    // Constructor por defecto
    public Tecnico() {
        super();
    }

    // Constructor con parámetros
    public Tecnico(String nombre) {
        // Llamada al constructor de la clase padre para inicializar el nombre
        super(nombre);
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Empleado " + getNombre() + " -> Operario-> Tecnico";
    }
}