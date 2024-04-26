public class Cuadrado extends FiguraAbstracta implements Figura2D{

    public double lado;


    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    @Override
         public String toString() {
             return this.nombre + " con area " + this.calularArea() + "y perimetro: " + this.calcularPerimetro();
         }
}