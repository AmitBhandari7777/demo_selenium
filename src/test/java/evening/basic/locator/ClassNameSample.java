package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClassNameSample {

    private WebDriver driver;

    public ClassNameSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useNormalClassName(){
        List<WebElement> elementList = driver.findElements(By.className("inputtext"));

        WebElement email = elementList.get(0);
        email.sendKeys("fsfsdfsd");

        WebElement password = elementList.get(1);
        password.sendKeys("11111111");


    }

    public void useCompoundClassName(){
        WebElement email=driver.findElement(By.cssSelector(".inputtext._55r1._6luy"));
        email.sendKeys("compundclass");
    }
}
