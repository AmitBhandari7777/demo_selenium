package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxSample {
    private WebDriver driver;

    public CheckBoxSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useCheckBox(){
        WebElement check = driver.findElement(By.xpath("//*[@id=\"pizza_toppings\"]/label[3]/input"));
        check.click();
    }
}
