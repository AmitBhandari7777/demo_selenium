package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorIdSample {

    private WebDriver driver;
    public LocatorIdSample(WebDriver driver) {
        this.driver = driver;
    }


    public void sampleForId() {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("amit@metahorizon.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("pass1234");

        WebElement loginButton = driver.findElement(By.id("u_0_b"));
        loginButton.click();
    }
}
