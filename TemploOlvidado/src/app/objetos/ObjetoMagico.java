//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.objetos;

import java.io.Serializable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ObjetoMagico implements Serializable, Comparable<ObjetoMagico> {
    private static final Logger LOGGER = LogManager.getRootLogger();
    private static final long serialVersionUID = 1L;
    private final int id;
    private final Atributo atributo;
    private final String nombre;
    private final int poder;

    public static ObjetoMagico crearInstanciaDeCSV(String linea) {
        if (!linea.isEmpty() && !linea.isBlank()) {
            String[] campos = linea.split(";");
            if (campos.length != 4) {
                return null;
            } else {
                try {
                    return new ObjetoMagico(Integer.parseInt(campos[0]), Atributo.valueOf(campos[2].toUpperCase()), campos[1], Integer.parseInt(campos[3]));
                } catch (Exception var3) {
                    Exception e = var3;
                    LOGGER.error("Error al crear el objeto: %s", e.getMessage());
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public String getDatosParaVS() {
        return this.id + " -> " + this.nombre + ", " + this.atributo + ", " + this.poder;
    }

    public ObjetoMagico(int id, Atributo atributo, String nombre, int poder) {
        this.id = id;
        this.atributo = atributo;
        this.nombre = nombre;
        this.poder = poder;
    }

    public int getId() {
        return this.id;
    }

    public Atributo getAtributo() {
        return this.atributo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPoder() {
        return this.poder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ObjetoMagico{");
        sb.append("id=").append(this.getId());
        sb.append(", atributo=").append(this.getAtributo());
        sb.append(", nombre='").append(this.getNombre()).append('\'');
        sb.append(", poder=").append(this.getPoder());
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ObjetoMagico that = (ObjetoMagico)o;
            return this.id == that.id;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.id;
    }

    public int compareTo(ObjetoMagico otroObjeto) {
        int comparacion = this.atributo.compareTo(otroObjeto.atributo);
        if (comparacion == 0) {
            comparacion = Integer.compare(this.poder, otroObjeto.poder);
        }

        return comparacion;
    }
}
