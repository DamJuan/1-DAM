package app.objetos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.Serializable;


//todo implementa la interfaz Serializable
public final class ObjetoMagico implements Serializable, Comparable<ObjetoMagico> {

    //TODO completar manteniendo el nombre de las variables propuestas

    private final int ID;
    private final Atributo ATRIBUTO;
    private final String NOMBRE;
    private final int PODER;

    private static final Logger LOGGER = LogManager.getRootLogger();


    public static ObjetoMagico crearInstanciaDeCSV(String linea) {
        if (!linea.isEmpty() && !linea.isBlank()) {
            String[] campos = linea.split(";");
            if (campos.length != 4) {
                return null;
            } else {
                try {
                    return new ObjetoMagico(Integer.parseInt(campos[0].toUpperCase()), Atributo.valueOf(campos[2].toUpperCase()), campos[1], Integer.parseInt(campos[3]));
                } catch (Exception e) {
                    LOGGER.error("Error al crear el objeto: %s", e.getMessage());
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public ObjetoMagico(int id, Atributo atributo, String nombre, int poder) {
        this.ID = id;
        this.ATRIBUTO = atributo;
        this.NOMBRE = nombre;
        this.PODER = poder;
    }

    public int getId() {
        return ID;
    }

    public Atributo getAtributo() {
        return ATRIBUTO;
    }

    public String getNombre() {
        return NOMBRE;
    }

    public int getPoder() {
        return PODER;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ObjetoMagico{");
        sb.append("id=").append(getId());
        sb.append(", atributo=").append(getAtributo());
        sb.append(", nombre='").append(getNombre()).append('\'');
        sb.append(", poder=").append(getPoder());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjetoMagico that = (ObjetoMagico) o;
        return ID == that.ID;
    }

    @Override
    public int hashCode() {
        return ID;
    }

    @Override
    public int compareTo(ObjetoMagico o) {
        return Integer.compare(this.ID, o.ID);
    }



    public String getDatosParaVS(){
        return this.ID + " -> " + this.NOMBRE + ", " + this.ATRIBUTO + ", " + this.PODER;
    }

}
