import java.util.Scanner;

public class RetoD {

    static Scanner in = new Scanner(System.in);

    public static void casoDePrueba() {

        char [][] tablero = new char[3][3];

        int contX = 0;
        int contO = 0;

        for (int i = 0; i < tablero.length; i++) {
            String linea = in.nextLine();
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = linea.charAt(j);
                if(tablero[i][j] == 'X'){
                    contX++;
                } else if(tablero[i][j] == 'O'){
                    contO++;
                }
            }
        }

        if(Math.abs(contX - contO) >= 2 || tablero[1][1] == '-'){
            System.out.println("IMPOSIBLE");
        } else {
            if(contX > contO){
                if(tablero[1][1] == 'X'){
                    System.out.println("CRUZ");
                } else {
                    System.out.println("IMPOSIBLE");
                }
            } else if(contX < contO){
                if(tablero[1][1] == 'O'){
                    System.out.println("CIRCULO");
                } else {
                    System.out.println("IMPOSIBLE");
                }
            } else {
                if(tablero[1][1] == 'X'){
                    System.out.println("CRUZ");
                } else if(tablero[1][1] == 'O'){
                    System.out.println("CIRCULO");
                }

            }
        }



    }

    public static void main(String[] args) {

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }
}