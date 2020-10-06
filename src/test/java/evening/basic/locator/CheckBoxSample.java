package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxSample {
    private WebDriver driver;

    public CheckBoxSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useMultipleCheckBox(){
        WebElement mushrooms = driver.findElement(By.name("mushrooms"));
        mushrooms.click();

        WebElement blackOlives = driver.findElement(By.name("black_olives"));
        blackOlives.click();

        WebElement pepperoni = driver.findElement(By.name("pepperoni"));
        pepperoni.click();

    }
}
