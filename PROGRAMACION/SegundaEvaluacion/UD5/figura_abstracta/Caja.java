public class Caja extends FiguraAbstracta implements Figura3D {
    protected double ancho;
    protected double largo;
    protected double altura;

    public Caja(String nombre, double ancho, double largo, double altura) {
        super(nombre);
        this.ancho = ancho;
        this.largo = largo;
        this.altura = altura;
    }


    @Override
    public double calularVolumen() {
        return ancho * largo * altura;
    }

    @Override
    public double calularArea() {
        return 2 * (largo * ancho) + (2 * largo + 2 * ancho) * altura;
    }

    @Override
    public String toString() {
        return this.nombre + " con area " + this.calularArea() + "y volumen: " + this.calularVolumen();
    }
}
