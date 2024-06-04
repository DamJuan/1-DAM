package app.objetos;

import java.io.Serializable;
import java.util.List;

public class Personaje implements Serializable, Comparable<Personaje> {

    private String nombre;
    //TODO para que has creado el enum ClasePersonaje si no lo usas?
    private String clase;
    private final Atributo atributo;
    //TODO valentia es calculado, no deberia estar como atributo de la clase. Además no se está calculando aquí en la
    // clase, y es donde debería hacerse. Esto deberia ser un getValencia que calculase dentro todo.
    private int valentia;
    private int puntosExperiencia;
    private boolean esGanador;
    private ObjetoMagico[] objetosMagicos;

    public Personaje(String nombre, String clase, Atributo atributo, int valentia, int puntosExperiencia) {
        this.nombre = nombre;
        this.clase = clase;
        this.atributo = atributo;
        this.valentia = valentia;
        this.puntosExperiencia = puntosExperiencia;
    }

    public static Personaje crearInstanciaDeCSV(String linea) {
        //TODO aqui le aplica lo mismo que al de Objeto, se puede mejorar
        if (!linea.isEmpty() && !linea.isBlank()) {
            String[] campos = linea.split(";");
            if (campos.length != 5) {
                return null;
            } else {
                try {
                    return new Personaje(campos[0].toUpperCase(), campos[1], Atributo.valueOf(campos[4].toUpperCase()), Integer.parseInt(campos[2]), Integer.parseInt(campos[3]));
                } catch (Exception var3) {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public int getValentia() {
        return valentia;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    public boolean esGanador() {
        return esGanador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setValentia(int valentia) {
        this.valentia = valentia;
    }

    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
    }

    public void setEsGanador(boolean esGanador) {
        this.esGanador = esGanador;
    }


    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", atributo='" + atributo + '\'' +
                ", valentia=" + valentia +
                ", puntosExperiencia=" + puntosExperiencia +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personaje personaje = (Personaje) o;

        if (valentia != personaje.valentia) return false;
        if (puntosExperiencia != personaje.puntosExperiencia) return false;
        if (esGanador != personaje.esGanador) return false;
        if (nombre != null ? !nombre.equals(personaje.nombre) : personaje.nombre != null) return false;
        if (clase != null ? !clase.equals(personaje.clase) : personaje.clase != null) return false;
return atributo == personaje.atributo;

    }


    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + (atributo != null ? atributo.hashCode() : 0);
        result = 31 * result + valentia;
        result = 31 * result + puntosExperiencia;
        result = 31 * result + (esGanador ? 1 : 0);
        return result;
    }

    public int compareTo(Personaje o) {
        return Integer.compare(this.valentia, o.valentia);
    }


    public String getDatosParaVS(){
        return this.nombre + ", " + this.clase + ", " + this.atributo + ", " + this.getValentia();
    }

    public ObjetoMagico[] getObjetosMagicos() {
        return objetosMagicos;
    }

    //TODO este método me sorprende mucho.. todavia no se para que vale, pero no me cuadra
    public void setObjetosMagicos(List<ObjetoMagico> objetosMagicos) {
        this.objetosMagicos = objetosMagicos.toArray(new ObjetoMagico[0]);
    }
}
