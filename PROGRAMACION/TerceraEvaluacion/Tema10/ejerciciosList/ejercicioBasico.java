import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicioBasico {

    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> lista = new ArrayList<>(Arrays.asList(array));

        lista.add(11);

        Integer[] nuevoArray = lista.toArray(new Integer[0]);

        System.out.println("El nuevo array es: " + nuevoArray);

        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.println(nuevoArray[i]);
        }

    }

}
