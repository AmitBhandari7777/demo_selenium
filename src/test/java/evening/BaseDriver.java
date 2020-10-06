package evening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseDriver {
    private WebDriver driver;

    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        driver = new FirefoxDriver();
//        driver = new ChromeDriver();
//        driver.get("https://facebook.com");
        driver.get("http://www.demo.guru99.com/V4/index.php");
//        driver.get("https://www.dyn-web.com/tutorials/forms/select/selected.php");
//        driver.get("https://www.dyn-web.com/tutorials/forms/examples/pizza.php");
//        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
//        driver.get("http://47.188.150.5:82");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public WebDriver getDriver() {
        return driver;
    }
}
