package bingo.clases;

import java.util.Objects;

public class Jugador {

    private String nombre;
    private String ciudad;
    private int edad;

    // Constructor

    public Jugador(String nombre, String ciudad, int edad) {
        setNombre(nombre);
        setCiudad(ciudad);
        setEdad(edad);
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Equals, HashCode y ToString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return edad == jugador.edad && Objects.equals(nombre, jugador.nombre) && Objects.equals(ciudad, jugador.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ciudad, edad);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", " +
                "Ciudad: " + getCiudad() + ", " +
                "Edad: " + getEdad() + " años";
    }
}
