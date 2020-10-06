package morning.basic.locator;

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
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"scripts\"]"));
        Select javascriptSelect = new Select(gender);
        javascriptSelect.selectByIndex(3);

    }

    public void useValue(){
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"scripts\"]"));
        Select javascriptSelect = new Select(gender);
        javascriptSelect.selectByValue("order_forms");

    }


    public void useVisible(){
        WebElement drop = driver.findElement(By.xpath("//*[@id=\"scripts\"]"));
        Select javascriptSelect = new Select(drop);
        javascriptSelect.selectByVisibleText("Random Image PHP");
    }
}
