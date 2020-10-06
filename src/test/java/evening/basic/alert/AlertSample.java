package evening.basic.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertSample {
    private WebDriver driver;

    public AlertSample(WebDriver driver) {
        this.driver = driver;
    }

    public  void simpleAlert(){
        WebElement clickMe = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button"));
        clickMe.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    public void confirmationAlert() {
        WebElement clickMe = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
        clickMe.click();

        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        confirmationAlert.dismiss();
    }

    public void promptAlert(){
        WebElement clickForPromptBox = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
        clickForPromptBox.click();

        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());

        promptAlert.sendKeys("Hello Prompt");
        promptAlert.accept();
    }
}
