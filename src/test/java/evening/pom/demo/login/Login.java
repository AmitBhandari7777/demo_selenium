package evening.pom.demo.login;

import evening.com.demo.core.BaseDriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setup() {
        BaseDriverSingleton baseDriverSingleton = BaseDriverSingleton.getInstance();
        driver = baseDriverSingleton.getDriver();

        loginPage = new LoginPage(driver);

    }

    @Test(priority = 0)
    public void testLoginPage() {

        String actualResultUserId = loginPage.getUsernameLabel();
        String actualResultPassword = loginPage.getPasswordLabel();

        Assert.assertEquals(driver.getTitle().trim(), "Guru99 Bank Home Page");
        Assert.assertEquals(actualResultUserId, "UserID");
        Assert.assertEquals(actualResultPassword, "Password");
    }

    @Test(priority = 1)
    public void testEmptyLoginField() {

        loginPage.clickLogin();

        String actualResult = loginPage.getAlert();

        Assert.assertEquals(actualResult.trim(), "User or Password is not valid");
        loginPage.acceptAlert();

    }

    @Test(priority = 2)
    public void testResetButton() {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        loginPage.setUsername("testUserId");
        loginPage.setPassword("pass1234");

        loginPage.clickReset();

        int actualResultUserId = loginPage.getUsername().length();
        int actualResultPassword = loginPage.getPassword().length();

        Assert.assertEquals(actualResultUserId, 0);
        Assert.assertEquals(actualResultPassword, 0);

    }

    @Test(priority = 3)
    public void testInvalidLogin() {

    }

    @Test(priority = 4)
    public void testValidLogin() {

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        loginPage.setUsername("mngr280177");
        loginPage.setPassword("utyryvY");

        loginPage.clickLogin();


        WebElement managerId = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        String actualResult = managerId.getText().trim();

        Assert.assertEquals(actualResult, "Manger Id : mngr280177");


    }
}
