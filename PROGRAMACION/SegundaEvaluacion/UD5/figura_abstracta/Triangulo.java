public class Triangulo extends FiguraAbstracta implements Figura2D {

    protected double altura;
    protected double ladoBase;
    protected double lado2;
    protected double lado3;

    public Triangulo(String nombre,double altura,double ladoBase, double lado2, double lado3) {
        super(nombre);
        this.ladoBase = ladoBase;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return ladoBase + lado2 + lado3;
    }

    @Override
    public double calularArea() {
        return (ladoBase * altura) / 2;
    }
    public String toString() {
        return this.nombre + " con area " + this.calularArea() + "y perimetro: " + this.calcularPerimetro();
    }
}
