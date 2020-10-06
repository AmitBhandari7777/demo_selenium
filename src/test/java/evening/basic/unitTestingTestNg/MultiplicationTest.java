package evening.basic.unitTestingTestNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiplicationTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Testing started for " + Multiplication.class);
    }

    @Test(priority = 1)
    public void testSum() {
        Multiplication multiplication = new Multiplication();
        int actualResult = multiplication.sum(10, 5);
        Assert.assertEquals(actualResult, 50);

        System.out.println("Method sum() tested");
    }

    @Test(priority = 0)
    public void testSumAll() {
        Multiplication multiplication = new Multiplication();
        int actualResult = multiplication.sumAll(2, 3, 5);
        Assert.assertEquals(actualResult, 30);

        System.out.println("Method sumAll() tested");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("Testing method completed for " + Multiplication.class);
    }



}