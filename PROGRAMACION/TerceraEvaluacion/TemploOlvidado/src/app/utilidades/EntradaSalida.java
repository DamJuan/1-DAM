package app.utilidades;

import app.objetos.Batalla;
import app.objetos.ObjetoMagico;
import app.objetos.Personaje;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EntradaSalida {

    public static Map<String, Personaje> cargarCSVPersonas(String nombreArchivo) {
        Map<String, Personaje> personajes = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Personaje personaje = crearPersonajeDeLinea(linea);
                if (personaje != null) {
                    personajes.put(personaje.getNombre(), personaje);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personajes;
    }

    private static Personaje crearPersonajeDeLinea(String linea) {
        String[] partes = linea.split(";");
        if (partes.length != 3) {
            return null;
        }
        try {
            String nombre = partes[0];
            String clase = partes[1];
            String atributo = partes[2];
            Personaje personaje = new Personaje();
            personaje.setNombre(nombre);
            personaje.setClase(clase);
            personaje.setAtributo(atributo);
            return personaje;
        } catch (Exception e) {
            return null;
        }
    }

    public static Map<Integer, ObjetoMagico> cargarCSVObjetos(String nombreArchivo) {
        Map<Integer, ObjetoMagico> objetosMagicos = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                ObjetoMagico objetoMagico = ObjetoMagico.crearInstanciaDeCSV(linea);
                if (objetoMagico != null) {
                    objetosMagicos.put(objetoMagico.getId(), objetoMagico);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objetosMagicos;
    }

    public static Personaje solicitarDatosPersonaje(Map<String, Personaje> personajes) {

        if (personajes.isEmpty()) {
            System.out.println("No hay personajes disponibles.");

        }

        Scanner sc = new Scanner(System.in);
        Personaje personaje = null;
        while (personaje == null) {
            System.out.println("Selecciona un personaje de la lista:");
            for (Personaje p : personajes.values()) {
                System.out.println(p.getDatosParaVS());
            }
            //TODO Mirar porque no imprime la lista
            System.out.print("Introduce el nombre del personaje: ");
            String nombre = sc.nextLine();
            personaje = personajes.get(nombre);
            //TODO al no imprimir la lista no encuentra el nombre y da error
            if (personaje == null) {
                System.out.println("Personaje no encontrado, intenta de nuevo.");
            }
        }
        return personaje;
    }

    public static void equiparObjetos(Personaje personaje, Map<Integer, ObjetoMagico> objetosMagicos, int maxObjetos) {
        Scanner sc = new Scanner(System.in);
        int objetosEquipados = 0;
        while (objetosEquipados <= maxObjetos) {
            System.out.println("Selecciona un objeto mágico de la lista para equipar a " + personaje.getNombre() + ":");
            for (ObjetoMagico o : objetosMagicos.values()) {
                System.out.println(o.getDatosParaVS());
            }
            System.out.print("Introduce el ID del objeto mágico: ");
            int id = sc.nextInt();
            ObjetoMagico objetoMagico = objetosMagicos.get(id);
            if (objetoMagico == null) {
                System.out.println("Objeto no encontrado, intenta de nuevo.");
            } else {
                // Equipar objetos -->
                // personaje.equiparObjeto(objetoMagico);
                objetosEquipados++;
            }
        }
    }

    public static List<Batalla> recuperarBatallas() {
        //TODO IMPLEMENTAR RECUPERAR BATALLAS de datos
        return null;
    }

    public static boolean almacenarBatalla(Batalla batalla) {
        //TODO IMPLEMENTAR almacenar BATALLAS DE DATOS SI GANAN LOS GUERREROS
        return true;
    }
}
