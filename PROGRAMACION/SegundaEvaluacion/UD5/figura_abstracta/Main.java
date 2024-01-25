public class Main {

    public static void main(String[] args) {

        FiguraAbstracta cuadrado = new Cuadrado("Cuadrado", 6);
        FiguraAbstracta triangulo = new Triangulo("Triangulo", 6, 3, 5, 6);
        FiguraAbstracta circulo = new Circulo("Circulo", 5);
        FiguraAbstracta cilindro = new Cilindro("Cilindro", 3, 6);
        FiguraAbstracta caja = new Caja("Caja (Prisma)", 3, 6, 4);

        System.out.println(cuadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(cilindro);
        System.out.println(caja);
    }

/*
@Author Juan & Angel
 */
}
