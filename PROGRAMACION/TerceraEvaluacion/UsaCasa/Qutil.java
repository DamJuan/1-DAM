package oovv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qutil {
    public static boolean esVocal(String palabraComprobar) {
        Pattern inicial = Pattern.compile("^[aeiouAEIOU].*");
        Matcher vocal = inicial.matcher(palabraComprobar);
        return vocal.matches();
    }
}
