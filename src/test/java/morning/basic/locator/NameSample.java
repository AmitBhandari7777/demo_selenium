package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameSample {

    private WebDriver driver;

    public NameSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useName() {
        driver.get("http://www.demo.guru99.com/V4/index.php");
        WebElement username = driver.findElement(By.name("uid"));
        username.sendKeys("test@test.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("pass123456");
    }
}
