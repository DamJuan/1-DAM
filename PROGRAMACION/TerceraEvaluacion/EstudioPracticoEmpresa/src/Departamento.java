import java.util.Arrays;
import java.util.Objects;

public class Departamento {

    //ATRIBUTOS

    private Empleado[] empleados;
    private String nombre;


    //CONSTRUCTOR

    public Departamento(Empleado[] empleados, String nombre) {
        this.empleados = empleados;
        this.nombre = nombre;
    }


    //METODO PARA CALCULAR EL SALARIO TOTAL DE LOS EMPLEADOS DE UN DEPARTAMENTO

    public double calcularSalarioTotal(Empleado[] empleados) {
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        return salarioTotal;
    }


    //GETTERS Y SETTERS

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // HASHCODE Y EQUALS


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.deepEquals(empleados, that.empleados) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(empleados), nombre);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "empleados=" + Arrays.toString(empleados) +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
