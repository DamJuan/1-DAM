import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRectangulo {
    @Test
    void test() {
        Rectangulo r = new Rectangulo(3, 4);
        assertAll(
                () -> assertEquals(12, r.area()),
                () -> assertEquals(14, r.perimetro())
        );
    }

}