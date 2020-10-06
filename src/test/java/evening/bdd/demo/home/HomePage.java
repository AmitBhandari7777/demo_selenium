package evening.bdd.demo.home;

import evening.bdd.demo.core.BaseDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
    private WebElement managerId;

    @FindBy(linkText = "New Customer")
    private WebElement newCustomer;

    public HomePage(){
        BaseDriverSingleton singleton = BaseDriverSingleton.getInstance();
        driver = singleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    public HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getManagerIdLabel(){

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        return managerId.getText();
    }

    public void navigateToNewCustomer(){
        newCustomer.click();

    }
}
