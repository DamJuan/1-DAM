import java.util.Objects;

public class Empleado {

    // ATRIBUTOS
    private String nombre;
    private String apellidos;
    private double salario;
    private String departamento;
    private String proyecto;

    // CONSTRUCTOR

    public Empleado(String nombre, String apellidos, double salario, String departamento, String proyecto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
        this.departamento = departamento;
        this.proyecto = proyecto;
    }


    // METODO PARA CALCULAR EL SALARIO TOTAL DE LOS EMPLEADOS DE UN DEPARTAMENTO

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

    public String getApellidos() {
        return apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;

    }

    // HASHCODE Y EQUALS


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(salario, empleado.salario) == 0 && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellidos, empleado.apellidos) && Objects.equals(departamento, empleado.departamento) && Objects.equals(proyecto, empleado.proyecto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, salario, departamento, proyecto);
    }

    // TOSTRING


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                ", proyecto='" + proyecto + '\'' +
                '}';
    }
}