package app;

import app.objetos.Batalla;
import app.objetos.ObjetoMagico;
import app.objetos.Personaje;
import app.utilidades.EntradaSalida;

import java.util.*;

public class TemploOlvidado {

    private final String NOMBRE_ARCHIVO_PERSONAJES = "resources\\bbdd\\personajes.csv";
    private final String NOMBRE_ARCHIVO_OBJETOS = "resources\\bbdd\\objetos.csv";
    private final String NOMBRE_GUARDIANES = "guardianes";
    private final String NOMBRE_LADRONES = "ladrones";
    private final int NUM_OBJETOS_EQUIPADOS_PERMITIDOS = 3;
    private final int OPCION = 3;

    private Scanner sc = new Scanner(System.in);

    private Batalla batalla;
    private Map<String, Personaje> personajes;
    private Map<Integer, ObjetoMagico> objetosMagicos;

    public TemploOlvidado() {
        personajes = EntradaSalida.cargarCSVPersonas(NOMBRE_ARCHIVO_PERSONAJES);
        objetosMagicos = EntradaSalida.cargarCSVObjetos(NOMBRE_ARCHIVO_OBJETOS);
    }

    public void jugar() {
        int opcion = seleccionarOpcionMenu();
        switch (opcion) {
            case 1:
                jugarPartida();
                break;
            case 2:
                mostrarBatallasEpicas();
                break;
            case 3:
                System.out.println("Gracias por elegirnos. Hasta la próxima.");
                break;
            default:
                System.out.println("Opción no válida. El programa se cerrará.");
        }
    }

    private void mostrarBatallasEpicas() {
        List<Batalla> batallas = EntradaSalida.recuperarBatallas();
        if (batallas == null || batallas.isEmpty()) {
            System.out.println("No hay batallas épicas que mostrar.");
            return;
        }

        System.out.println("\n**BATALLAS ÉPICAS**");
        int contador = 1;
        for (Batalla batalla : batallas) {
            StringBuilder sb = new StringBuilder();
            sb.append("\nBATALLA ").append(contador);
            sb.append(batalla.isGanadaPorGuardianes() ? " ganada por los guardianes:\n" : " ganada por los ladrones:\n");
            System.out.println(sb);
            batalla.luchar();
            contador++;
            System.out.println("-------------------------------------------------");
        }
    }

    private void jugarPartida() {
        batalla = nuevoJuego();
        batalla.luchar();
        if (batalla.isGanadaPorGuardianes()) {
            System.out.println("Los guardianes han ganado la batalla. Esta batalla ha sido épica. Quedará almacenada " +
                    "en la historia del templo.");
        } else {
            System.out.println("Los guardianes han perdido la batalla. Para aprender de ella, dejaremos registro" +
                    " en la historia del templo.");
        }

        if (!EntradaSalida.almacenarBatalla(batalla)) {
            System.out.println("Lo sentimos, ha ocurrido un error y no se ha podido almacenar la batalla.");
        }
    }

    private int seleccionarOpcionMenu() {
        System.out.println("\nBienvenido al **TEMPLO OLVIDADO**");
        System.out.println("1. Jugar");
        System.out.println("2. Ver batallas épicas");
        System.out.println("3. Salir");
        System.out.print("\nSeleccione una opción: ");
        return sc.nextInt();
    }

    private Batalla nuevoJuego() {
        int numeroPersonajes = seleccionNumeroPersonajes();
        List<Personaje> guardianes = crearEquiparPersonajes(NOMBRE_GUARDIANES, numeroPersonajes);
        List<Personaje> ladrones = crearEquiparPersonajes(NOMBRE_LADRONES, numeroPersonajes);
        return new Batalla(guardianes, ladrones);
    }

    private int seleccionNumeroPersonajes() {
        System.out.println("En primer lugar indica el número de guardianes que hay en el templo con un valor entre 1 y 5:");
        int num = 0;
        try {
            num = sc.nextInt();
            while (num < 1 || num > 5) {
                System.out.println("Error: debe indicar un número entre 1 y 5:");
                num = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: debe indicar un número entero. Se asignará un número por defecto.");
            num = 3;
        }
        return num;
    }

    private List<Personaje> crearEquiparPersonajes(String tipoPersonaje, int numeroPersonajes) {
        List<Personaje> listaPersonajes = new ArrayList<>();
        for (int i = 0; i < numeroPersonajes; i++) {
            Personaje personaje = EntradaSalida.solicitarDatosPersonaje(personajes);
            EntradaSalida.equiparObjetos(personaje, objetosMagicos, NUM_OBJETOS_EQUIPADOS_PERMITIDOS);
            listaPersonajes.add(personaje);
            personajes.remove(personaje.getNombre());
        }
        System.out.println("Seleccionados " + tipoPersonaje);
        for (Personaje personaje : listaPersonajes) {
            System.out.println(personaje.getDatosParaVS());
        }
        return listaPersonajes;
    }
}
