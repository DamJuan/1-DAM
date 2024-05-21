package TryCatchFinally;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoTryCatchFinally4 {

    private static Logger LOGGER = LogManager.getRootLogger();

    public static void main(String[] args) {

        System.out.println("Vamos a ver que se ejecuta exactamente:");

        try {

            System.out.println("Instrucción 1");
            System.out.println("Instrucción 2");
            int n = Integer.parseInt("M"); //error forzado
            System.out.println("Instrucción 3");

        } catch (ArithmeticException e) {
            LOGGER.error("¡Error aritmético! No se puede dividir por cero.");
        } finally {
            System.out.println("Instrucciones a ejecutar tanto si se producen errores como si no.");
        }
        System.out.println("Instrucciones posteriores al bloque try/catch");
    }
}