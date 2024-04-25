import java.util.ArrayList;
import java.util.Scanner;

public class RetoG {
    static Scanner sc = new Scanner(System.in);

   static ArrayList <String> habilidades = new ArrayList<>();

    public static void procesaInformacion() {
        int numTrabajadores = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numTrabajadores; i++) {
            numTrabajadores();
        }

        int numProyectos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numProyectos; i++){
            ArrayList<String> habilidadesProyecto = numProyectos();

            System.out.println(verificarProyecto(habilidadesProyecto) ? "POSIBLE" : "IMPOSIBLE");
        }
    }


    public static void numTrabajadores() {

        String trabajadores = sc.nextLine();
        String[] trabajadoresArray = trabajadores.split(" ");

        for (int i = 1; i < trabajadoresArray.length; i++) {
            if (!habilidades.contains(trabajadoresArray[i])) {
                habilidades.add(trabajadoresArray[i]);
            }
        }
    }

    public static ArrayList<String> numProyectos() {
        String proyecto = sc.nextLine();
        String[] proyectoArray = proyecto.split(" ");
        ArrayList<String> habilidadesProyecto = new ArrayList<>();

        for (int i = 1; i < proyectoArray.length; i++) {
            habilidadesProyecto.add(proyectoArray[i]);
        }
        return habilidadesProyecto;
    }


    public static boolean verificarProyecto(ArrayList<String> habilidadesProyecto) {
        for (int i = 0; i < habilidadesProyecto.size(); i++) {
            if (!habilidades.contains(habilidadesProyecto.get(i))) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        procesaInformacion();
    }
}