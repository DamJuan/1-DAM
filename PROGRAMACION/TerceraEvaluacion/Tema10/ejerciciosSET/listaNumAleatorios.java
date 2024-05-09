import java.util.HashSet;
import java.util.Set;

public class listaNumAleatorios {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        for (int i = 0; i < 50; i++) {
            numeros[i] = (int) (Math.random() * 10 + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            set.add(numeros[i]);
        }

        System.out.println("Lista de numeros aleatorios: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nLista de numeros aleatorios sin duplicados: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }

        System.out.println("\nLa lista contiene el número 5? " + set.contains(5));

        set.add(0);
        set.add(15);
        set.add(25);

        System.out.println("Lista de numeros aleatorios sin duplicados y ordenados de menor a mayor: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }

        set.remove(5);
        System.out.println("\nLista de numeros aleatorios sin duplicados y sin el número 5: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }














    }
}
