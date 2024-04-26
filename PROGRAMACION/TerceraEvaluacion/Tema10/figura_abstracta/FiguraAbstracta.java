public abstract class FiguraAbstracta implements Comparable<FiguraAbstracta> {
    protected final String nombre;
    public abstract double calularArea();

    public FiguraAbstracta(String nombre) {
        this.nombre = nombre;
        this.calularArea();
    }

    @Override
    public int compareTo(FiguraAbstracta figura) {
        return Double.compare(this.calularArea(), figura.calularArea());
    }

    public String toString() {
        return this.nombre + " con area " + this.calularArea();
    }
}