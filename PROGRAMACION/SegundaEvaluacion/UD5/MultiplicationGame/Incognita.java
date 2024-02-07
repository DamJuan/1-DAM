package MultiplicationGame;

enum TipoIncognita {
    PELICULA, LIBRO, GRUPO_MUSICAL
}

public class Incognita {
    private String texto;
    private TipoIncognita tipo;

    public Incognita(String texto, TipoIncognita tipo) {
        this.texto = texto;
        this.tipo = tipo;
    }

    public TipoIncognita getTipo() {
        return tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Incognita incognita = (Incognita) obj;
        return tipo == incognita.tipo && texto.equals(incognita.texto);
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Texto: " + texto;
    }
}
