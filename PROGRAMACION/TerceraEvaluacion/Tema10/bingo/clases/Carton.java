package bingo.clases;

import java.util.ArrayList;
import java.util.List;

public class Carton {

    private String[][] carton = new String[3][9];
    private String[][] cartonCopia = new String[3][9];
    private List<Integer> numerosCarton = new ArrayList<>();
    private int[] numLineas = new int[3];

    public Carton() {

        int num = 0;

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 3; j++) {

                int numRandom = generarNumero(num, i);

                boolean dejarEnBlanco = dejarEnBlanco();

                if (dejarEnBlanco || numerosCarton.size() == 15 || numLineas[j] == 5) {

                    carton[j][i] = "  ";

                } else {

                    carton[j][i] = String.valueOf(numRandom);
                    numLineas[j]++;
                    numerosCarton.add(numRandom);
                }

            }

            num += 10;
        }
        verificacionCarton();
    }

    public void mostrarCarton() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("[" + carton[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public void verificacionCarton() {
        if (numerosCarton.size() < 15) {
            int num = 0;

            for (int i = 0; i < 9; i++) {

                for (int j = 0; j < 3; j++) {

                    boolean dejarEnBlanco = dejarEnBlanco();

                    if (carton[j][i].equals("  ") && !dejarEnBlanco && numLineas[j] < 5) {

                        int numRandom = generarNumero(num, i);

                        carton[j][i] = String.valueOf(numRandom);
                        numLineas[j]++;
                        numerosCarton.add(numRandom);
                    }
                }

                num += 10;
            }
        } else {
            return;
        }

        verificacionCarton();
        crearCartonCopia();
    }

    public void crearCartonCopia() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                cartonCopia[i][j] = carton[i][j];
            }
        }
    }

    public int generarNumero(int num, int columna) {
        int numRandom;

        do {
            if (columna == 0) {
                numRandom = (int) (Math.random() * 9) + 1;
            } else if (columna == 8) {
                numRandom = (int) (Math.random() * 11) + num;
            } else {
                numRandom = (int) (Math.random() * 10) + num;
            }
        } while (numerosCarton.contains(numRandom));

        return numRandom;
    }

    public boolean dejarEnBlanco() {
        int dejarEnBlanco = (int) (Math.random() * 2);

        if (dejarEnBlanco == 0) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public boolean comprobarNumero(int num) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (cartonCopia[i][j].equals(String.valueOf(num))) {
                    cartonCopia[i][j] = "X";
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    public boolean comprobarBingo() {

        int contador = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 9; j++) {

                if (cartonCopia[i][j].equals("X")) {
                    contador++;
                }
            }

            if (contador == 15) {
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }

    public void mostrarCartonCopia() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("[" + cartonCopia[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
