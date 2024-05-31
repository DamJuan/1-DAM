package app;

import app.objetos.Batalla;
import app.objetos.ObjetoMagico;
import app.objetos.Personaje;
import app.utilidades.EntradaSalida;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class TemploOlvidado {

    private static final Logger LOGGER = LogManager.getRootLogger();
    private final String NOMBRE_ARCHIVO_PERSONAJES = "personajes.csv";
    private final String NOMBRE_ARCHIVO_OBJETOS = "objetos.csv";
    private final String NOMBRE_GUARDIANES = "guardianes";
    private final String NOMBRE_LADRONES = "ladrones";
    private final int NUM_OBJETOS_EQUIPADOS_PERMITIDOS = 3;
    private final int OPCION = 3;

    private Scanner sc = new Scanner(System.in);

    private Map<String, Personaje> personajes;
    private Map<Integer, ObjetoMagico> objetosMagicos;
    private List<Batalla> batallas;
    private List<Personaje> guardianes;
    private List<Personaje> ladrones;

    private Batalla batalla;

    public TemploOlvidado() {
        personajes = EntradaSalida.cargarCSVPersonas(NOMBRE_ARCHIVO_PERSONAJES);
        objetosMagicos = EntradaSalida.cargarCSVObjetos(NOMBRE_ARCHIVO_OBJETOS);
        guardianes = new ArrayList<>();
        ladrones = new ArrayList<>();
    }

    /**
     * Método que inicia el juego
     */
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
        batallas = EntradaSalida.recuperarBatallas();
        if(batallas == null || batallas.isEmpty()) {
            System.out.println("No hay batallas épicas que mostrar.");
            return;
        }

        System.out.println("\n**BATALLAS ÉPICAS**");
        int contador = 1;
        for(Batalla batalla : batallas) {
            StringBuilder sb = new StringBuilder();
            sb.append("\nBATALLA ").append(contador);
            sb.append(batalla.isGanadaPorGuardianes()?" ganada por los guardianes:\n":" ganada por los ladrones:\n");
            System.out.println(sb);
            batalla.luchar();
            contador++;
            System.out.println("-------------------------------------------------");
        }
    }

    private void jugarPartida() {

        batalla = nuevoJuego();
        batalla.luchar();
        if(batalla.isGanadaPorGuardianes()) {
            System.out.println("Los guardianes han ganado la batalla. Esta batalla ha sido épica. Quedará almacenada " +
                    " en la historia del templo.");
        } else {
            System.out.println("Los guardianes han perdido la batalla. Para aprender de ella, dejaremos registro" +
                    " en la historia del templo.");
        }

        if(!EntradaSalida.almacenarBatalla(batalla)) {
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

    /**
     * Método que inicia y solicita lo necesario para empezar una nueva partida
     * @return Batalla creada
     */
    private Batalla nuevoJuego() {
System.out.println("Vamos a empezar una nueva partida. Para ello necesitamos que nos indiques el número de " +
                "guardianes y ladrones que van a participar en la batalla.");
        int numeroPersonajes = seleccionNumeroPersonajes();
        guardianes = (List<Personaje>) crearEquiparPersonajes(NOMBRE_GUARDIANES, numeroPersonajes);
        if(guardianes == null) {
            return null;
        }

        ladrones = (List<Personaje>) crearEquiparPersonajes(NOMBRE_LADRONES, numeroPersonajes);
        if(ladrones == null) {
            return null;
        }

        return new Batalla(guardianes, ladrones);

    }

    private int seleccionNumeroPersonajes() {
        System.out.println("En primer lugar indica el número de guardianes que hay en el templo con un valor entre " +
                "1 y 5:");
        int num = 0;
        try {
            num = sc.nextInt();
            if(num <= 0 || num > 5) {
                do {
                    System.out.println("El número de guardianes debe ser un número entre 1 y 5. Vuelve a introducirlo:");
                    num = sc.nextInt();
                } while(num < 0 || num > 5);
            }
        } catch (InputMismatchException e) {
            LOGGER.error("El usuario ha introducido un valor no numérico.");
            System.out.println("El número de guardianes debía ser indicado mediante un número.");
        }
        return num;
    }

    private List crearEquiparPersonajes(String tipoPersonaje, int cantidad) {
        personajes = seleccionarPersonajes(tipoPersonaje, cantidad);

        if(personajes.isEmpty()) {
            return null;
        }
        if(equiparPersonajes(personajes, tipoPersonaje, cantidad)) {
            return new ArrayList<>(personajes.values());
        }
        //TODO no se está devolviendo nada
        System.out.println("Error al equipar personajes. La partida no puede continuar.");
        return null;
    }

    private Map<String, Personaje> seleccionarPersonajes(String tipoPersonaje, int cantidad) {
        Map<String, Personaje> personajesSeleccionados = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        sb.append("Elije a ").append(construirMensajeNumero(cantidad, tipoPersonaje));
        sb.append(" de entre los siguientes personajes.");
        System.out.println(sb.toString());

        mostrarPersonajes();

        sc.nextLine();

        for(int i = 1; i <= cantidad; i++) {
            System.out.println("Introduce el nombre completo del personaje " + (i) + ":");
            String nombre = sc.nextLine();
            //TODO no inicializa personaje en null me genera error nullpointer exception
            Personaje personaje;

            if(personajes.containsKey(nombre.toUpperCase())) {
                personaje = personajes.get(nombre);
                personajesSeleccionados.put(nombre, personaje);

            } else {
                System.out.println("El personaje no existe. Prueba de nuevo.");
                i--;
            }
        }
        return personajesSeleccionados;
    }

    private boolean equiparPersonajes(Map personajes, String tipoPersonaje, int cantidad) {

        StringBuilder sb = new StringBuilder();
        sb.append("Ahora debes equipar a ").append(construirMensajeNumero(cantidad, tipoPersonaje));
        sb.append(" con ").append(NUM_OBJETOS_EQUIPADOS_PERMITIDOS).append(" objetos mágicos");
        sb.append(cantidad > 1?" para cada uno.":".");
        System.out.println(sb);

        mostrarObjetosMagicos();

        for(Object personaje : personajes.values()) {
             objetosMagicos = (Map<Integer, ObjetoMagico>) equipar((Personaje) personaje);
            if(objetosMagicos == null) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    private Object equipar(Personaje personaje) {
        List<ObjetoMagico> objetosEquipados = new ArrayList<>();
        for(int i = 1; i <= NUM_OBJETOS_EQUIPADOS_PERMITIDOS; i++) {
            System.out.println("Introduce el ID del objeto mágico " + i + " que quieres equipar:");
            int id = sc.nextInt();
            ObjetoMagico objeto = null;

            if(objetosMagicos.containsKey(id)) {
                objeto = objetosMagicos.get(id);
                objetosEquipados.add(objeto);
            } else {
                System.out.println("El objeto mágico no existe. Prueba de nuevo.");
                i--;
            }
         objetosMagicos.remove(objeto.getId());
        }
        personaje.setObjetosMagicos(objetosEquipados);
        return objetosMagicos;
    }

    private void mostrarPersonajes() {
        for (Personaje personaje : personajes.values()) {
            System.out.println(personaje);
        }
    }

    private void mostrarObjetosMagicos() {
        for (ObjetoMagico objeto : objetosMagicos.values()) {
            System.out.println(objeto);
        }
    }

    private String construirMensajeNumero(int cantidad, String tipoPersonaje) {
        StringBuilder sb = new StringBuilder();
        sb.append("tu").append(cantidad>1?"s " + cantidad + " ":" ");
        if(cantidad > 1){
            sb.append(tipoPersonaje.equals(NOMBRE_GUARDIANES)?"GUARDIANES":"LADRONES");
        } else {
            sb.append(tipoPersonaje.equals(NOMBRE_GUARDIANES)?"GUARDIÁN":"LADRÓN");
        }
        return sb.toString();
    }
}
