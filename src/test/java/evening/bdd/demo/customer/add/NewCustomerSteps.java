package evening.bdd.demo.customer.add;

import evening.bdd.demo.home.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NewCustomerSteps {
    private HomePage homePage;
    private NewCustomerPage newCustomerPage;
    @When("I am at Home Page")
    public void iAmAtHomePage() {
         homePage = new HomePage();

    }

    @And("click the New Customer from side menu")
    public void clickTheNewCustomerFromSideMenu() {
        homePage.navigateToNewCustomer();
    }

    @Then("I should be navigated to New Customer Form")
    public void iShouldBeNavigatedToNewCustomerForm() {
        newCustomerPage = new NewCustomerPage();
        String title = newCustomerPage.getTitle();
        Assert.assertEquals(title.trim(), "Guru99 Bank New Customer Entry Page");
    }
}
