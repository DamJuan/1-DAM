package UD9.ahorcado.nacho.clases;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado {

    private static ArrayList<Incognita> incognitas = new ArrayList<>();
    private static GestionAhorcado gestionAhorcado = new GestionAhorcado();

    public static void main(String[] args) throws FileNotFoundException {
        llenarArrayIncognitas();
        juego(incognitas);
    }

    public static void llenarArrayIncognitas() throws FileNotFoundException {

        for (int i = 0; i <= 7; i++) {
            int tipo = (int) (Math.random() * 3) + 1;
            String palabra = gestionAhorcado.getPalabra(tipo);

            Incognita incognita = new Incognita(palabra);
            if (tipo == 1) {
                incognita.setTipo("Película");
            } else if (tipo == 2) {
                incognita.setTipo("Libro");
            } else {
                incognita.setTipo("Grupo Musical");
            }
            incognitas.add(incognita);
        }
    }

    public static void juego(ArrayList<Incognita> incognitas) {
        //TODO No se cierra el scanner
        Scanner sc = new Scanner(System.in);
        Dibujo dibujo = new Dibujo();

        System.out.println("¡Bienvenido al Ahorcado mal pagado!");

        for (Incognita incognita : incognitas) {
            String palabra = incognita.getTexto();
            String enigma = convertirEnigma(palabra);

            //TODO     for (Incognita incognita : incognitas) {
            //        playGame(incognita, dibujo, sc);
            //    }

            //TODO Quizas con 3 if sea mas legible
            //TODO por mi parte pienso que el numero de intentos deberia simplemente restar cuando se falle


            for (int numIntentos = 12; numIntentos >= 0; numIntentos--) {

                //TODO Este for lo cambiaria por un while que se ejecute mientras numIntentos sea mayor que 0
                if (enigma.equalsIgnoreCase(palabra)) {
                    System.out.println("Ganaste! Enohrabuena! La incognita era " + palabra);
                    break;
                    //TODO Quizas con un boolean se pueda hacer mas legible TRUE si ganas FALSE si pierdes en vez de break

                } else if (numIntentos >= 0) {
                    dibujo.setDibujoMunyeco(numIntentos);
                    System.out.println(dibujo.getDibujoMunyeco());

                    if (numIntentos <= 6) {
                        System.out.println("Pista: " + incognita.getTipo());
                    }

                    System.out.println("Te quedan " + numIntentos + " intentos");
                    System.out.println("La incógnita es: " + enigma);
                    System.out.println("Introduce una letra: ");
                    char letraIntroducida = sc.next().charAt(0);
                    char letraIntroducidaUpper = Character.toUpperCase(letraIntroducida);

                    enigma = resolverEnigma(palabra, enigma, letraIntroducida, letraIntroducidaUpper);

                } else {
                    System.out.println("Has perdido, la incognita era " + palabra);
                    break;
                    //TODO Quizas con un boolean se pueda hacer mas legible TRUE si ganas FALSE si pierdes en vez de break

                }
            }
        }
    }

    public static String convertirEnigma(String palabra) {
        String enigma = "";
        for (int n = 0; n < palabra.length(); n++) {
            String letra = palabra.substring(n, n + 1);
            if (letra.equals(" ")) {
                enigma = enigma.concat(letra);
            } else {
                enigma = enigma.concat("_");
            }
        }
        return enigma;
    }

    public static String resolverEnigma(String palabra, String enigma, char letraIntroducida, char letraIntroducidaUpper) {
        char[] enigmaArray = enigma.toCharArray();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letraIntroducida) {
                enigmaArray[i] = letraIntroducida;
            } else if (palabra.charAt(i) == letraIntroducidaUpper) {
                enigmaArray[i] = letraIntroducidaUpper;
            }
        }
        enigma = String.valueOf(enigmaArray);
        return enigma;
    }
}
