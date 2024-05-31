package app.objetos;

public enum ClasePersonaje {
    MAGA(100),
    GUERRERA(50),
    ESTUDIOSA(0),
    INFORMATICA(75),
    CAZADORA(25);

    private final int VALOR;

    private ClasePersonaje (int valor) {
        this.VALOR = valor;
    }

    public int getValor() {
        return VALOR;
    }


}


