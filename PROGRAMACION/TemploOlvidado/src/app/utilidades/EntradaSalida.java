package app.utilidades;

import app.objetos.Batalla;
import app.objetos.ObjetoMagico;
import app.objetos.Personaje;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;

public class EntradaSalida {

    private static final Logger LOGGER = LogManager.getRootLogger();
    public static final String RUTA_BBDD = "resources\\bbdd\\";
    public static final String RUTA_DATOS = "resources\\datos";
    public static final String DATA_FILE = "app.TemploOlvidado.dat";

    public static Map<String, Personaje> cargarCSVPersonas(String nombreFichero) {

        if (nombreFichero == null || nombreFichero.isEmpty()) {
            throw new IllegalArgumentException("El nombre del fichero no puede ser nulo ni vacío");
        }

        Map<String, Personaje> grupo = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(RUTA_BBDD + nombreFichero));
            String linea;
            int cont = 0;

            while ((linea = br.readLine()) != null) {
                if (cont == 0) {
                    cont++;
                    continue;
                }
                Personaje personaje = Personaje.crearInstanciaDeCSV(linea);
                if (personaje != null) {
                    grupo.put(personaje.getNombre(), personaje);
                }
            }
        } catch (IOException e) {
            LOGGER.error("Error al cargar el fichero de personajes: %s", e.getMessage());
        }

        return grupo;
    }
    public static Map<Integer,ObjetoMagico> cargarCSVObjetos(String nombreFichero) {

        if (nombreFichero == null || nombreFichero.isEmpty()) {
            throw new IllegalArgumentException("El nombre del fichero no puede ser nulo ni vacío");
        }

        Map<Integer, ObjetoMagico> grupo = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_BBDD + nombreFichero))) {
            String linea;
            int cont = 0;


            while ((linea = br.readLine()) != null) {
                if (cont == 0) {
                    cont++;
                    continue;
                }
                ObjetoMagico objeto = ObjetoMagico.crearInstanciaDeCSV(linea);
                if (objeto != null) {
                    grupo.put(objeto.getId(), objeto);
                }
            }
        } catch (IOException e) {
            LOGGER.error("Error al cargar el fichero de objetos: %s", e.getMessage());
        }

        return grupo;
    }

    public static boolean almacenarBatalla(Batalla batalla) {

        Map<String, Personaje> grupo = new HashMap<>();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(grupo);
            return true;
        } catch (IOException e) {
            LOGGER.error("Error al almacenar la batalla: %s", e.getMessage());
            return false;
        }

    }

    public static List<Batalla> recuperarBatallas(){

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            return (List<Batalla>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            LOGGER.error("Error al recuperar las batallas: %s", e.getMessage());
            return null;
        }

    }

    public static boolean existePartidaGuardada() {
        File file = new File(DATA_FILE);
        return file.exists();
    }

}
