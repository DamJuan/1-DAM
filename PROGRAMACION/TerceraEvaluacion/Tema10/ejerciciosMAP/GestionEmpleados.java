import java.util.HashMap;
import java.util.HashSet;

public class GestionEmpleados {
    public static void main(String[] args) {
        
        HashMap<Integer, empleado> empleados = new HashMap<>();

        empleado empleado1 = new empleado(1, "Juan", "Gerente");
        empleado empleado2 = new empleado(2, "Maria", "Contador");
        empleado empleado3 = new empleado(3, "Pedro", "Vendedor");
        empleado empleado4 = new empleado(4, "Ana", "Secretaria");
        empleado empleado5 = new empleado(5, "Luis", "Gerente");

        empleados.put(empleado1.getId(), empleado1);
        empleados.put(empleado2.getId(), empleado2);
        empleados.put(empleado3.getId(), empleado3);
        empleados.put(empleado4.getId(), empleado4);
        empleados.put(empleado5.getId(), empleado5);

        System.out.println("Empleados: " + empleados);

        //buscar un empleado por id
        System.out.println("Buscar empleado con id 3: " + empleados.get(3));

        //eliminar un empleado por id
        empleados.remove(3);

        System.out.println("Empleados después de eliminar empleado con id 3: " + empleados);

        //agregar un nuevo empleado
        empleado empleado6 = new empleado(6, "Carlos", "Vendedor");
        empleados.put(empleado6.getId(), empleado6);

        System.out.println("Empleados después de agregar un nuevo empleado: " + empleados);

    }
}