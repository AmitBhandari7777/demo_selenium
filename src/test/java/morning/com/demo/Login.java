package morning.com.demo;

import morning.BaseDriver;
import morning.com.demo.core.BaseDriverSingleton;
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
//        BaseDriver baseDriver = new BaseDriver();
//        baseDriver.setup();
//        driver = baseDriver.getDriver();
        BaseDriverSingleton singleton = BaseDriverSingleton.getInstance();
        driver=singleton.getDriver();
    }

    @Test(priority = 0)
    public void validateLoginPage() {
        WebElement userId = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[1]"));
        WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]"));

        String actualResultUserID = userId.getText();
        String actualResultPassword = password.getText();

        Assert.assertEquals(actualResultUserID, "UserID");
        Assert.assertEquals(actualResultPassword, "Password");
    }


    @Test(priority = 1)
    public void checkEmptyField() {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
        loginButton.click();

        Alert alert = driver.switchTo().alert();
        String actualResult = alert.getText();

        Assert.assertEquals(actualResult, "User or Password is not valid".trim());
        alert.accept();

    }

    @Test(priority = 2)
    public void testResetButton() {

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        WebElement userID = driver.findElement(By.name("uid"));
        userID.sendKeys("testReset");

        WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        password.sendKeys("pass123");

        WebElement resetButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]"));
        resetButton.click();

        Assert.assertEquals(userID.getText().length(), 0);
        Assert.assertEquals(password.getText().length(), 0);
    }



    @Test(priority = 3)
    public void testInvalidLogin(){

    }


    @Test(priority = 4)
    public void testValidLogin(){
        WebElement userID = driver.findElement(By.name("uid"));
        userID.sendKeys("mngr280177");

        WebElement password = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        password.sendKeys("utyryvY");

        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
        loginButton.click();

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement managerId = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        String actualResult=managerId.getText();
        Assert.assertEquals(actualResult.trim(), "Manger Id : mngr280177");

    }

}
