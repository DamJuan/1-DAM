package UD9.ahorcado.nacho.clases;

import java.util.Objects;

public class Incognita {

    private String texto;
    private String tipo;

    public Incognita(String texto) {
        setTexto(texto);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incognita incognita = (Incognita) o;
        return Objects.equals(texto, incognita.texto) && Objects.equals(tipo, incognita.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, tipo);
    }

    @Override
    public String toString() {
        return "Incognita{" +
                "texto='" + texto + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
