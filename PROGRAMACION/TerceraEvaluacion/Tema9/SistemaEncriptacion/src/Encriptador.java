import javax.crypto.SecretKey;
import java.io.*;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

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
            }

            System.out.println("Ingrese la palabra de encriptacion: ");
            String palabraEncriptacion = sc.nextLine();

            int tamaño = palabraEncriptacion.length();

            if (tamaño == 0) {
                System.out.println("La palabra de encriptacion no puede ser vacia");
                return;
            } else if (tamaño <= 5) {
                System.out.println("Se va a encriptar con el metodo de suma y resta");
                String textoEncriptado = encriptarSumaResta(obtenerTexto(archivo), palabraEncriptacion);
                guardarArchivoEncriptado(nombreArchivo, textoEncriptado);
            } else if (tamaño < 10) {
                System.out.println("Se va a encriptar con el metodo de base64");
                encriptarBase64(obtenerTexto(archivo), palabraEncriptacion);
            } else {
                System.out.println("Se va a encriptar con la clase cipher");
                encriptarCipher(obtenerTexto(archivo), palabraEncriptacion);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } catch (Exception e) {
            System.out.println("Error al encriptar el archivo");
        }
    }

    private static String obtenerTexto(File archivo) throws IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        StringBuilder texto = new StringBuilder();
        String linea;

        while ((linea = br.readLine()) != null) {
            texto.append(linea).append("\n");
        }
        br.close();

        return texto.toString();
    }

    private static void guardarArchivoEncriptado(String nombreArchivo, String textoEncriptado) throws IOException {
        String nombreArchivoEncriptado = nombreArchivo + (".crip");
        FileWriter fw = new FileWriter(nombreArchivoEncriptado);

        fw.write(textoEncriptado);
        fw.close();

        System.out.println("Archivo encriptado con exito");
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

    public static String encriptarBase64(String texto, String palabraEncriptacion) {
        byte[] textoEnBytes = texto.getBytes();
        byte[] palabraEnBytes = palabraEncriptacion.getBytes();

        for (int i = 0; i < textoEnBytes.length; i++) {
            textoEnBytes[i] = (byte) (textoEnBytes[i] + palabraEnBytes[i % palabraEnBytes.length]);
        }

        byte[] textoEncriptado = java.util.Base64.getEncoder().encode(textoEnBytes);
        return new String(textoEncriptado);
    }

    public static String encriptarCipher(String texto, String palabraEncriptacion) throws Exception {
        byte[] palabraEnBytes = palabraEncriptacion.getBytes();

        SecretKey claveSecreta = new SecretKeySpec(palabraEnBytes,"AES");

        Cipher cifrador = Cipher.getInstance("AES");
        cifrador.init(Cipher.ENCRYPT_MODE, claveSecreta);

        byte[] textoEncriptadoBytes = cifrador.doFinal(texto.getBytes());

        return Base64.getEncoder().encodeToString(textoEncriptadoBytes);
    }
}