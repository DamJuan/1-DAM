import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

    public static void main(String[] args) {


        //HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Juan", "25");
        hashMap.put("Maria", "30");
        hashMap.put("Pedro", "40");
        hashMap.put("Ana", "20");
        hashMap.put("Luis", "35");

        //TreeMap
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Juan", "25");
        treeMap.put("Maria", "30");
        treeMap.put("Pedro", "40");
        treeMap.put("Ana", "20");
        treeMap.put("Luis", "35");


        //LinkedHashMap
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Juan", "25");
        linkedHashMap.put("Maria", "30");
        linkedHashMap.put("Pedro", "40");
        linkedHashMap.put("Ana", "20");
        linkedHashMap.put("Luis", "35");

        System.out.println("Imprimir mapas completos: ");

        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        System.out.println("Imprimir valores asociados a la clave: ");

        System.out.println("HashMap: " + hashMap.get("Juan"));
        System.out.println("TreeMap: " + treeMap.get("Juan"));
        System.out.println("LinkedHashMap: " + linkedHashMap.get("Juan"));

        System.out.println("Buscar por clave:");

        System.out.println("HashMap: " + hashMap.containsKey("Juan"));
        System.out.println("TreeMap: " + treeMap.containsKey("Juan"));
        System.out.println("LinkedHashMap: " + linkedHashMap.containsKey("Juan"));

        System.out.println("Eliminar valores:");

        hashMap.remove("Juan");
        System.out.println("Valor eliminado con HashMap: " + hashMap);
        treeMap.remove("Juan");
        System.out.println("Valor eliminado con TreeMap: " + treeMap);
        linkedHashMap.remove("Juan");
        System.out.println("Valor eliminado con LinkedHashMap: " + linkedHashMap);

        System.out.println("Tamaño de los mapas: ");

        System.out.println("HashMap: " + hashMap.size());
        System.out.println("TreeMap: " + treeMap.size());
        System.out.println("LinkedHashMap: " + linkedHashMap.size());

        System.out.println("Buscar por edad: ");

        System.out.println("HashMap: " + hashMap.get("Maria"));
        System.out.println("TreeMap: " + treeMap.get("Maria"));
        System.out.println("LinkedHashMap: " + linkedHashMap.get("Maria"));


        System.out.println("Buscar por edad por metodo: ");

        buscarEdad(hashMap, "Maria");
        buscarEdad(treeMap, "Maria");
        buscarEdad(linkedHashMap, "Maria");



    }

    public static void buscarEdad(Map<String, String> map, String nombre) {
        System.out.println("Edad de " + nombre + ": " + map.get(nombre));
    }

}
