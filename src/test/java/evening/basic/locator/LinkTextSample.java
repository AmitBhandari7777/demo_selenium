package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextSample {
    private WebDriver driver;

    public LinkTextSample(WebDriver driver) {
        this.driver = driver;
    }

    public void fullLinkText() {
        WebElement forgotAccount = driver.findElement(By.linkText("Forgot account?"));
        forgotAccount.click();
    }

    public void partialLinkText(){
        WebElement forgotAccount = driver.findElement(By.partialLinkText("Forgot acco"));
        forgotAccount.click();
    }
}
