public abstract class Cilindro extends FiguraAbstracta {
    private double area;
    private double volumen;

    private double altura;

    private double radio;

    public Cilindro(String tipo, double area, double volumen, double radio, double altura) {
        super(tipo);
        this.area = area;
        this.volumen = volumen;
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2) * altura + Math.PI * Math.pow(radio,2);
    }
}