package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathSample {
    private WebDriver driver;

    public XpathSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useAbsolutePath(){
        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
        email.sendKeys("Using Absolute Path");

    }

    public void useSingleAttribute(){
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("single attributes");
    }
}
