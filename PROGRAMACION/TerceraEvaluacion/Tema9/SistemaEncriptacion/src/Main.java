import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea encriptar o desencriptar algun archivo: ");
        String opcion = sc.nextLine();

        if (opcion.equalsIgnoreCase("encriptar")) {
            Encriptador.encriptarArchivo();
        } else if (opcion.equalsIgnoreCase("desencriptar")) {
            Desencriptador.desencriptarArchivo();
        } else {
            System.out.println("Opcion no valida");
        }
    }

}
