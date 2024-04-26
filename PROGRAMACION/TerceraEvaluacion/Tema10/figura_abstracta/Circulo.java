public class Circulo extends FiguraAbstracta implements Figura2D {
    private double radio;

    public Circulo( String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * 2 * radio;
    }

    @Override
    public double calularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    public String toString() {
        return this.nombre + " con area " + this.calularArea() + "y perimetro: " + this.calcularPerimetro();
    }
}
