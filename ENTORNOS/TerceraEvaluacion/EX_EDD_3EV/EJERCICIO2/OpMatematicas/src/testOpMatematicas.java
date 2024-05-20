import org.testng.annotations.Test;

public class testOpMatematicas {

    // Test para el constructor
    // Comprueba que el objeto se crea correctamente
    @Test
    public void testConstructor() {
        OpMatematicas op = new OpMatematicas(new int[]{1, 2, 3, 4, 5});
        assert op != null;
    }

    // Test para el constructor con un array vacío
    // Se espera que se lance una excepción
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorVacio() {
        OpMatematicas op = new OpMatematicas(new int[]{});
    }


    // Test para el método getMinimo
    // Comprueba que el mínimo es 1
    @Test
    public void testMinimo() {
        OpMatematicas op = new OpMatematicas(new int[]{1, 2, 3, 4, 5});
        assert op.getMinimo() == 1;
    }

    // Test para el método getMaximo
    // Comprueba que el máximo es 5
    @Test
    public void testMaximo() {
        OpMatematicas op = new OpMatematicas(new int[]{1, 2, 3, 4, 5});
        assert op.getMaximo() == 5;
    }


    // Test para el método getSuma
    // Comprueba que la suma de los elementos es 15
    @Test
    public void testSuma() {
        OpMatematicas op = new OpMatematicas(new int[]{1, 2, 3, 4, 5});
        assert op.getSuma() == 15;
    }

    // Test para el método getIndiceDe
    // Comprueba que el indice del elemento 3 es 2
    @Test
    public void testIndiceDe() {
        OpMatematicas op = new OpMatematicas(new int[]{1, 2, 3, 4, 5});
        assert op.getIndiceDe(3) == 2;
    }

    // Test para el método getIndiceDe
    //Esto comprueba que el indice del primer elemento
    @Test
    public void testIndiceDePrimero() {
        OpMatematicas op = new OpMatematicas(new int[]{1, 2, 3, 4, 5});
        assert op.getIndiceDe(1) == 0;
    }

    // Test para el método getIndiceDe
    // Es una excepción que se espera que se lance cuando el elemento no existe
    @Test(expectedExceptions = java.util.NoSuchElementException.class)
    public void testIndiceDeNoExiste() {
        OpMatematicas op = new OpMatematicas(new int[]{1, 2, 3, 4, 5});
        op.getIndiceDe(6);
    }
}
