package HundirLaFlota.clases;

public class Tablero {

    private static Character[][] tablero = new Character[10][10];

    public static void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
                System.out.println("|");
                System.out.println();
            }
        }
    }

    

}
