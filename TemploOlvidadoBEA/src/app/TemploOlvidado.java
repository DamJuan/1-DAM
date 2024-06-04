//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app;

import app.objetos.Batalla;
import app.objetos.ObjetoMagico;
import app.objetos.Personaje;
import app.utilidades.EntradaSalida;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TemploOlvidado {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = LogManager.getRootLogger();
    private static final String NOMBRE_ARCHIVO_PERSONAJES = "personajes.csv";
    private static final String NOMBRE_ARCHIVO_OBJETOS = "objetos.csv";
    private static final String NOMBRE_GUARDIANES = "guardianes";
    private static final String NOMBRE_LADRONES = "ladrones";
    private static final int NUM_OBJETOS_EQUIPADOS_PERMITIDOS = 3;
    private static final int OPCION = 3;
    private Scanner sc;
    private Map<String, Personaje> personajes;
    private Map<Integer, ObjetoMagico> objetosMagicos;
    private Batalla batalla;

    public TemploOlvidado() {
        this.sc = new Scanner(System.in);
        this.personajes = EntradaSalida.cargarCSVPersonas("personajes.csv");
        this.objetosMagicos = EntradaSalida.cargarCSVObjetos("objetos.csv");
    }

    public void jugar() {
        int opcion = this.seleccionarOpcionMenu();
        switch (opcion) {
            case 1 -> this.jugarPartida();
            case 2 -> this.mostrarBatallasEpicas();
            case 3 -> System.out.println("Gracias por elegirnos. Hasta la próxima.");
            default -> System.out.println("Opción no válida. El programa se cerrará.");
        }

    }

    private void mostrarBatallasEpicas() {
        List<Batalla> batallas = EntradaSalida.recuperarBatallas();
        if (batallas != null && !batallas.isEmpty()) {
            System.out.println("\n**BATALLAS ÉPICAS**");
            int contador = 1;
            Iterator var3 = batallas.iterator();

            while(var3.hasNext()) {
                Batalla batalla = (Batalla)var3.next();
                StringBuilder sb = new StringBuilder();
                sb.append("\nBATALLA ").append(contador);
                sb.append(batalla.isGanadaPorGuardianes() ? " ganada por los guardianes:\n" : " ganada por los ladrones:\n");
                System.out.println(sb);
                batalla.luchar();
                ++contador;
                System.out.println("-------------------------------------------------");
            }

        } else {
            System.out.println("No hay batallas épicas que mostrar.");
        }
    }

    private void jugarPartida() {
        if (this.personajes != null && !this.personajes.isEmpty() && this.objetosMagicos != null && !this.objetosMagicos.isEmpty()) {
            this.batalla = this.nuevoJuego();
            if (this.batalla != null) {
                if (!this.batalla.luchar()) {
                    System.out.println("Ha ocurrido un error en la batalla. El programa se cerrará.");
                } else {
                    if (this.batalla.isGanadaPorGuardianes()) {
                        System.out.println("Los guardianes han ganado la batalla. Esta batalla ha sido épica. Quedará almacenada  en la historia del templo.");
                    } else {
                        System.out.println("Los guardianes han perdido la batalla. Para aprender de ella, dejaremos registro en la historia del templo.");
                    }

                    if (!EntradaSalida.almacenarBatalla(this.batalla)) {
                        System.out.println("Lo sentimos, ha ocurrido un error y no se ha podido almacenar la batalla.");
                    }

                }
            }
        } else {
            LOGGER.error("No se han podido cargar los personajes y/o los objetos mágicos.");
            System.out.println("Ha ocurrido un error en la carga de datos. El programa se cerrará");
        }
    }

    private int seleccionarOpcionMenu() {
        System.out.println("\nBienvenido al **TEMPLO OLVIDADO**");
        System.out.println("1. Jugar");
        System.out.println("2. Ver batallas épicas");
        System.out.println("3. Salir");
        System.out.print("\nSeleccione una opción: ");

        try {
            return this.sc.nextInt();
        } catch (InputMismatchException var2) {
            LOGGER.warn("El usuario ha introducido un valor no numérico.");
            System.out.println("La opción debía ser indicada mediante un número.");
            return 0;
        }
    }

    private Batalla nuevoJuego() {
        int numeroPersonajes = this.seleccionNumeroPersonajes();
        if (numeroPersonajes == 0) {
            return null;
        } else {
            TreeSet<Personaje> guardianes = this.crearEquiparPersonajes("guardianes", numeroPersonajes);
            if (guardianes != null && !guardianes.isEmpty()) {
                TreeSet<Personaje> ladrones = this.crearEquiparPersonajes("ladrones", numeroPersonajes);
                if (guardianes != null && !guardianes.isEmpty() && ladrones != null && !ladrones.isEmpty()) {
                    return new Batalla(guardianes, ladrones);
                } else {
                    System.out.println("No se han podido crear los personajes con sus objetos. El programa se cerrará.");
                    return null;
                }
            } else {
                System.out.println("No se han podido crear los personajes con sus objetos. El programa se cerrará.");
                return null;
            }
        }
    }

    private int seleccionNumeroPersonajes() {
        System.out.println("En primer lugar indica el número de guardianes que hay en el templo con un valor entre 1 y 5:");
        int num = 0;

        try {
            num = this.sc.nextInt();
            if (num <= 0 || num > 5) {
                do {
                    do {
                        System.out.println("El número de guardianes debe ser un número entre 1 y 5. Vuelve a introducirlo:");
                        num = this.sc.nextInt();
                    } while(num < 0);
                } while(num > 5);
            }
        } catch (InputMismatchException var3) {
            LOGGER.warn("El usuario ha introducido un valor no numérico.");
            System.out.println("El número de guardianes debía ser indicado mediante un número.");
        }

        return num;
    }

    private TreeSet<Personaje> crearEquiparPersonajes(String tipoPersonaje, int cantidad) {
        TreeSet<Personaje> personajes = this.seleccionarPersonajes(tipoPersonaje, cantidad);
        if (personajes.isEmpty()) {
            return null;
        } else {
            return this.equiparPersonajes(personajes, tipoPersonaje, cantidad) ? personajes : null;
        }
    }

    private TreeSet<Personaje> seleccionarPersonajes(String tipoPersonaje, int cantidad) {
        TreeSet<Personaje> personajesSeleccionados = new TreeSet();
        StringBuilder sb = new StringBuilder();
        sb.append("Elije a ").append(this.construirMensajeNumero(cantidad, tipoPersonaje));
        sb.append(" de entre los siguientes personajes.");
        System.out.println(sb.toString());
        this.mostrarPersonajes();
        this.sc.nextLine();

        for(int i = 1; i <= cantidad; ++i) {
            System.out.println("Introduce el nombre completo del personaje " + i + ":");
            String nombre = this.sc.nextLine();
            Personaje personaje = null;
            if (this.personajes.containsKey(nombre.toUpperCase())) {
                personaje = (Personaje)this.personajes.remove(nombre.toUpperCase());
                if (personaje != null) {
                    personajesSeleccionados.add(personaje);
                }
            } else {
                System.out.println("El personaje no existe. Prueba de nuevo.");
                --i;
            }
        }

        return personajesSeleccionados;
    }

    private boolean equiparPersonajes(TreeSet<Personaje> personajes, String tipoPersonaje, int cantidad) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ahora debes equipar a ").append(this.construirMensajeNumero(cantidad, tipoPersonaje));
        sb.append(" con ").append(3).append(" objetos mágicos");
        sb.append(cantidad > 1 ? " para cada uno." : ".");
        System.out.println(sb.toString());
        this.mostrarObjetosMagicos();
        Iterator var5 = personajes.iterator();

        while(var5.hasNext()) {
            Personaje personaje = (Personaje)var5.next();
            List<ObjetoMagico> objetosMagicos = this.equipar(personaje);
            if (objetosMagicos.isEmpty() || objetosMagicos.size() != 3) {
                return Boolean.FALSE;
            }

            personaje.setObjetosMagicos(objetosMagicos);
        }

        return Boolean.TRUE;
    }

    private List<ObjetoMagico> equipar(Personaje personaje) {
        List<ObjetoMagico> objetosMagicos = new ArrayList();

        try {
            for(int i = 1; i <= 3; ++i) {
                System.out.println("Introduce el identificador del objeto mágico " + i + " que quieres equipar a " + personaje.getNombre() + ":");
                int key = this.sc.nextInt();
                ObjetoMagico objetoMagico = (ObjetoMagico)this.objetosMagicos.get(key);
                if (objetoMagico == null) {
                    System.out.println("El objeto mágico no existe. Prueba de nuevo.");
                    --i;
                } else {
                    objetosMagicos.add(objetoMagico);
                }
            }
        } catch (InputMismatchException var6) {
            LOGGER.warn("El usuario ha introducido un valor no numérico para la selección del objeto mágico.");
            System.out.println("El identificador de objeto mágico debía ser indicado mediante un número.");
        }

        return objetosMagicos;
    }

    private void mostrarPersonajes() {
        Iterator var1 = this.personajes.keySet().iterator();

        while(var1.hasNext()) {
            String key = (String)var1.next();
            System.out.println(this.personajes.get(key));
        }

    }

    private void mostrarObjetosMagicos() {
        Iterator var1 = this.objetosMagicos.keySet().iterator();

        while(var1.hasNext()) {
            Integer key = (Integer)var1.next();
            System.out.println(this.objetosMagicos.get(key));
        }

    }

    private String construirMensajeNumero(int cantidad, String tipoPersonaje) {
        StringBuilder sb = new StringBuilder();
        sb.append("tu").append(cantidad > 1 ? "s " + cantidad + " " : " ");
        if (cantidad > 1) {
            sb.append(tipoPersonaje.equals("guardianes") ? "GUARDIANES" : "LADRONES");
        } else {
            sb.append(tipoPersonaje.equals("guardianes") ? "GUARDIÁN" : "LADRÓN");
        }

        return sb.toString();
    }
}
