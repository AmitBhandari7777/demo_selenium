package morning.basic.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class XpathSample {
    private WebDriver driver;

    public XpathSample(WebDriver driver) {
        this.driver = driver;
    }



    public void checkAbsolutePath() {

        driver.get("https://facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
//        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
        email.sendKeys("amit@test.com");


        WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/input"));
        password.sendKeys("fsfdsfsd");
    }

    public void checkSingleAttribute() {
//        driver.get("https://facebook.com");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("amit@test.com");


        WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        password.sendKeys("fsfdsfsd");
    }
}
