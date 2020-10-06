package morning.basic.unitTestingTestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultiplicationTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Testing started for " + Multiplication.class);
    }


    @Test
    public void testSum() {
        Multiplication multiplication = new Multiplication();
        int actualResult = multiplication.sum(5, 3);
        assertEquals(actualResult, 15);

        System.out.println("Method sum() tested");
    }

    @Test(priority = 1)
    public void testSumAll() {
        Multiplication multiplication = new Multiplication();
        int actualResult = multiplication.sumAll(2, 5, 3);
        assertEquals(actualResult, 30);

        System.out.println("Method sumAll() tested");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Testing completed for " + Multiplication.class);
    }

}