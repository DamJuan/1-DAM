import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String rutaAbsoluta = "D:\\1-DAM\\PROGRAMACION\\TerceraEvaluacion\\EjerciciosFILE\\src\\package\\fichero.txt";
        String rutaRelativa = "\\fichero.txt";
        String archivoRutaRaiz = "D:\\fichero.txt";
        String nombreFichero = "fichero.txt";
        String rutaDirectorio = "src\\package";
        String rutaDirectorioNueva = "src\\package\\packageHijo";


        File archivoAbsoluto = new File(rutaAbsoluta);
        File archivoRelativo = new File(rutaRelativa);
        File archivoRaiz = new File(archivoRutaRaiz);
        File archivoRutaNombre = new File(rutaDirectorio, nombreFichero);
        File directorioSB = new File(rutaDirectorioNueva);
        File archivoSB = new File(rutaDirectorioNueva, nombreFichero);

        StringBuilder pasos = new StringBuilder();
        StringBuilder pasosCreacion = new StringBuilder();
        StringBuilder pasosClases = new StringBuilder();
        StringBuilder pasosFicheros = new StringBuilder();



        System.out.println("El fichero existe? " + archivoAbsoluto.exists());
        System.out.println("El fichero existe? " + archivoRelativo.exists());
        System.out.println("El fichero existe? " + archivoRaiz.exists());
        System.out.println("El fichero existe? " + archivoRutaNombre.exists());

        if (directorioSB.exists()) {
            pasos.append("El directorio ya existe");
        } else {
            boolean creado = directorioSB.mkdir();

            pasos.append("El directorio no existe se va a proceder a crearlo \n");

            if (creado) {
                pasos.append("Se a creado correctamente el directorio");
            } else {
                pasos.append("No se a podido crear el directorio");
            }
        }
        directorioSB.getAbsolutePath();
        System.out.println(pasos);


        if (archivoSB.exists()) {
            pasosCreacion.append("El archivo ya existe vamos a proceder a eliminarlo y crearlo de nuevo \n");
            archivoSB.delete();
            pasosCreacion.append("El archivo se a eliminado correctamente \n");
            pasosCreacion.append("Vamos a proceder a crearlo \n");
            archivoSB.createNewFile();
            pasosCreacion.append("El archivo se a creado correctamente \n");

            System.out.print((archivoSB.canRead() ? " i es pot Llegir" : ""));
            System.out.println((archivoSB.canWrite() ? " i es pot Escriure" : ""));
            System.out.println("La longitud del fitxer són " + archivoSB.length() + " bytes");
            System.out.println("Nom: " + archivoSB.getName());
            System.out.println("Ruta: " + archivoSB.getPath());

        } else if (!archivoSB.exists()) {
            pasosCreacion.append("Vamos a proceder a crear el archivo \n");
            archivoSB.createNewFile();
            pasosCreacion.append("El archivo se a creado correctamente \n");
        }

        System.out.println(pasosCreacion);


        if (archivoSB.isFile()) {
            pasosClases.append("El objeto pasado es un archivo");
        } else {
            pasosClases.append("El objeto pasado no es un archivo");
        }
        if (archivoSB.isDirectory()) {
            pasosClases.append("El objeto pasado es un directorio");
        } else {
            pasosClases.append("El objeto pasado no es un directorio");
        }
        System.out.println(pasosClases);


        if (directorioSB.exists()) {
            pasosFicheros.append("El directorio ya existe");
        } else {
            boolean creado = directorioSB.mkdir();
            pasosFicheros.append("El directorio no existe se va a proceder a crearlo \n");

            if (creado) {
                pasosFicheros.append("Se a creado correctamente el directorio");
                for (int i = 0; i < 10; i++){
                    pasosFicheros.append("Vamos a proceder a crear el archivo \n" + i);
                    archivoSB.createNewFile();
                    pasosFicheros.append("El archivo se a creado correctamente \n" + i);

                }
            } else {
                pasosFicheros.append("No se a podido crear el directorio");
            }

            System.out.println(pasosFicheros);

        }


    }


}

/*
crear nuevo directorio
dentro crear 10 ficheros
recorrer y imprimir nombre


 */