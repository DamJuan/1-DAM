package MultiplicationGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Ahorcado {
    private static final String[] PELICULAS = {"Titanic", "Avatar", "Inception", "The Matrix", "Pulp Fiction"};
    private static final String[] LIBROS = {"Harry Potter", "El Señor de los Anillos", "Matar a un ruiseñor", "1984", "El gran Gatsby"};
    private static final String[] GRUPOS_MUSICALES = {"The Beatles", "Queen", "Led Zeppelin", "Pink Floyd", "The Rolling Stones"};
    private static final int MAX_INTENTOS = 12;
    private static final int PISTA_INTENTOS = 6;

    private Incognita[] incognitas;
    private Incognita incognitaAdivinar;
    private String palabraEnJuego;
    private int intentosRestantes;

    public Ahorcado(int numJugadoresAhorcado) {
        inicializarIncognitas();
        seleccionarIncognita();
    }

    public void Jugar() {
        Scanner sc = new Scanner(System.in);
        char[] palabraDescubierta = new char[palabraEnJuego.length()];
        for (int i = 0; i < palabraDescubierta.length; i++) {
            if (incognitaAdivinar.getTexto().charAt(i) == ' ') {
                palabraDescubierta[i] = ' ';
            } else {
                palabraDescubierta[i] = '_';
            }
        }
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

            for (int i = 0; i < palabraEnJuego.length(); i++) {
                if (palabraEnJuego.charAt(i) == letra) {
                    palabraDescubierta[i] = letra;
                    acierto = true;
                }
            }

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
        incognitas = new Incognita[6];
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            incognitas[i] = new Incognita(PELICULAS[random.nextInt(PELICULAS.length)], TipoIncognita.PELICULA);
            incognitas[i + 2] = new Incognita(LIBROS[random.nextInt(LIBROS.length)], TipoIncognita.LIBRO);
            incognitas[i + 4] = new Incognita(GRUPOS_MUSICALES[random.nextInt(GRUPOS_MUSICALES.length)], TipoIncognita.GRUPO_MUSICAL);
        }
    }

    private void seleccionarIncognita() {
        Random random = new Random();
        incognitaAdivinar = incognitas[random.nextInt(incognitas.length)];
        palabraEnJuego = incognitaAdivinar.getTexto().toLowerCase();
    }
}
