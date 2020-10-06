package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextSample {

    private WebDriver driver;

    public LinkTextSample(WebDriver driver) {
        this.driver = driver;
    }

    public void checkFullLinkText(){
        WebElement linkText = driver.findElement(By.linkText("Forgot account?"));
        linkText.click();

    }

    public void checkPartialLinkText(){
        driver.get("https://facebook.com");
        WebElement linkText = driver.findElement(By.partialLinkText("Forgot acco"));
        linkText.click();
    }
}
