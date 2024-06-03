//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.objetos;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Personaje implements Serializable, Comparable<Personaje> {
    private static final Logger LOGGER = LogManager.getRootLogger();
    private static final long serialVersionUID = 1L;
    private final String nombre;
    private final ClasePersonaje clase;
    private final Atributo atributo;
    private int penalizacion;
    private int puntosExperiencia;
    private boolean esGanador;
    private List<ObjetoMagico> objetosMagicos;

    public boolean tieneObjetosDeAtributo() {
        Iterator var1 = this.objetosMagicos.iterator();

        ObjetoMagico objeto;
        do {
            if (!var1.hasNext()) {
                return Boolean.FALSE;
            }

            objeto = (ObjetoMagico)var1.next();
        } while(!objeto.getAtributo().equals(this.atributo));

        return Boolean.TRUE;
    }

    public int getPoderObjetosDeAtributo() {
        int sumaPoder = 0;
        Iterator var2 = this.objetosMagicos.iterator();

        while(var2.hasNext()) {
            ObjetoMagico objeto = (ObjetoMagico)var2.next();
            if (objeto.getAtributo().equals(this.atributo)) {
                sumaPoder += objeto.getPoder();
            }
        }

        return sumaPoder;
    }

    public int getNumObjetosDeAtributo() {
        int numObjetos = 0;
        Iterator var2 = this.objetosMagicos.iterator();

        while(var2.hasNext()) {
            ObjetoMagico objeto = (ObjetoMagico)var2.next();
            if (objeto.getAtributo().equals(this.atributo)) {
                ++numObjetos;
            }
        }

        return numObjetos;
    }

    public int getPoderTotalObjetos() {
        int sumaPoder = 0;

        ObjetoMagico objeto;
        for(Iterator var2 = this.objetosMagicos.iterator(); var2.hasNext(); sumaPoder += objeto.getPoder()) {
            objeto = (ObjetoMagico)var2.next();
        }

        return sumaPoder;
    }

    public static Personaje crearInstanciaDeCSV(String linea) {
        if (!linea.isEmpty() && !linea.isBlank()) {
            String[] campos = linea.split(";");
            if (campos.length != 5) {
                return null;
            } else {
                try {
                    return new Personaje(campos[0], ClasePersonaje.valueOf(campos[1].toUpperCase()), Atributo.valueOf(campos[4].toUpperCase()), Integer.parseInt(campos[2]), Integer.parseInt(campos[3]));
                } catch (Exception var3) {
                    Exception e = var3;
                    LOGGER.error("Error al crear el personaje: %s", e.getMessage());
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public String getDatosParaVS() {
        String var10000 = this.nombre;
        return var10000 + ", " + this.clase + ", " + this.atributo + ", " + this.getValentia();
    }

    public int getValentia() {
        return this.clase.getValor() - this.penalizacion + this.puntosExperiencia;
    }

    public Personaje(String nombre, ClasePersonaje clase, Atributo atributo, int penalizacion, int puntosExperiencia) {
        this.nombre = nombre;
        this.clase = clase;
        this.atributo = atributo;
        this.setPenalizacion(penalizacion);
        this.setPuntosExperiencia(puntosExperiencia);
    }

    public String getNombre() {
        return this.nombre;
    }

    public ClasePersonaje getClase() {
        return this.clase;
    }

    public Atributo getAtributo() {
        return this.atributo;
    }

    public int getPenalizacion() {
        return this.penalizacion;
    }

    public void setPenalizacion(int penalizacion) {
        if (penalizacion >= 0 && penalizacion <= 100) {
            this.penalizacion = penalizacion;
        } else {
            throw new IllegalArgumentException("La penalización debe estar entre 0 y 100");
        }
    }

    public int getPuntosExperiencia() {
        return this.puntosExperiencia;
    }

    public void setPuntosExperiencia(int puntosExperiencia) {
        if (puntosExperiencia >= 0 && puntosExperiencia <= 100) {
            this.puntosExperiencia = puntosExperiencia;
        } else {
            throw new IllegalArgumentException("El valor de los puntos de experiencia debe estar entre 0 y 100");
        }
    }

    public List<ObjetoMagico> getObjetosMagicos() {
        return this.objetosMagicos;
    }

    public void setObjetosMagicos(List<ObjetoMagico> objetosMagicos) {
        this.objetosMagicos = objetosMagicos;
    }

    public boolean isEsGanador() {
        return this.esGanador;
    }

    public void setEsGanador(boolean esGanador) {
        this.esGanador = esGanador;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Personaje personaje = (Personaje)o;
            return this.nombre.equals(personaje.nombre);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.nombre.hashCode();
    }

    public int compareTo(Personaje o) {
        int compare = Integer.compare(o.getValentia(), this.getValentia());
        if (compare == 0) {
            compare = o.clase.compareTo(this.clase);
        }

        if (compare == 0) {
            compare = o.nombre.compareTo(this.nombre);
        }

        return compare;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Personaje{");
        sb.append("nombre='").append(this.getNombre()).append('\'');
        sb.append(", clase=").append(this.getClase());
        sb.append(", atributo=").append(this.getAtributo());
        sb.append(", penalizacion=").append(this.getPenalizacion());
        sb.append(", puntosExperiencia=").append(this.getPuntosExperiencia());
        sb.append(", valentia=").append(this.getValentia());
        sb.append('}');
        return sb.toString();
    }
}
