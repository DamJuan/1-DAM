import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ConCaTest {
    public ConCaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of concatena method, of class ConCa.
     */
    @Test
    public void testConcatena() {
        System.out.println("concatena");
        String uno = "Hola";
        String dos = "Mundo";
        ConCa instance = new ConCa();
        String expResult = "";
        String result = instance.concatena(uno, dos);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
