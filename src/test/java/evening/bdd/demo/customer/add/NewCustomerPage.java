package evening.bdd.demo.customer.add;

import evening.bdd.demo.core.BaseDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {

    private WebDriver driver;

    @FindBy(name = "sub")
    private WebElement submitButton;

    public NewCustomerPage() {
        BaseDriverSingleton singleton = BaseDriverSingleton.getInstance();
        driver = singleton.getDriver();

        PageFactory.initElements(driver, this);

    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void clickSubmit() {
        submitButton.click();
    }
}
