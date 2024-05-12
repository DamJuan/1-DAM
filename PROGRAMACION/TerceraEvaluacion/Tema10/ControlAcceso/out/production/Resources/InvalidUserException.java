package ControlAcceso;

public class InvalidUserException extends Exception {

    public InvalidUserException() {
        System.out.println("\nAcceso denegado. Verifique su usuario y contraseña.\n");
    }

    public InvalidUserException(String mensaje) {
        System.out.print(mensaje);
    }
}
