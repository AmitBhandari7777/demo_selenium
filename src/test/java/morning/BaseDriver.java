package morning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDriver {

    private WebDriver driver;

    public void setup() {
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
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        maximize the auto opened window via driver
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
