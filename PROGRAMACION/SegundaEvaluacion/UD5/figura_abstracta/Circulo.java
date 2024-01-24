public abstract class Circulo extends FiguraAbstracta {
    private double radio;

    public Circulo(String tipo, double radio) {
        super(tipo);
        this.radio = radio;
    }
    @Override
    public double calcularPerimetro() {
        return Math.PI * Math.pow(radio, 2);
    }
}
