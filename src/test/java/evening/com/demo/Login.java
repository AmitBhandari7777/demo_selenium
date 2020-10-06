package evening.com.demo;

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

    @BeforeClass
    public void setup() {
        BaseDriverSingleton baseDriverSingleton = BaseDriverSingleton.getInstance();
        driver = baseDriverSingleton.getDriver();
    }

    @Test(priority = 0)
    public void testLoginPage() {
        WebElement userId = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[1]"));
        WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]"));

        String actualResultUserId = userId.getText();
        String actualResultPassword = password.getText();

        Assert.assertEquals(driver.getTitle().trim(), "Guru99 Bank Home Page");
        Assert.assertEquals(actualResultUserId, "UserID");
        Assert.assertEquals(actualResultPassword, "Password");
    }

    @Test(priority = 1)
    public void testEmptyLoginField() {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
        loginButton.click();

        Alert alert = driver.switchTo().alert();
        String actualResult = alert.getText();

        Assert.assertEquals(actualResult.trim(), "User or Password is not valid");
        alert.accept();

    }

    @Test(priority = 2)
    public void testResetButton(){
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement userId = driver.findElement(By.name("uid"));
        userId.sendKeys("testUserId");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("pass1234");

        WebElement resetButton = driver.findElement(By.name("btnReset"));
        resetButton.click();

        int actualResultUserId = userId.getText().length();
        int actualResultPassword = password.getText().length();

        Assert.assertEquals(actualResultUserId, 0);
        Assert.assertEquals(actualResultPassword, 0);

    }

    @Test(priority = 3)
    public void testInvalidLogin(){

    }

    @Test(priority = 4)
    public void testValidLogin(){

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement userId = driver.findElement(By.name("uid"));
        userId.sendKeys("mngr280177");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("utyryvY");

        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
        loginButton.click();


        WebElement managerId = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        String actualResult = managerId.getText().trim();

        Assert.assertEquals(actualResult, "Manger Id : mngr280177");



    }
}
