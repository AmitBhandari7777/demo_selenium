package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioButtonSample {

    private WebDriver driver;

    public RadioButtonSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useRadioButton() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"pizzaForm\"]/fieldset/p[1]/label[3]/input"));
        radioButton.click();
    }
}
