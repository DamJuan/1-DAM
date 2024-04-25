import java.util.Scanner;
import java.io.*;

public class Creador {

    public void crearArchivo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del archivo a crear: ");
            String nombreArchivo = sc.nextLine();
            if (!nombreArchivo.contains(".txt")) {
                System.out.println("El archivo debe ser de tipo .txt");
                return;
            }
            File archivo = new File(nombreArchivo);
            FileWriter fw = new FileWriter(archivo);
            System.out.println("Ingrese el texto del archivo: ");
            String texto = sc.nextLine();
            fw.write(texto);
            fw.close();
            System.out.println("Archivo creado con exito");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }
    }

}
