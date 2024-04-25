import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
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

            StringBuilder textoEncriptado = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                textoEncriptado.append(linea).append("\n");
            }
            br.close();

            System.out.println("¿Que metodo desea utilizar para desencriptar?");
            System.out.println("1. Suma y resta");
            System.out.println("2. Base64");
            System.out.println("3. Cipher");
            int metodo = sc.nextInt();
            sc.nextLine();

            String textoDesencriptado = "";

            switch (metodo) {
                case 1:
                    textoDesencriptado = desencriptarSumaResta(textoEncriptado.toString(), palabraEncriptacion);
                    break;
                case 2:
                    textoDesencriptado = desencriptarBase64(textoEncriptado.toString(), palabraEncriptacion);
                    break;
                case 3:
                    textoDesencriptado = desencriptarCipher(textoEncriptado.toString(), palabraEncriptacion);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    return;
            }

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
        } catch (Exception e) {
            System.out.println("Error al desencriptar el archivo");
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

    private static String desencriptarBase64(String textoEncriptado, String palabraEncriptacion) {
        byte[] textoEnBytes = Base64.getDecoder().decode(textoEncriptado);
        byte[] palabraEnBytes = palabraEncriptacion.getBytes();

        for (int i = 0; i < textoEnBytes.length; i++) {
            textoEnBytes[i] = (byte) (textoEnBytes[i] - palabraEnBytes[i % palabraEnBytes.length]);
        }

        return new String(textoEnBytes);
    }

    private static String desencriptarCipher(String textoEncriptado, String palabraEncriptacion) throws Exception {
        byte[] textoEnBytes = Base64.getDecoder().decode(textoEncriptado);
        byte[] palabraEnBytes = palabraEncriptacion.getBytes();

        SecretKey claveSecreta = new SecretKeySpec(palabraEnBytes, "AES");
        Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cifrador.init(Cipher.DECRYPT_MODE, claveSecreta);

        byte[] textoDesencriptadoBytes = cifrador.doFinal(textoEnBytes);

        return new String(textoDesencriptadoBytes);
    }
}
