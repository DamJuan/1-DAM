import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ControlAcceso {
    private static final Logger LOGGER = LogManager.getRootLogger();


    public static String menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Acceder");
        System.out.println("2. Registrarse");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
        return sc.nextLine();

    }

    public static String solicitarYValidarNombre(Scanner sc) {
        String nombre;
        do {
            System.out.print("Introduce tu nombre: ");
            nombre = sc.nextLine();
        } while (!nombre.matches("^[a-zA-Z-]+$"));
        return nombre;
    }

    public static String solicitarYValidarApellidos(Scanner sc) {
        String apellidos;
        do {
            System.out.print("Introduce tus apellidos: ");
            apellidos = sc.nextLine();
        } while (!apellidos.matches("^[a-zA-Z-]+( [a-zA-Z-]+)?$"));
        return apellidos;
    }


    public static String validarCorreo(String correo) {
        return correo.matches("^[a-zA-Z0-9_]+@[a-zA-Z0-9.]+$") ? correo : null;
    }

    public static String validarIp(String ip) {
        return ip.matches("^([0-9]{1,3}\\.){3}[0-9]{1,3}$") ? ip : null;
    }

    public static String validarTelefono(String telefono) {
        if (telefono.length() != 9) {
            return null;
        }

        try {
            Long.parseLong(telefono);
        } catch (NumberFormatException e) {
            return null;
        }
        return telefono;
    }

    public static String validarNick(String nick) {
        return nick.matches("^[a-z_]+$") ? nick : null;
    }

    public static String validarContrasena(String contrasena) {
        return contrasena.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$") ? contrasena : null;
    }

    public static String confirmarContrasena(String contrasena, Scanner sc) {
        System.out.print("Confirma tu contraseña: ");
        String confirmacion = sc.nextLine();
        return contrasena.equals(confirmacion) ? contrasena : null;
    }

    public static void mostrarMensajeGuardado(Scanner sc) {
        System.out.print("¿Desea ser guardado en el sistema? (s/n): ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("¡Usuario guardado!");
        } else {
            System.out.println("¡Hasta luego!");
        }
    }

    public static void menuCase(Sistema sistema, Scanner sc) {
        boolean salir = Boolean.FALSE;

        while (!salir) {
            String opcion = menuPrincipal();

            String nick;
            String contrasena;

            switch (opcion) {
                case "1":
                    System.out.println("Acceder");

                    System.out.print("Introduce tu nick: ");
                    nick = sc.nextLine();

                    System.out.print("Introduce tu contraseña: ");
                    contrasena = sc.nextLine();

                    try {
                        Usuario usuario = sistema.validarAcceso(nick, contrasena);
                        System.out.println("¡Bienvenido, " + usuario.getNick() + "!");
                        System.out.println("Último acceso: " + usuario.getUltimoAcceso());
                        System.out.println("Número de accesos: " + usuario.getNumeroAccesos());

                    } catch (InvalidUserException e) {
                        System.err.println("Usuario o contraseña incorrectos");
                    }
                    break;

                case "2":
                    System.out.println("Registrarse");
                    String nombre = solicitarYValidarNombre(sc);
                    String apellidos = solicitarYValidarApellidos(sc);

                    String correo;
                    do {
                        System.out.print("Introduce tu correo: ");
                        correo = sc.nextLine();
                    } while (validarCorreo(correo) == null);

                    String ip;
                    do {
                        System.out.print("Introduce tu IP: ");
                        ip = sc.nextLine();
                    } while (validarIp(ip) == null);

                    String telefono;
                    do {
                        System.out.print("Introduce tu teléfono: ");
                        telefono = sc.nextLine();
                    } while (validarTelefono(telefono) == null);

                    do {
                        System.out.print("Introduce tu nick: ");
                        nick = sc.nextLine();
                    } while (validarNick(nick) == null);

                    do {
                        System.out.print("Introduce tu contraseña: ");
                        contrasena = sc.nextLine();
                    } while (validarContrasena(contrasena) == null);
                    contrasena = confirmarContrasena(contrasena, sc);

                    if (contrasena != null) {
                        Usuario usuario = new Usuario(nick, contrasena, nombre, apellidos, correo, ip, telefono);
                        sistema.guardarUsuario(usuario);
                        mostrarMensajeGuardado(sc);
                        
                    } else {
                        System.err.println("Las contraseñas no coinciden");
                    }
                    break;
                case "3":
                    salir = Boolean.TRUE;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }


    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        sistema.cargarUsuarios();
        Scanner sc = new Scanner(System.in);

        try {
            menuCase(sistema, sc);
        } catch (Exception e) {
            LOGGER.error("Error en la aplicación: " + e.getMessage());
        } finally {
            LOGGER.info("Aplicación finalizada");
            sc.close();
        }
    }
}