package empleados;

import empleados.*;

public class Empleado {

    private String nombre;

    // Constructor por defecto
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método get para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Método set para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString

    @Override
    public String toString() {
        return "Empleado" + nombre;
    }
}
