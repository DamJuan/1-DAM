import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        FiguraAbstracta cuadrado = new Cuadrado("Cuadrado", 6);
        FiguraAbstracta triangulo = new Triangulo("Triangulo", 6, 3, 5, 6);
        FiguraAbstracta circulo = new Circulo("Circulo", 5);
        FiguraAbstracta cilindro = new Cilindro("Cilindro", 3, 6);
        FiguraAbstracta caja = new Caja("Caja (Prisma)", 3, 6, 4);


        ArrayList<FiguraAbstracta> figuras = new ArrayList<>();
        figuras.add(cuadrado);
        figuras.add(triangulo);
        figuras.add(circulo);
        figuras.add(cilindro);
        figuras.add(caja);
        figuras.add(new Cuadrado("Cuadrado", 3));
        figuras.add(new Triangulo("Triangulo", 3, 3, 5, 6));
        figuras.add(new Circulo("Circulo", 3));
        figuras.add(new Cilindro("Cilindro", 3, 3));
        figuras.add(new Caja("Caja (Prisma)", 3, 3, 3));

        Collections.sort(figuras);
        Collections.sort(figuras, new FiguraComparator());

        for (FiguraAbstracta figura : figuras) {
            System.out.println(figura);
        }





    }

/*
@Author Juan & Angel
 */
}
