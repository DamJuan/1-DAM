public class Cilindro extends FiguraAbstracta implements Figura3D {

    private double radio;

    private double altura;

    public Cilindro(String nombreFigura, double radio, double altura) {
        super(nombreFigura);
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double calularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double calularArea() {
        return (2 * Math.PI * radio *altura) + (2 * Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return this.nombre + " con area " + this.calularArea() + "y volumen: " + this.calularVolumen();
    }
}