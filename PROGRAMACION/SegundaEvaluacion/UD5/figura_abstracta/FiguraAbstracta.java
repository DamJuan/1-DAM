public abstract class FiguraAbstracta {
    protected final String nombre;
    public abstract double calularArea();

    public FiguraAbstracta(String nombre) {
        this.nombre = nombre;
    }



    public String toString() {
        return this.nombre + " con area " + this.calularArea();
    }
}