package Bingo;

import java.util.*;

public class Carton {
    private int[][] numeros;

    public Carton() {
        numeros = new int[3][9];
        generarCarton();
    }

    public void generarCarton() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                numeros[i][j] = random.nextInt (10) + j * 10 + 1;
            }
        }
    }

    public void mostrarCarton() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public boolean contieneNumero(int num) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if (numeros[i][j] == num) {
                    numeros[i][j] = 0;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean cartonCompletado() {
        for (int i = 0; i < 3; i++) {
            boolean completado = true;
            for (int j = 0; j < 9; j++) {
                if (numeros[i][j] != 0) {
                    completado = false;
                    break;
                }
            }
            if (completado) {
                return true;
            }
        }
        return false;
    }

}
