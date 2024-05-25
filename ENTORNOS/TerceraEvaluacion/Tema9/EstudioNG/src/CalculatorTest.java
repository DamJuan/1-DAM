import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
        Calculator calculator = new Calculator();


        @Test(priority = 1, description = "Test for the add method")
        public void testAdd() {
            int result = calculator.add(1, 2);
            assertEquals(result, 3);
        }

        @Test
        public void testSubtract() {
            int result = calculator.subtract(2, 1);
            assertEquals(result, 1);
        }

        @Test
        public void testMultiply() {
            int result = calculator.multiply(2, 3);
            assertEquals(result, 6);
        }

        @Test
        public void testDivide() {
            int result = calculator.divide(6, 3);
            assertEquals(result, 2);
        }

        @Test(expectedExceptions = IllegalArgumentException.class)
        public void testDivideByZero() {
            calculator.divide(6, 0);
        }


}
