package morning.basic.unitTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Testing started for " + Subtraction.class);
    }


    @Test
    public void subtract() {
        Subtraction subtraction = new Subtraction();
        int actualResult = subtraction.subtract(100, 45);
        assertEquals(55, actualResult);

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Testing completed for " + Subtraction.class);
    }


}