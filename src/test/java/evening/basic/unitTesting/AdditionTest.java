package evening.basic.unitTesting;

import org.junit.*;

public class AdditionTest {
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Setup before testing "+Addition.class);
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Testing started for "+Addition.class);
    }



    @Test
    public void sum_a() {
        Addition addition = new Addition();
        int actualResult = addition.sum(25, 10);
        Assert.assertEquals(35, actualResult);

        System.out.println("Test method executed");
    }

    @Test
    public void sum_b() {
        System.out.println("sum1");
    }


    @After
    public void tearDown() throws Exception {
        System.out.println("Testing completed for " + Addition.class);
    }


    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Closing setup after running "+Addition.class);
        System.out.println();
    }


}