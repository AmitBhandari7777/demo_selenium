package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonSample {
    private WebDriver driver;

    public RadioButtonSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useRadioButton() {
        WebElement size = driver.findElement(By.xpath("//*[@id=\"pizzaForm\"]/fieldset/p[1]/label[3]/input"));
        size.click();

    }
}
