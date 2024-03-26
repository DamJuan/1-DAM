import java.io.*;
import java.util.Scanner;

public class Desencriptador {

    public static void desencriptarArchivo() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el nombre del archivo a desencriptar: ");
            String nombreArchivo = sc.nextLine();

            System.out.println("Ingrese la palabra de encriptacion: ");
            String palabraEncriptacion = sc.nextLine();

            File archivoEntrada = new File(nombreArchivo);
            FileReader fr = new FileReader(archivoEntrada);
            BufferedReader br = new BufferedReader(fr);

            String textoEncriptado = "";
            String linea;

            while ((linea = br.readLine()) != null) {
                textoEncriptado += linea + "\n";
            }
            br.close();

            String textoDesencriptado = desencriptarSumaResta(textoEncriptado, palabraEncriptacion);
            String nombreArchivoDesencriptado = nombreArchivo.replace(".crip", "");

            File archivoSalida = new File(nombreArchivoDesencriptado);
            FileWriter fw = new FileWriter(archivoSalida);

            fw.write(textoDesencriptado);
            fw.close();

            System.out.println("Archivo desencriptado con exito");
            System.out.println("Texto desencriptado: ");
            System.out.println(textoDesencriptado);

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }

    private static String desencriptarSumaResta(String textoEncriptado, String palabraEncriptacion) {
        String textoDesencriptado = "";
        int j = 0;
        for (int i = 0; i < textoEncriptado.length(); i++) {
            char caracter = textoEncriptado.charAt(i);
            char caracterDesencriptado = (char) (caracter - palabraEncriptacion.charAt(j) + 48);
            textoDesencriptado += caracterDesencriptado;
            j++;
            if (j == palabraEncriptacion.length()) {
                j = 0;
            }
        }
        return textoDesencriptado;
    }
}
