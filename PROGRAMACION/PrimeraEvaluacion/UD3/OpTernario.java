import java.util.Scanner;

public class OpTernario {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Ejercicio1();


    }

public static void Ejercicio1(){

        int diaSem;

        //Preguntamos al usuario un numero del 1 al 7

System.out.println("Introduce un numero del 1 al 7");
    diaSem = sc.nextInt();

    //Comparamos el valor introducido como true o false

    //variable = (condición) ? valorSiVerdadero : valorSiFalso;

String nombreDia = ( diaSem == 1 ) ?  "Lunes" :
            ( diaSem == 2 ) ?  "Martes" :
            ( diaSem == 3 ) ?  "Miercoles" :
            ( diaSem == 4 ) ?  "Jueves" :
            ( diaSem == 5 ) ?  "Viernes" :
            ( diaSem == 6 ) ?  "Sabado" :
            ( diaSem == 7 ) ?  "Domingo" : "Dia no valido";

System.out.println("El dia del numero " + diaSem + " introducido es : " + nombreDia);

}



}