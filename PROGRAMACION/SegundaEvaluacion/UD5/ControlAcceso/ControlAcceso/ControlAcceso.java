package ControlAcceso;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ControlAcceso {
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

            } catch (NoSuchElementException e) {
                System.out.println("Introduce un valor valido");
            } catch (IllegalStateException e) {
                System.out.println("Introduce un valor valido");
            } catch (InvalidUserException e) {
                e.getMessage();
            }
        }
    }
}