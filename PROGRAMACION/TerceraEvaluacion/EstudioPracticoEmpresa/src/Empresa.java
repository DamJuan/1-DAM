import java.util.Arrays;
import java.util.Objects;

public class Empresa {

    // ATRIBUTOS

    private Empleado[] empleados;
    private Departamento[] departamentos;
    private Proyecto[] proyectos;

    // CONSTRUCTOR

    public Empresa(Empleado[] empleados, Departamento[] departamentos, Proyecto[] proyectos) {
        this.empleados = empleados;
        this.departamentos = departamentos;
        this.proyectos = proyectos;
    }

    // METODO PARA AGREGAR EMPLEADOS

    public void agregarEmpleado(Empleado empleado) {
        Empleado[] empleadosAux = new Empleado[empleados.length + 1];
        for (int i = 0; i < empleados.length; i++) {
            empleadosAux[i] = empleados[i];
        }
        empleadosAux[empleados.length] = empleado;
        empleados = empleadosAux;
    }

    // METODO PARA ASIGNAR EMPLEADOS A DEPARTAMENTO

    public static void asignarEmpleadoADepartamento(Empleado empleado, Departamento departamento) {
        Empleado[] empleadosAux = new Empleado[departamento.getEmpleados().length + 1];
        for (int i = 0; i < departamento.getEmpleados().length; i++) {
            empleadosAux[i] = departamento.getEmpleados()[i];
        }
        empleadosAux[departamento.getEmpleados().length] = empleado;
        departamento.setEmpleados(empleadosAux);
    }

    // METODO PARA ASIGNAR EMPLEADOS A PROYECTO

    public static void asignarEmpleadoAProyecto(Empleado empleado, Proyecto proyecto) {
        Empleado[] empleadosAux = new Empleado[proyecto.getEmpleados().length + 1];
        for (int i = 0; i < proyecto.getEmpleados().length; i++) {
            empleadosAux[i] = proyecto.getEmpleados()[i];
        }
        empleadosAux[proyecto.getEmpleados().length] = empleado;
        proyecto.setEmpleados(empleadosAux);
    }

    // METODO PARA BUSCAR EL EMPLEADO POR NOMBRE

    public Empleado buscarEmpleadoPorNombre(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    // METODO PARA CALCULAR EL SALARIO PROMEDIO DE LA EMPRESA

    public double calcularSalarioPromedioEmpresa() {
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        return salarioTotal / empleados.length;
    }

    // METODO PARA BUSCAR EL EMPLEADO CON MAYOR SALARIO

    public Empleado buscarEmpleadoConMayorSalario() {
        Empleado empleadoConMayorSalario = empleados[0];
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() > empleadoConMayorSalario.getSalario()) {
                empleadoConMayorSalario = empleado;
            }
        }
        return empleadoConMayorSalario;
    }

    // GETTERS Y SETTERS

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public Proyecto[] getProyectos() {
        return proyectos;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public void setProyectos(Proyecto[] proyectos) {
        this.proyectos = proyectos;
    }

    // HASHCODE Y EQUALS


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.deepEquals(empleados, empresa.empleados) && Objects.deepEquals(departamentos, empresa.departamentos) && Objects.deepEquals(proyectos, empresa.proyectos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(empleados), Arrays.hashCode(departamentos), Arrays.hashCode(proyectos));
    }

    // TO STRING


    @Override
    public String toString() {
        return "Empresa{" +
                "empleados=" + Arrays.toString(empleados) +
                ", departamentos=" + Arrays.toString(departamentos) +
                ", proyectos=" + Arrays.toString(proyectos) +
                '}';
    }

}
