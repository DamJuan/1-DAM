import org.testng.annotations.Test;

public class TestCasos {

    @Test
    public void setup() {
        System.out.println("i am setup");
    }

    @Test
    public void tearDOWN() {
        System.out.println("i am tearDown");
    }

    @Test
    public void testAS() {
        System.out.println("i am test1");
    }



}
