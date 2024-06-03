//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.utilidades;

import app.objetos.Batalla;
import app.objetos.ObjetoMagico;
import app.objetos.Personaje;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntradaSalida {
    private static final Logger LOGGER = LogManager.getRootLogger();
    public static final String RUTA_BBDD = "resources/bbdd/";
    public static final String RUTA_DATOS = "src/datos/";
    public static final String DATA_FILE = "app.TemploOlvidado.dat";

    public EntradaSalida() {
    }

    public static Map<String, Personaje> cargarCSVPersonas(String nombreFichero) {
        File demo = new File("resources/bbdd/", nombreFichero);
        Map<String, Personaje> grupo = new HashMap();

        try {
            BufferedReader br = new BufferedReader(new FileReader(demo));

            try {
                String line = br.readLine();

                while((line = br.readLine()) != null) {
                    Personaje personaje = Personaje.crearInstanciaDeCSV(line);
                    if (personaje != null) {
                        grupo.put(personaje.getNombre().toUpperCase(), personaje);
                    }
                }
            } catch (Throwable var7) {
                try {
                    br.close();
                } catch (Throwable var6) {
                    var7.addSuppressed(var6);
                }

                throw var7;
            }

            br.close();
        } catch (Exception var8) {
            Exception e = var8;
            LOGGER.error(e);
        }

        return grupo;
    }

    public static Map<Integer, ObjetoMagico> cargarCSVObjetos(String nombreFichero) {
        File demo = new File("resources/bbdd/", nombreFichero);
        Map<Integer, ObjetoMagico> grupo = new HashMap();

        try {
            BufferedReader br = new BufferedReader(new FileReader(demo));

            try {
                String line = br.readLine();

                while((line = br.readLine()) != null) {
                    ObjetoMagico objeto = ObjetoMagico.crearInstanciaDeCSV(line);
                    if (objeto != null) {
                        grupo.put(objeto.getId(), objeto);
                    }
                }
            } catch (Throwable var7) {
                try {
                    br.close();
                } catch (Throwable var6) {
                    var7.addSuppressed(var6);
                }

                throw var7;
            }

            br.close();
        } catch (Exception var8) {
            Exception e = var8;
            LOGGER.error(e);
        }

        return grupo;
    }

    public static boolean almacenarBatalla(Batalla batalla) {
        List<Batalla> listaBatallas = recuperarBatallas();
        listaBatallas.add(batalla);

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("src/datos/", "app.TemploOlvidado.dat")));

            try {
                objectOutputStream.writeObject(listaBatallas);
            } catch (Throwable var6) {
                try {
                    objectOutputStream.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            objectOutputStream.close();
        } catch (IOException var7) {
            IOException e = var7;
            LOGGER.error(e);
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public static List<Batalla> recuperarBatallas() {
        List<Batalla> listaBatallas = new ArrayList();
        File file = new File("src/datos/", "app.TemploOlvidado.dat");
        if (file.exists() && file.length() > 0L) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

                try {
                    listaBatallas = (List)objectInputStream.readObject();
                } catch (Throwable var6) {
                    try {
                        objectInputStream.close();
                    } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                    }

                    throw var6;
                }

                objectInputStream.close();
            } catch (ClassNotFoundException | IOException var7) {
                Exception e = var7;
                LOGGER.error(e);
            }
        }

        return (List)listaBatallas;
    }

    public static boolean existePartidaGuardada() {
        File file = new File("src/datos/", "app.TemploOlvidado.dat");
        return file.exists();
    }
}
