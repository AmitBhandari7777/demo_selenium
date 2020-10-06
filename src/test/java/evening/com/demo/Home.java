package evening.com.demo;

import evening.BaseDriver;
import evening.com.demo.core.BaseDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Home {
    private WebDriver driver;


    @BeforeClass
    public void setup(){
        BaseDriverSingleton baseDriverSingleton = BaseDriverSingleton.getInstance();
        driver = baseDriverSingleton.getDriver();
    }

    @Test
    public void navigateToNewCustomer(){
        WebElement newCustomer = driver.findElement(By.linkText("New Customer"));
        newCustomer.click();
    }
}
