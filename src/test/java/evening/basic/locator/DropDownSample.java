package evening.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSample {

    private WebDriver driver;

    public DropDownSample(WebDriver driver) {
        this.driver = driver;
    }

    public void useIndex(){
        WebElement dropDown = driver.findElement(By.id("scripts"));
        Select select = new Select(dropDown);
        select.selectByIndex(2);
    }

    public void useValue() {
        WebElement dropDown = driver.findElement(By.id("scripts"));
        Select select = new Select(dropDown);
        select.selectByValue("random_img");
    }

    public void useVisibleText() {

        WebElement dropDown = driver.findElement(By.id("scripts"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("PHP Order Forms");

    }
}
