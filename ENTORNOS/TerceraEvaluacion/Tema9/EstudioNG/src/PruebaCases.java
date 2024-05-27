import org.testng.annotations.Test;

public class PruebaCases {




    @Test(priority = 1)
    public void setup() {
        System.out.println("i am setup");
    }

    @Test(priority = 2)
    public void tearDOWN() {
        System.out.println("i am tearDown");
    }

    @Test(priority = 3)
    public void testAS() {
        System.out.println("i am test1");
    }


}
