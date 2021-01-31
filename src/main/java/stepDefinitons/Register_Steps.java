package stepDefinitons;

import PageObjectModel.register_Page;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Register_Steps {

    register_Page register_page = new register_Page();

    private WebDriver driver;



    @And("click sign in button")
    public void clickSignInButton() {

        register_page.clickOnSignInButton();
    }


    @And("click on create an account button")
    public void clickOnCreateAnAccountButton() {

        register_page.clickOnCreateAnAccountButton();
    }

    @And("choose title")
    public void chooseTitle() {

    }


    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable {
        register_page.typeEmail(email);
    }

    @And("^type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) throws Throwable {
        register_page.typeFirstNameAndLastName(firstname, lastname);
    }

    @And("^type password \"([^\"]*)\"$")
    public void typePassword(String password) throws Throwable {
        register_page.typePassword(password);
    }

    @And("^type company \"([^\"]*)\"$")
    public void typeCompany(String company) throws Throwable {
        register_page.typeCompany(company);
    }

    @And("^type address \"([^\"]*)\"$")
    public void typeAddress(String address) throws Throwable {
        register_page.typeAddress(address);
    }
}
