package app.objetos;

public enum ClasePersonaje {
    MAGA(100),
    GUERRERA(50),
    ESTUDIOSA(0),
    INFORMATICA(75),
    CAZADORA(25);

    //TODO Esto es un atributo que ha de ser final si o si, rompe un poco lo habitual y no se escribe en mayúsculas.
    private final int VALOR;

    private ClasePersonaje (int valor) {
        this.VALOR = valor;
    }

    public int getValor() {
        return VALOR;
    }


}
