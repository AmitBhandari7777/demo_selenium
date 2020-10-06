package morning.pom.demo.login;

import morning.com.demo.core.BaseDriverSingleton;
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
        BaseDriverSingleton singleton = BaseDriverSingleton.getInstance();
        driver = singleton.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 0)
    public void validateLoginPage() {


        String actualResultUserID = loginPage.getUsernameLabel();
        String actualResultPassword = loginPage.getPasswordLabel();

        Assert.assertEquals(actualResultUserID, "UserID");
        Assert.assertEquals(actualResultPassword, "Password");
    }


    @Test(priority = 1)
    public void checkEmptyField() {

        loginPage.clickLogin();

        String actualResult = loginPage.getAlertText();

        Assert.assertEquals(actualResult, "User or Password is not valid".trim());
        loginPage.acceptAlert();

    }

    @Test(priority = 2)
    public void testResetButton() {

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        loginPage.setUsername("testReset");
        loginPage.setPassword("pass123");

        loginPage.clickReset();

        Assert.assertEquals(loginPage.getUsername().length(), 0);
        Assert.assertEquals(loginPage.getPassword().length(), 0);
    }


    @Test(priority = 3)
    public void testInvalidLogin() {
        loginPage.setUsername("testReset");
        loginPage.setPassword("pass123");
        loginPage.clickLogin();

        String actualResult = loginPage.getAlertText();
        Assert.assertEquals(actualResult, "User or Password is not valid".trim());

        loginPage.acceptAlert();

    }


    @Test(priority = 4)
    public void testValidLogin() {

        loginPage.setUsername("mngr280177");
        loginPage.setPassword("utyryvY");

        loginPage.clickLogin();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement managerId = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        String actualResult = managerId.getText();
        Assert.assertEquals(actualResult.trim(), "Manger Id : mngr280177");

    }

}
