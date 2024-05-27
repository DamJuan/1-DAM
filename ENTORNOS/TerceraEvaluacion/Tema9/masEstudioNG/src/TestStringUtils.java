import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestStringUtils {

    StringUtils stringUtils = new StringUtils();

    @Test
    public void testLongitud() {
        assertEquals(5, stringUtils.longitud("holaa"));
    }

    @Test
    public void testInvertir() {
        assertEquals("aloh", stringUtils.invertir("hola"));
    }

    @Test
    public void testContarOcurrencias() {
        assertEquals(2, stringUtils.contarOcurrencias("hoola", 'o'));
    }

    @Test
    public void testEliminarEspacios() {
        assertEquals("hola", stringUtils.eliminarEspacios("h o l a"));
    }

}
