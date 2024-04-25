import java.io.*;

public class BufferedWriterBufferedReader {
    public static void main(String[] args) {

        String fichero = "ficheroBuffered.txt";

        try {
            FileWriter ficheroEscritura = new FileWriter(fichero);
            BufferedWriter bufferEscritura = new BufferedWriter(ficheroEscritura);

            for (int i = 1; i <= 50; i++) {
                bufferEscritura.write("Vas por la linea: " + i);
                bufferEscritura.newLine();
            }

            System.out.println("Se a escrito correctamente en el fichero");

            bufferEscritura.close();
        } catch (IOException e) {
            System.err.println("Error al escribir");
        }

        try {
            FileReader ficheroLectura = new FileReader(fichero);
            BufferedReader bufferLectura = new BufferedReader(ficheroLectura);
            String linea;

            while ((linea = (bufferLectura.readLine())) != null) {
                System.out.println(linea);
            }

            bufferLectura.close();
        } catch (IOException e) {
            System.err.println("Error al leer");
        }
    }
}