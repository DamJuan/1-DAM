import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class nuevo {
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

        //crear nuevo set

        Set<miClase> hashSet2 = Set.of(
                new miClase(3, "Granada"),
                new miClase(11, "Vigo")
        );

        System.out.println("HashSet2: " + hashSet2);

        Set<miClase> hashSetInmutable = Collections.unmodifiableSet(hashSet);

        System.out.println("HashSet inmutable: " + hashSetInmutable);

        //hashSetInmutable.add(new miClase(33, "Granada"));
        //hashSet2.add(new miClase(33, "Granada"));

        //System.out.println("HashSet2: " + hashSet2);
        //System.out.println("HashSet inmutable: " + hashSetInmutable);

        hashSet.add(new miClase(33, "Granada"));
        System.out.println("HashSet inmutable: " + hashSetInmutable);

        miClase cordoba = new miClase(14, "Cordoba");
        miClase almeria = new miClase(15, "Almeria");
        miClase malaga = new miClase(16, "Malaga");

        Set<miClase> conjunto1 = new HashSet<>();
        Set<miClase> conjunto2 = Set.of(cordoba, almeria, malaga);
        Set<miClase> conjunto3 = Collections.unmodifiableSet(conjunto1);

        conjunto1.add(cordoba);
        conjunto1.add(almeria);
        conjunto1.add(malaga);

        System.out.println("conjunto1: " + conjunto1);
        System.out.println("conjunto2: " + conjunto2);
        System.out.println("conjunto3: " + conjunto3);

        cordoba.setTxt("Crba");

        System.out.println("conjunto1: " + conjunto1);
        System.out.println("conjunto2: " + conjunto2);
        System.out.println("conjunto3: " + conjunto3);



    }
}
