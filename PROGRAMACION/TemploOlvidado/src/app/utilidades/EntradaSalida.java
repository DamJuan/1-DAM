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

            br.readLine();

            while ((linea = br.readLine()) != null) {
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

    //TODO MIS OBJETOS USADOS NO SE PUEDEN REPETIR
    public static Map<Integer,ObjetoMagico> cargarCSVObjetos(String nombreFichero) throws IllegalArgumentException {

        if (nombreFichero == null || nombreFichero.isEmpty()) {
            throw new IllegalArgumentException("El nombre del fichero no puede ser nulo ni vacío");
        }

        Map<Integer, ObjetoMagico> grupo = new HashMap<>();

        //TODO, esto queda mejor usando los parámetros new FileReader(RUTA_BBDD, nombreFichero)
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_BBDD + nombreFichero))) {
            String linea;

            br.readLine();
            while ((linea = br.readLine()) != null) {
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


    //TODO NO TENGO CLARO SI SE GUARDA LA BATALLA
    public static boolean almacenarBatalla(Batalla batallas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(batallas);
            return Boolean.TRUE;
        } catch (IOException e) {
            LOGGER.error("Error al almacenar la batalla: %s", e.getMessage());
            return Boolean.FALSE;
        }
    }

    //TODO NO DETECTA LASS BATALLAS GUARDADAS


    public static HashMap<String, Batalla> recuperarBatallas(){
        HashMap<String, Batalla> batallas = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            batallas = (HashMap<String, Batalla>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            LOGGER.error("Error al recuperar las batallas: %s", e.getMessage());
        }

        return batallas;
    }

    //TODO NO SE USA EXISTE PARTIDA GUATDADA

    public static boolean existePartidaGuardada() {
        File file = new File(DATA_FILE);
        return file.exists();
    }

}
