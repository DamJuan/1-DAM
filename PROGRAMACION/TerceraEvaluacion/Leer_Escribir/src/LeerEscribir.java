import java.io.*;

public class LeerEscribir {
    public static void main(String[] args) {

        String archivo = "archivo.txt";
        try {

            FileOutputStream fileOutputStream = new FileOutputStream(archivo);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input = "";

            System.out.println("Introduce datos o introduzca fin para finalizar");

            while (!input.equalsIgnoreCase("fin")) {

                input = bufferedReader.readLine();

                bufferedWriter.write(input);
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }

            System.out.println("Se han introducido todos los datos");

            bufferedWriter.close();
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("Error al leer");
        }
    }
}