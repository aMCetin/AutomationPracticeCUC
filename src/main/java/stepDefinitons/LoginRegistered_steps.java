package stepDefinitons;

import PageObjectModel.loginRegistered_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginRegistered_steps {

    private WebDriver driver;
    loginRegistered_Page loginRegistered_page = new loginRegistered_Page();

    @Given("navigate to website")
    public void navigate_to_website() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^click signIn button$")
    public void clickSignInButton() {
    loginRegistered_page.clickFirstSignIn();
    }


    @And("^enter email$")
    public void enterEmail() {
        loginRegistered_page.enterEmailAddress("ametincetin69@gmail.com");
    }

    @And("^enter password$")
    public void enterPassword() {
        loginRegistered_page.enterPassword("GaMaLi@357oo");
    }

    @When("^I click the signIn$")
    public void iClickTheSignIn() {
        loginRegistered_page.clickSignIn();
    }

    @Then("verify successfully login")
    public void verify_successfully_login() {
        loginRegistered_page.assertPage();


    }

}

