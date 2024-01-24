public abstract class Triangulo extends FiguraAbstracta {
    private double base;
    private double altura;

    public Triangulo(String tipo, double base, double altura) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}