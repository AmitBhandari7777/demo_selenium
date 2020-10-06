package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CssSelectorSample {

    private WebDriver driver;

    public CssSelectorSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useID(){
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("CSS ID");

        WebElement password = driver.findElement(By.cssSelector("#pass"));
        password.sendKeys("12345678");
    }


    public void useClass(){
        List<WebElement> elementList = driver.findElements(By.cssSelector(".inputtext._55r1._6luy"));
        WebElement email = elementList.get(0);
        email.sendKeys("multipleclass");

        WebElement password = elementList.get(1);
        password.sendKeys("1122");
    }


    public void useTag(){
        WebElement forgotAccount = driver.findElement(By.cssSelector("button"));
        forgotAccount.click();

    }

    public void useTagAndId(){
        WebElement email = driver.findElement(By.cssSelector("input#email"));
        email.sendKeys("tagAndId");

    }


    public void useTagAndClass(){
        List<WebElement> elementList = driver.findElements(By.cssSelector(".inputtext._55r1._6luy"));

        WebElement password = elementList.get(1);
        password.sendKeys("12");

        WebElement loginButton = driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));
        loginButton.click();

    }

    public void useTagAndAttribute() {
        WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
        email.sendKeys("attributes");

        WebElement login = driver.findElement(By.cssSelector("button[id='u_0_b']"));
        login.click();

    }
}
