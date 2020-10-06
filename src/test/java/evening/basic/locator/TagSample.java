package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * html
 * header
 * body
 * div
 * table
 * tr
 * td
 * form
 * input
 * footer
 *
 */
public class TagSample {

    private WebDriver driver;

    public TagSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useTag(){

        List<WebElement> elementList = driver.findElements(By.tagName("input"));

        WebElement email = elementList.get(2);
        email.sendKeys("tagname");

        WebElement password = elementList.get(3);
        password.sendKeys("1332323");
    }
}
