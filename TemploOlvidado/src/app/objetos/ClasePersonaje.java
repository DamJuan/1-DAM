//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.objetos;

public enum ClasePersonaje implements Comparable<ClasePersonaje> {
    MAGA(100),
    INFORMATICA(75),
    GUERRERA(50),
    CAZADORA(25),
    ESTUDIOSA(0);

    private final int valor;

    private ClasePersonaje(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
