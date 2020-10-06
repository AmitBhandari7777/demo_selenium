package morning.basic.wait;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitSample {

    private WebDriver driver;

    public WaitSample(WebDriver driver) {
        this.driver = driver;
    }

    public void implicitWait() {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("dsadfsa"));
    }

    public void pageLoadTimeout() {
        driver.manage().timeouts().pageLoadTimeout(-1, TimeUnit.SECONDS);

        driver.findElement(By.xpath("dsadfsa"));

    }

    public void setScriptTimeout() {
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeAsyncScript("alert('I am alert');");

    }

    public void explicitTimeout() {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/ngx-app/auth-base/nb-layout/div/div/div/div/div/nb-layout-column/nb-card/nb-card-body/div/div/login/form/button"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement error = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > ngx-app > auth-base > nb-layout > div > div > div > div > div > nb-layout-column > nb-card > nb-card-body > div > div > login > form > div.alert.alert-danger")));

        if (error.isDisplayed()) {
            System.out.println(error.getText());
        }
    }

    public void fluentWait() {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/ngx-app/auth-base/nb-layout/div/div/div/div/div/nb-layout-column/nb-card/nb-card-body/div/div/login/form/button"));
        loginButton.click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofMillis(10000))
                .pollingEvery(Duration.ofMillis(2000))
                .ignoring(NoSuchElementException.class);

        WebElement resultText = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector("body > ngx-app > auth-base > nb-layout > div > div > div > div > div > nb-layout-column > nb-card > nb-card-body > div > div > login > form > div.alert.alert-danger"));

            }
        });

        System.out.println(resultText.getText());
    }
}
