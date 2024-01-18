import oovv.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UsaCasa {
    static Scanner sc = new Scanner(System.in);
    static List<Casa> listaCasas = new ArrayList<>();


    public static void main(String[] args) {

        Casa maCasa = new Casa();
        Casa angel = new Casa("Major", 12, "Lliria", 98, false, 30);
        Casa nacho = new Casa("Serrano", 48, "Olocau");
        Casa jaime = new Casa();

        jaime.setCalle("Valencia");
        jaime.setNumero(1);
        jaime.setPoblacion("La Pobla de Vallbona");
        jaime.setSuperficie(112);
        jaime.setIfGaraje(Boolean.TRUE);
        jaime.setEdad(5);


        nacho.setSuperficie(130);
        nacho.setIfGaraje(Boolean.TRUE);
        nacho.setEdad(40);

        System.out.println(angel.getInfo(angel.getCalle(), angel.getNumero(), angel.getPoblacion(), angel.getSuperficie(), angel.isIfGaraje(), angel.getEdad()));
        System.out.println(nacho.getInfo(nacho.getCalle(), nacho.getNumero(), nacho.getPoblacion(), nacho.getSuperficie(), nacho.isIfGaraje(), nacho.getEdad()));
        System.out.println(jaime.getInfo(jaime.getCalle(), jaime.getNumero(), jaime.getPoblacion(), jaime.getSuperficie(), jaime.isIfGaraje(), jaime.getEdad()));

    }



    public void menu() {
        System.out.println(
                "1) Crear casa" +
                "2) Borrar casa" +
                "3) Salir");
        int opcion = conseguirNumMenu();
        switch (opcion) {
            case 1:
                crearCasa();
                break;
            case 2:
                borrarCasa();
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                System.exit(0);
            default:
        }
    }

    public void crearCasa() {
        String continuar;
        do {
            continuar = "";

            System.out.println(
                    "Introduce los datos de la casa con uno de los siguientes formatos" +
                    "(Formato 1: calle/numero/poblacion/superficie/tienesGaraje/edad)" +
                    "(Formato 2: calle/numero/poblacion)" +
                    "(Formato 3: vacio)");
            String datosTeclado = sc.nextLine();

            String[] matDatos = datosTeclado.split("/");

            try {
                if (matDatos.length == 6) {
                    System.out.println("Deseas guardar los datos o los deseas eliminar?");
                    System.out.println("Calle: " + matDatos[0] + "\n Numero: " + matDatos[1] + "\n Poblacion: " + matDatos[2] + "\n Superficie: " + matDatos[3] + " \n Tienes Garaje: " + matDatos[4] + " \n Edad " + matDatos[5]);

                    // Crear una nueva instancia de Casa con los datos ingresados
                    Casa nuevaCasa = new Casa(matDatos[0], Integer.parseInt(matDatos[1]), matDatos[2], Double.parseDouble(matDatos[3]), Boolean.parseBoolean(matDatos[4]), Integer.parseInt(matDatos[5]));

                    System.out.println("Casa creada:\n" + nuevaCasa);

                } else if (matDatos.length == 3) {
                    System.out.println("Deseas guardar los datos o los deseas eliminar?");
                    System.out.println("Calle: " + matDatos[0] + "\n Numero: " + matDatos[1] + "\n Poblacion: " + matDatos[2]);

                    // Crear una nueva instancia de Casa con los datos ingresados
                    Casa nuevaCasa = new Casa(matDatos[0], Integer.parseInt(matDatos[1]), matDatos[2]);

                    System.out.println("Casa creada:\n" + nuevaCasa);

                } else {
                    System.out.println("Deseas crear una casa vacía?");
                    // Crear una nueva instancia de Casa sin datos
                    Casa nuevaCasa = new Casa();
                    System.out.println("Casa creada vacía:\n" + nuevaCasa);
                }

                System.out.println("Deseas continuar creando casas? (si / no)");
                continuar = sc.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir datos numéricos. No se pudo crear la casa.");
                continuar = "no"; // No se guarda la casa si hay un error en la conversión
            }
        } while (continuar.equalsIgnoreCase("si"));
    }

    public void borrarCasa() {
        if (listaCasas.isEmpty()) {
            System.out.println("No hay casas para borrar.");
            return;
        }

        System.out.println("Lista de casas:");
        for (int i = 0; i < listaCasas.size(); i++) {
            System.out.println((i + 1) + ". " + listaCasas.get(i));
        }

        System.out.println("Seleccione el número de la casa que desea borrar:");
        int opcion = conseguirNumMenu();

        if (opcion > 0 && opcion <= listaCasas.size()) {
            listaCasas.remove(opcion - 1);
            System.out.println("Casa borrada con éxito.");
        } else {
            System.out.println("Opción inválida. No se pudo borrar la casa.");
        }
    }


    public int conseguirNumMenu() {
        System.out.println("\nIntroduce la opcion que deseas realizar");
        int opcion = sc.nextInt();
        return opcion;
    }
}
