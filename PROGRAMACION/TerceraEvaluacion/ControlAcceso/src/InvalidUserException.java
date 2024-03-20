public class InvalidUserException extends Exception {

    public InvalidUserException() {
        super("Acceso denegado. Verifique su usuario y contraseña.");
    }

    public InvalidUserException(String mensaje) {
        super(mensaje);
    }
}
