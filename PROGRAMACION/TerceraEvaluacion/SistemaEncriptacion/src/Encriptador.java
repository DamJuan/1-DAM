import java.io.*;
import java.util.Scanner;

public class Encriptador {
    public static void encriptarArchivo() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el nombre del archivo a encriptar: ");
            String nombreArchivo = sc.nextLine();

            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                System.out.println("Deseas crear el archivo? (s/n)");
                String respuesta = sc.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    System.out.println("Saliendo del programa...");
                    return;
                }
                System.out.println("El archivo no existe. Creando el archivo...");
                Creador creador = new Creador();
                creador.crearArchivo();
                return;
            }

            System.out.println("Ingrese la palabra de encriptacion: ");
            String palabraEncriptacion = sc.nextLine();

            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String texto = "";
            String linea;

            while ((linea = br.readLine()) != null) {
                texto += linea + "\n";
            }
            br.close();

            String textoEncriptado = encriptarSumaResta(texto, palabraEncriptacion);

            String nombreArchivoEncriptado = nombreArchivo + (".crip");
            FileWriter fw = new FileWriter(nombreArchivoEncriptado);

            fw.write(textoEncriptado);
            fw.close();

            System.out.println("Archivo encriptado con exito");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public static String encriptarSumaResta(String texto, String palabraEncriptacion) {
        String textoEncriptado = "";
        int j = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            char caracterEncriptado = (char) (caracter + palabraEncriptacion.charAt(j) - 48);
            textoEncriptado += caracterEncriptado;
            j++;
            if (j == palabraEncriptacion.length()) {
                j = 0;
            }
        }
        return textoEncriptado;
    }
}