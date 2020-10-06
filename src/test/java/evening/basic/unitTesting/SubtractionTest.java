package evening.basic.unitTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubtractionTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Testing started for "+Subtraction.class);
    }



    @Test
    public void sum() {
        Subtraction subtraction = new Subtraction();
        int actualResult = subtraction.sum(15, 7);
        Assert.assertEquals(8, actualResult);

        System.out.println("Test executed");
    }

    @After
    public void tearDown() throws Exception {

        System.out.println("Testing completed for "+Subtraction.class);
        System.out.println();
    }

}