package evening.bdd.demo.login;

import evening.bdd.demo.home.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    private LoginPage loginPage;

    @When("I go to the Demo page")
    public void iGoToTheDemoPage() {
        loginPage = new LoginPage();
    }

    @And("look for UserId and Password label")
    public void lookForUserIdAndPasswordLabel() {
        String userIdLabel = loginPage.getUsernameLabel();
        String passwordLabel = loginPage.getPasswordLabel();
    }


    @Then("I should view the UserId and password label")
    public void iShouldViewTheUserIdAndPasswordLabel() {
        try {
            Assert.assertEquals(loginPage.getUsernameLabel(), "UserID");
            new LoginConverter().updateStatus(true, "Login", 1, 4);
        } catch (AssertionError e) {
            new LoginConverter().updateStatus(false, "Login", 1, 4);

        }
        try {
            Assert.assertEquals(loginPage.getPasswordLabel(), "Password");
            new LoginConverter().updateStatus(true, "Login", 1, 4);
        } catch (AssertionError error) {
            new LoginConverter().updateStatus(false, "Login", 1, 4);
        }

    }


    @When("I keep the userid and password field empty")
    public void iKeepTheUseridAndPasswordFieldEmpty() {
        //By default userid and password field empty
        loginPage = new LoginPage();
    }

    @And("click the login button")
    public void clickTheLoginButton() {
        loginPage.clickLogin();
    }


    @Then("I should receive the invalid login Alert")
    public void iShouldReceiveTheInvalidLoginAlert() {
        String alertMessage = loginPage.getAlert();
        try {
            Assert.assertEquals(alertMessage.trim(), "User or Password is not valid");
            new LoginConverter().updateStatus(true, "Login", 2, 4);
        } catch (AssertionError error) {
            new LoginConverter().updateStatus(false, "Login", 2, 4);
        }
        loginPage.acceptAlert();
    }


    @When("I input invalid userid and password")
    public void iInputInvalidUseridAndPassword() {
        loginPage = new LoginPage();
        LoginData loginData = new LoginConverter().getLoginData(3);
        loginPage.setUsername(loginData.getUserId());
        loginPage.setPassword(loginData.getPassword());

    }

    @And("I click the login button again")
    public void iClickTheLoginButtonAgain() {
        loginPage.clickLogin();
    }

    @Then("I should receive invalid login Alert")
    public void iShouldReceiveInvalidLoginAlert() {
        String alertMessage = loginPage.getAlert();
        try {
            Assert.assertEquals(alertMessage.trim(), "User or Password is not valid");
            new LoginConverter().updateStatus(true, "Login", 3, 4);

        } catch (AssertionError error) {
            new LoginConverter().updateStatus(false, "Login", 3, 4);
        }
        loginPage.acceptAlert();
    }

    @When("I input the valid userid and password")
    public void iInputTheValidUseridAndPassword() {

        loginPage = new LoginPage();
        LoginData loginData = new LoginConverter().getLoginData(4);
        loginPage.setUsername(loginData.getUserId());
        loginPage.setPassword(loginData.getPassword());

    }


    @And("I click the login button after input")
    public void iClickTheLoginButtonAfterInput() {
        loginPage.clickLogin();

    }


    @Then("I should be navigated to Home page")
    public void iShouldBeNavigatedToHomePage() {
        HomePage homePage = new HomePage();
        String managerId = homePage.getManagerIdLabel();
        LoginData loginData = new LoginConverter().getLoginData(4);
        try {
            Assert.assertEquals(managerId.trim(), "Manger Id : " + loginData.getUserId());
            new LoginConverter().updateStatus(true, "Login", 4, 4);


        } catch (AssertionError error) {
            new LoginConverter().updateStatus(false, "Login", 4, 4);
        }



    }
}
