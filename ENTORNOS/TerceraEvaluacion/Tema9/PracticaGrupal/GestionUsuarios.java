public class GestionUsuarios {
    // Método para registrar un usuario
    public void registrarUsuario(String nombre, String correo, String contraseña) {
        // Aquí iría la lógica real para registrar al usuario en una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se registró el usuario
        System.out.println("Usuario registrado: " + nombre + " - " + correo);
    }
    // Método para eliminar un usuario
    public void eliminarUsuario(int id) {
        // Aquí iría la lógica real para eliminar al usuario de una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se eliminó el usuario
        System.out.println("Usuario eliminado con ID: " + id);
    }
    // Método para autenticar un usuario
    public void autenticarUsuario(String correo, String contraseña) {
        // Aquí iría la lógica real para autenticar al usuario en una base de datos o estructura de datos
        // En este ejemplo, simplemente imprimimos un mensaje indicando que se autenticó al usuario
        System.out.println("Usuario autenticado con correo: " + correo);
    }
}