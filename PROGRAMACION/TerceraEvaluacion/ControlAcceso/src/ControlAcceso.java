import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ControlAcceso {
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.cargarUsuarios();

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Ingrese su nick: ");
                String nick = sc.nextLine();
                System.out.print("Ingrese su contraseña: ");
                String contrasena = sc.nextLine();

                Usuario usuarioValidado = sistema.validarAcceso(nick, contrasena);

                if (usuarioValidado != null) {
                    System.out.println("\n¡Acceso permitido!");
                    System.out.println("Último acceso: " + usuarioValidado.getUltimoAcceso());
                    System.out.println("Veces que ha accedido: " + usuarioValidado.getNumeroAccesos() + "\n");
                }

            } catch (InvalidUserException e) {
                logger.error("Error de acceso: " + e.getMessage());
            }
        }


    }
}
