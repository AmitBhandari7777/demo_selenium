package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CssSelectorSample {

    private WebDriver driver;

    public CssSelectorSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useId() {
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("cssID");
    }


    public  void useClass(){
        List<WebElement>elementList=driver.findElements(By.cssSelector(".inputtext._55r1._6luy"));
        WebElement email = elementList.get(0);
        email.sendKeys("comClass");

        WebElement password = elementList.get(1);
        password.sendKeys("12132");
    }

    public void useAttribute(){
        WebElement email = driver.findElement(By.cssSelector("[id='email']"));
        email.sendKeys("attributes");
    }

    public void useTag(){
        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        loginButton.click();

    }

    public void useTagAndId() {
        WebElement email = driver.findElement(By.cssSelector("input#email"));
        email.sendKeys("tag&Id");
    }

    public void useTagAndClass() {
        WebElement createNewAccount = driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
        createNewAccount.click();
    }

    public void useTagAndAttribute() {
        WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
        email.sendKeys("tag&Attr");
    }
}
