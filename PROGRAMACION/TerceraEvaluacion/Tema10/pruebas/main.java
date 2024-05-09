import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<miClase> hashSet = new HashSet<>();
        hashSet.add(new miClase(1, "Murcia"));
        hashSet.add(new miClase(3, "Granada"));
        hashSet.add(new miClase(1, "Segovia"));
        hashSet.add(new miClase(11, "Vigo"));
        hashSet.add(new miClase(9, "Sevilla"));
        hashSet.add(new miClase(1, "Murcia"));
        hashSet.add(new miClase(12, "Valencia"));

        System.out.println("HashSet: " + hashSet);

        miClase miClase = new miClase(3, "Granada");

        for (miClase m : hashSet) {
            if (m.equals(miClase)) {
                m.setNum(33);
            }
        }
        System.out.println("HashSet: " + hashSet);

        miClase miClase2 = new miClase(33, "Granada");

        System.out.println("HashSet contains miClase2: " + hashSet.contains(miClase2));
    }
}