public class SistemaGestionEmpleados {

    public static void main(String[] args) {

        //CREAMOS LOS EMPLEADOS
        crearEmpleados();

        //CREAMOS LOS DEPARTAMENTOS
        crearDepartamentos();

        //CREAMOS LOS PROYECTOS
        crearProyectos();

        //CREAMOS LA EMPRESA
        crearEmpresa();

        //MOSTRAMOS LOS EMPLEADOS
        mostrarEmpleados(crearEmpleados());

        //MOSTRAMOS LOS DEPARTAMENTOS
        mostrarDepartamentos(crearDepartamentos());

        //MOSTRAMOS LOS PROYECTOS
        mostrarProyectos(crearProyectos());

        //MOSTRAMOS LA EMPRESA
        mostrarEmpresa(crearEmpresa());

        //MOSTRAMOS EL SALARIO PROMEDIO DE LA EMPRESA
        mostrarSalarioPromedioEmpresa(crearEmpresa());

        //MOSTRAMOS EL SALARIO TOTAL DE LOS EMPLEADOS DE UN DEPARTAMENTO
        mostrarSalarioTotalDepartamento(crearDepartamentos()[0]);

        //MOSTRAMOS EL SALARIO TOTAL DE LOS EMPLEADOS DE UN PROYECTO
        mostrarSalarioTotalProyecto(crearProyectos()[0]);

        //ASIGNAMOS UN EMPLEADO A UN DEPARTAMENTO
        asignarEmpleadoADepartamento(crearEmpleados()[0], crearDepartamentos()[0]);

        //ASIGNAMOS UN EMPLEADO A UN PROYECTO
        asignarEmpleadoAProyecto(crearEmpleados()[0], crearProyectos()[0]);

        //BUSCAMOS EL EMPLEADO CON MAYOR SALARIO
        buscarEmpleadoConMayorSalario(crearEmpresa());

        //BUSCAMOS UN EMPLEADO POR NOMBRE
        buscarEmpleadoPorNombre(crearEmpresa(), "Juan");


    }

    // CREAR EMPLEADOS

    public static Empleado[] crearEmpleados() {
        Empleado[] empleados = new Empleado[5];

        empleados[0] = new Empleado("Juan", "García", 1500, "Recursos Humanos", "Proyecto 1");
        empleados[1] = new Empleado("María", "López", 2000, "Recursos Humanos", "Proyecto 1");
        empleados[2] = new Empleado("Carlos", "Martínez", 1800, "Recursos Humanos", "Proyecto 1");
        empleados[3] = new Empleado("Ana", "González", 2500, "Recursos Humanos", "Proyecto 1");
        empleados[4] = new Empleado("Laura", "Rodríguez", 2200, "Recursos Humanos", "Proyecto 1");

        return empleados;
    }

    // CREAR DEPARTAMENTOS

    public static Departamento[] crearDepartamentos() {
        Departamento[] departamentos = new Departamento[1];
        Empleado[] empleados = crearEmpleados();
        departamentos[0] = new Departamento(empleados, "Recursos Humanos");
        return departamentos;
    }

    // CREAR PROYECTOS

    public static Proyecto[] crearProyectos() {
        Proyecto[] proyectos = new Proyecto[1];
        Empleado[] empleados = crearEmpleados();
        proyectos[0] = new Proyecto("Proyecto 1", "Proyecto de Recursos Humanos", "Recursos Humanos", empleados);
        return proyectos;
    }

    // CREAR EMPRESA

    public static Empresa crearEmpresa() {
        Empleado[] empleados = crearEmpleados();
        Departamento[] departamentos = crearDepartamentos();
        Proyecto[] proyectos = crearProyectos();
        return new Empresa(empleados, departamentos, proyectos);
    }

    // MOSTRAR EMPLEADOS

    public static void mostrarEmpleados(Empleado[] empleados) {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    // MOSTRAR DEPARTAMENTOS

    public static void mostrarDepartamentos(Departamento[] departamentos) {
        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
        }
    }

    // MOSTRAR PROYECTOS

    public static void mostrarProyectos(Proyecto[] proyectos) {
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto);
        }
    }

    // MOSTRAR EMPRESA

    public static void mostrarEmpresa(Empresa empresa) {
        System.out.println(empresa);
    }

    // MOSTRAR SALARIO PROMEDIO DE LA EMPRESA

    public static void mostrarSalarioPromedioEmpresa(Empresa empresa) {
        System.out.println("El salario promedio de la empresa es: " + empresa.calcularSalarioPromedioEmpresa());
    }

    // MOSTRAR SALARIO TOTAL DE LOS EMPLEADOS DE UN DEPARTAMENTO

    public static void mostrarSalarioTotalDepartamento(Departamento departamento) {
        System.out.println("El salario total de los empleados del departamento es: " + departamento.calcularSalarioTotal(departamento.getEmpleados()));
    }

    // MOSTRAR SALARIO TOTAL DE LOS EMPLEADOS DE UN PROYECTO

    public static void mostrarSalarioTotalProyecto(Proyecto proyecto) {
        System.out.println("El salario total de los empleados del proyecto es: " + proyecto.calcularSalarioTotal(proyecto.getEmpleados()));
    }

    // ASIGNAR EMPLEADO A DEPARTAMENTO

    public static void asignarEmpleadoADepartamento(Empleado empleado, Departamento departamento) {
        Empresa.asignarEmpleadoADepartamento(empleado, departamento);
    }

    // ASIGNAR EMPLEADO A PROYECTO

    public static void asignarEmpleadoAProyecto(Empleado empleado, Proyecto proyecto) {
        Empresa.asignarEmpleadoAProyecto(empleado, proyecto);
    }

    // BUSCAR EMPLEADO CON MAYOR SALARIO

    public static void buscarEmpleadoConMayorSalario(Empresa empresa) {
        System.out.println("El empleado con mayor salario es: " + empresa.buscarEmpleadoConMayorSalario());
    }

    // BUSCAR EMPLEADO POR NOMBRE

    public static void buscarEmpleadoPorNombre(Empresa empresa, String nombre) {
        System.out.println("El empleado con nombre " + nombre + " es: " + empresa.buscarEmpleadoPorNombre(nombre));
    }

}
