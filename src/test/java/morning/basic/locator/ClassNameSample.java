package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClassNameSample {

    private WebDriver driver;

    public ClassNameSample(WebDriver driver) {
        this.driver = driver;
    }

    public void byNormalClass(){
        driver.get("https://facebook.com");
        List<WebElement> languages=driver.findElements(By.className("_sv4"));

        languages.get(4).click();

    }


    public void byCompoundClass(){
//        driver.get("https://facebook.com");
        WebElement email = driver.findElement(By.className("inputtext"));
        email.sendKeys("test@test.com");


    }
}
