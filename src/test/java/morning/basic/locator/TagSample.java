package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Tag supports html tag
 * html
 * body
 * form
 * table
 * tr
 * td
 * input
 * div
 * a href
 */
public class TagSample {
    private WebDriver driver;

    public TagSample(WebDriver driver) {
        this.driver = driver;
    }

    public void sampleTag() {
        driver.get("http://www.demo.guru99.com/V4/index.php");

        List<WebElement> tagList = driver.findElements(By.tagName("input"));
        WebElement username = tagList.get(0);
        WebElement password = tagList.get(1);

        username.sendKeys("hello@s.com");
        password.sendKeys("12344321");
    }

}
