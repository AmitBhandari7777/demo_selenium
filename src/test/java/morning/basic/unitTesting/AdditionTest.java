package morning.basic.unitTesting;

import org.junit.*;

public class AdditionTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Setup before running " + Addition.class);
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("Testing started for " + Addition.class);
    }

    @Test
    public void sum_a() {
        Addition addition = new Addition();
        int actualResult = addition.sum(10, 15);
        int actualResult2 = addition.sum(100, 25);

        Assert.assertEquals(25, actualResult);
        Assert.assertEquals(125, actualResult2);
    }


    @Test
    public void sum_b() {
        System.out.println("Sum All");
    }


    @After
    public void tearDown() throws Exception {

        System.out.println("Testing completed for " + Addition.class);
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Close setup after running " + Addition.class);
    }


}