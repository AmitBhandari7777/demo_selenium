package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDSample {
    private WebDriver driver;

    public IDSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useId() {
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("amit@test.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("1234pass");


    }
}
