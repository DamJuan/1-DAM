import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class REPASO {


    public static void main(String[] args){
        //EJEMPLO DE LECTURA DE FICHERO
        leerFichero("fichero.txt");

        //EJEMPLO DE ESCRITURA DE FICHERO
        escribirFichero("fichero.txt");


    }

    public static void leerFichero(String nombreFichero) {
        try {
            //Abrir el fichero
            FileInputStream fis = new FileInputStream("fichero.txt");
            //Leer el fichero
            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
            }
            //Cerrar el fichero
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void escribirFichero(String nombreFichero) {
        try {
            //Abrir el fichero
            FileOutputStream fos = new FileOutputStream("fichero.txt");
            //Escribir en el fichero
            fos.write("Hola Mundo".getBytes());
            //Cerrar el fichero
            fos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }




}
