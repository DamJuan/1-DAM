import java.io.*;

public class InputStreamOutputStream {

    public static void main(String[] args) {

        String fichero = "ficheroBuffered.txt";

        try {

            FileOutputStream fileOutputStream = new FileOutputStream(fichero);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            for (int i = 1; i <= 50; i++) {
                dataOutputStream.write(i);
            }
            dataOutputStream.close();
            System.out.println("Se han escrito correctamente el archivo");

        }catch (IOException e){
            System.err.println("Error escribiendo el archivo");
        }



        try {
            FileInputStream ficheroLectura = new FileInputStream(fichero);
            DataInputStream dataInputStream = new DataInputStream(ficheroLectura);

            String linea;

            while ((linea = (dataInputStream.readLine())) != null) {
                System.out.println(linea);
            }

            dataInputStream.close();
        } catch (IOException e) {
            System.err.println("Error al leer");
        }
    }
}
