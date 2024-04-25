package UD9.ahorcado.nacho.clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class GestionAhorcado {

    private File peliculas = new File("src/UD9/ahorcado/nacho/peliculas.txt");
    private File libros = new File("src/UD9/ahorcado/nacho/libros.txt");
    private File gruposMusicales = new File("src/UD9/ahorcado/nacho/grupos_musicales.txt");

    public GestionAhorcado() {
        super();
    }

    public String getPalabra(int numRandom) throws FileNotFoundException {
        String palabra = "";
        switch (numRandom) {
            case 1:
                palabra = generarPalabraAleatoria(peliculas);
                break;
            case 2:
                palabra = generarPalabraAleatoria(libros);
                break;
            case 3:
                palabra = generarPalabraAleatoria(gruposMusicales);
                break;
        }
        return palabra;
    }

    private String generarPalabraAleatoria(File file) throws FileNotFoundException {
        int numRandom = (int) (Math.random() * 10) + 1;
        Scanner sc = new Scanner(file);
        //TODO No se cierra el scanner
        int num = 1;
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            if (num == numRandom) {
                return linea;
            }
            num++;
        }
        return null;
    }
}
