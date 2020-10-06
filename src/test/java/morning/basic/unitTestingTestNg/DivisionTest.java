package morning.basic.unitTestingTestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DivisionTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Testing started for "+Division.class);
    }

    @Test
    public void testSum() {

        Division division = new Division();
        int actualResult = division.sum(10, 2);
        assertEquals(actualResult, 5);
        System.out.println("Method sum() is complete");
    }
    @AfterMethod
    public void tearDown() {

        System.out.println("Test completed for "+Division.class);
    }


}