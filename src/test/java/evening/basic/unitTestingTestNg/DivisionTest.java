package evening.basic.unitTestingTestNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DivisionTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Testing started for " + Division.class);
    }

    @Test
    public void testSum() {
        Division division = new Division();
        int actualResult = division.sum(10, 5);
        Assert.assertEquals(actualResult, 2);

        System.out.println("Method sum() tested");
    }

    @AfterMethod
    public void tearDown() {

        System.out.println("Testing method completed for " + Division.class);

    }


}