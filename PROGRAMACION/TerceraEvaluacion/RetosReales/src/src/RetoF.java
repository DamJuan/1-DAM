
import java.util.Scanner;

public class RetoF {
    static Scanner sc = new Scanner(System.in);

    static int contR = 0;
    static int contC = 0;


    public static void casoDePrueba() {

        String size = sc.nextLine();

        char[][] matriz = new char[Integer.parseInt(String.valueOf(size.charAt(0)))][Integer.parseInt(String.valueOf(size.charAt(2)))];

        //TODO COMPROBAR SI HAY UNA R O UNA C EN LA MATRIZ
        //TODO si las letras estan juntas misma fila o columna cuentan como 1
        //TODO si las letras estan por separado es 1

        //TODO CONTAR CADA R Y C

        //TODO COJER EL STRING SACARLO FUERA DEL FOR PARA LUEGO PODER CONTAR CADA LETRA Y ASI PODER CONTAR CADA R Y C

        //TODO CONTAR SOLO LAS R QUE NO TIENEN NINGUNA EN LA POSICION DE DETRAS DELANTE O ABAJO

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 && j == 0){
                    
                }


            }
        }




        System.out.println(contC + " " + contR);


    }

    public static void main(String[] args) {
        casoDePrueba();
    }
}