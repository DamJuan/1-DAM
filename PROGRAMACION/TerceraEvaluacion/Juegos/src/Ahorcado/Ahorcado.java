package Ahorcado;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    private static final int MAX_INTENTOS = 12;
    private static final int PISTA_INTENTOS = 6;

    private Incognita[] incognitas;
    private Incognita incognitaAdivinar;
    private String palabraEnJuego;

    //TODO Si al empezar el programa cambias el valor de intentosRestantes a MAX_INTENTOS, hazlo directamente cuando lo declaras.
    private int intentosRestantes;

    public Ahorcado(int numJugadoresAhorcado) {
        inicializarIncognitas();
        seleccionarIncognita();
    }

    public void Jugar() {
        Scanner sc = new Scanner(System.in);
        //TODO Haz un metodo que te desarrolle la incognita que vamos a adivinar. Como dijo Jack El Destripador, vamos por partes.
        char[] palabraDescubierta = new char[palabraEnJuego.length()];
        for (int i = 0; i < palabraDescubierta.length; i++) {
            if (incognitaAdivinar.getTexto().charAt(i) == ' ') {
                palabraDescubierta[i] = ' ';
            } else {
                palabraDescubierta[i] = '_';
            }
        }
        //TODO porque no lo pones cuando inicializas la variable???
        intentosRestantes = MAX_INTENTOS;
        ArrayList<Character> caracteresIntroducidos = new ArrayList<>();
        while (intentosRestantes > 0) {

            System.out.println("Palabra: " + String.valueOf(palabraDescubierta));
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Letras introducidas: ");
            for (Character caracter : caracteresIntroducidos) {
                System.out.print(caracter + ", ");
            }
            System.out.println();

            System.out.print("Ingresa una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            if (!caracteresIntroducidos.contains(letra)) {
                caracteresIntroducidos.add(letra);
            }

            boolean acierto = false;

            //TODO Esto se podría hacer en un método aparte.
            for (int i = 0; i < palabraEnJuego.length(); i++) {
                if (palabraEnJuego.charAt(i) == letra) {
                    palabraDescubierta[i] = letra;
                    acierto = true;
                }
            }

            //TODO En mi opinión se debería de restar intentos aunque aciertes.
            if (!acierto) {
                intentosRestantes--;
            }

            if (intentosRestantes == PISTA_INTENTOS) {
                System.out.println("¡Últimos intentos! La incógnita es de tipo: " + incognitaAdivinar.getTipo());
            }

            if (String.valueOf(palabraDescubierta).equals(palabraEnJuego)) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraEnJuego);
                sc.close();
                return;
            }
        }
        System.out.println("¡Oh no! Te has quedado sin intentos. La palabra era: " + palabraEnJuego);
        sc.close();
    }

    private void inicializarIncognitas() {
        //TODO Hazlo más fácil de leer, me duelen los ojos AYUDA :(.
        File peliculas = new File("src/Ahorcado/peliculas.txt");
        File libros = new File("src/Ahorcado/libros.txt");
        File gruposMusicales = new File("src/Ahorcado/grupos_musicales.txt");
        Incognita[] peliculasArray = Incognita.leerIncognitas(peliculas, TipoIncognita.PELICULA);
        Incognita[] librosArray = Incognita.leerIncognitas(libros, TipoIncognita.LIBRO);
        Incognita[] gruposMusicalesArray = Incognita.leerIncognitas(gruposMusicales, TipoIncognita.GRUPO_MUSICAL);
        incognitas = new Incognita[peliculasArray.length + librosArray.length + gruposMusicalesArray.length];
        System.arraycopy(peliculasArray, 0, incognitas, 0, peliculasArray.length);
        System.arraycopy(librosArray, 0, incognitas, peliculasArray.length, librosArray.length);
        System.arraycopy(gruposMusicalesArray, 0, incognitas, peliculasArray.length + librosArray.length, gruposMusicalesArray.length);
    }

    private void seleccionarIncognita() {
        Random random = new Random();
        incognitaAdivinar = incognitas[random.nextInt(incognitas.length)];
        palabraEnJuego = incognitaAdivinar.getTexto().toLowerCase();
    }
}
