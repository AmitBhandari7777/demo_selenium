package morning.com.demo;

import morning.com.demo.core.BaseDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Home {
    private WebDriver driver;


    @BeforeClass
    public void setup() {
        BaseDriverSingleton singleton = BaseDriverSingleton.getInstance();
        driver=singleton.getDriver();
    }

    @Test(priority = 0)
    public void validateHomePage(){
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement managerId = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        String actualResult=managerId.getText();
        Assert.assertEquals(actualResult.trim(), "Manger Id : mngr280177");
    }


    @Test(priority = 1)
    public void navigateToNewCustomer(){
        WebElement newCustomer = driver.findElement(By.linkText("New Customer"));
        newCustomer.click();
    }
}
