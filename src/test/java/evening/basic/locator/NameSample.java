package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameSample {
    private WebDriver driver;

    public NameSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useName(){
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Name");

        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("namePass");
    }
}
