package app.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Personaje {

    private String nombre;
    private String clase;
    private String atributo;
    private int penalizacion;
    private int puntosExperiencia;
    private boolean esGanador;
    private int puntosClase;
    private int valentia;
    private List<ObjetoMagico> objetosMagicos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
        //TODO SI TENGO TIEMPO HACERLO CON ENUM
        switch(clase) {
            case "MAGA":
                this.puntosClase = 100;
                break;
            case "GUERRERA":
                this.puntosClase = 50;
                break;
            case "ESTUDIOSA":
                this.puntosClase = 0;
                break;
            case "INFORMATICA":
                this.puntosClase = 75;
                break;
            case "CAZADORA":
                this.puntosClase = 25;
                break;
            default:
                throw new IllegalArgumentException("Clase desconocida: " + clase);
        }
        this.valentia = puntosClase - penalizacion + puntosExperiencia;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        if (!atributo.equals("Magia") && !atributo.equals("Inteligencia") && !atributo.equals("Fuerza")) {
            throw new IllegalArgumentException("Atributo desconocido: " + atributo);
        }
        this.atributo = atributo;
    }

    public int getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(int penalizacion) {
        this.penalizacion = penalizacion;
        this.valentia = puntosClase - penalizacion + puntosExperiencia;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
        this.valentia = puntosClase - penalizacion + puntosExperiencia;
    }

    public boolean isEsGanador() {
        return esGanador;
    }

    public void setEsGanador(boolean esGanador) {
        this.esGanador = esGanador;
    }

    public int getValentia() {
        return valentia;
    }

    public List<ObjetoMagico> getObjetosMagicos() {
        return objetosMagicos;
    }

    public void equiparObjeto(ObjetoMagico objeto) {
        objetosMagicos.add(objeto);
    }

    public String getDatosParaVS() {
        return this.nombre + ", " + this.clase + ", " + this.atributo + ", " + this.getValentia();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return penalizacion == personaje.penalizacion && puntosExperiencia == personaje.puntosExperiencia && esGanador == personaje.esGanador && puntosClase == personaje.puntosClase && valentia == personaje.valentia && Objects.equals(nombre, personaje.nombre) && Objects.equals(clase, personaje.clase) && Objects.equals(atributo, personaje.atributo) && Objects.equals(objetosMagicos, personaje.objetosMagicos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, clase, atributo, penalizacion, puntosExperiencia, esGanador, puntosClase, valentia, objetosMagicos);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", atributo='" + atributo + '\'' +
                ", penalizacion=" + penalizacion +
                ", puntosExperiencia=" + puntosExperiencia +
                ", esGanador=" + esGanador +
                ", puntosClase=" + puntosClase +
                ", valentia=" + valentia +
                ", objetosMagicos=" + objetosMagicos +
                '}';
    }


}
