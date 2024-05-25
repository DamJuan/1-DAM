import java.util.Arrays;
import java.util.Objects;

public class Proyecto {

    // ATRIBUTOS

    private String nombre;
    private String descripcion;
    private String departamento;
    private Empleado[] empleados;

    // CONSTRUCTOR

    public Proyecto(String nombre, String descripcion, String departamento, Empleado[] empleados) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.departamento = departamento;
        this.empleados = empleados;
    }

    // METODO PARA CALCULAR EL SALARIO TOTAL DE LOS EMPLEADOS DE UN PROYECTO

    public double calcularSalarioTotal(Empleado[] empleados) {
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        return salarioTotal;
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    // HASHCODE Y EQUALS


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proyecto proyecto = (Proyecto) o;
        return Objects.equals(nombre, proyecto.nombre) && Objects.equals(descripcion, proyecto.descripcion) && Objects.equals(departamento, proyecto.departamento) && Objects.deepEquals(empleados, proyecto.empleados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, departamento, Arrays.hashCode(empleados));
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", departamento='" + departamento + '\'' +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }
}
