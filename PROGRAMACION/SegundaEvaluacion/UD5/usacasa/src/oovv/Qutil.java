package oovv;

public class Qutil {
    public static Boolean esVocal(String poblacion) {

        boolean esVocal;


        if ("a".equalsIgnoreCase(poblacion.substring(0, 1)) || "e".equalsIgnoreCase(poblacion.substring(0, 1)) || "i".equalsIgnoreCase(poblacion.substring(0, 1)) || "o".equalsIgnoreCase(poblacion.substring(0, 1)) || "u".equalsIgnoreCase(poblacion.substring(0, 1))) {

            esVocal = Boolean.TRUE;

        } else {
            esVocal = Boolean.FALSE;
        }

        return esVocal;

    }

    public static Boolean esVocal(char caracter) {

        boolean esVocal;


        if ('a' == caracter || 'e' == caracter || 'i' == caracter || 'o' == caracter || 'u' == caracter) {

            esVocal = Boolean.TRUE;

        } else {
            esVocal = Boolean.FALSE;
        }

        return esVocal;

    }
}
