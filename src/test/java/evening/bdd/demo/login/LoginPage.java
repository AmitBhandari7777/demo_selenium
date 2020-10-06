package evening.bdd.demo.login;

import evening.bdd.demo.core.BaseDriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[1]")
    private WebElement usernameLabel;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[1]")
    private WebElement passwordLabel;

    @FindBy(name = "uid")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "btnLogin")
    private WebElement loginButton;

    @FindBy(name="btnReset")
    private WebElement resetButton;



    private WebDriver driver;
    private Alert alert;

    public LoginPage(){
        BaseDriverSingleton singleton = BaseDriverSingleton.getInstance();
        driver = singleton.getDriver();
        PageFactory.initElements(driver, this);

    }
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }



    public String getUsernameLabel(){
        return usernameLabel.getText();

    }

    public String getUsername(){
        return username.getText();
    }
    public void setUsername(String usernameStr) {
        username.sendKeys(usernameStr);
    }

    public String getPassword(){
        return password.getText();
    }
    public void setPassword(String passwordStr) {
        password.sendKeys(passwordStr);
    }

    public String getPasswordLabel() {
        return passwordLabel.getText();
    }

    public void clickLogin(){
        loginButton.click();
    }

    public void clickReset(){
        resetButton.click();
    }

    public String getAlert(){
        alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void acceptAlert(){
        alert.accept();
    }

}
