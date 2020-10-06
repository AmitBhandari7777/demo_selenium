package morning.com.demo.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Singleton design pattern based class for
 * holding the existing driver throughout
 * the test automation
 */
public class BaseDriverSingleton {
    private WebDriver driver;
    private String sample;
    private static BaseDriverSingleton instance = null;

    private BaseDriverSingleton() {
        setup();
    }

    private void setup() {
//        set path for chrome driver under project resources
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new FirefoxDriver();
//        driver = new ChromeDriver();

//        url for driver to open
        driver.get("http://www.demo.guru99.com/V4/index.php");
//        driver.get("https://facebook.com");
//        driver.get("https://semantic-ui.com/modules/dropdown.html");
//        driver.get("https://www.dyn-web.com/tutorials/forms/select/selected.php");
//        driver.get("https://www.dyn-web.com/tutorials/forms/examples/pizza.php");
//        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
//        driver.get("http://47.188.150.5:82/");
//        session timeout setup for driver
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

//        maximize the auto opened window via driver
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public static BaseDriverSingleton getInstance() {
        if (instance == null) {
            instance = new BaseDriverSingleton();
        }
        return instance;
    }
}
