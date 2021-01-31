package stepDefinitons;

import PageObjectModel.register_Page;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable {
        register_page.typeEmail(email);
    }


    @And("click on create an account button")
    public void clickOnCreateAnAccountButton() {
        register_page.clickOnCreateAnAccountButton();
    }


  //  @And("^choose \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
  //  public void chooseAndAnd(String day, String month, String year) throws Throwable {

    @And("^choose title \"([^\"]*)\"$")
    public void chooseTitle(String arg0) throws Throwable {

    }

    @And("^type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) throws Throwable {
        register_page.typeFirstNameAndLastName(firstname, lastname);
    }

    @And("^type password \"([^\"]*)\"$")
    public void typePassword(String password) throws Throwable {
        register_page.typePassword(password);
    }
// DATE of BIRTH

    @And("^choose day \"([^\"]*)\"$")
    public void chooseDay(String day) throws Throwable {
        register_page.selectDay();

    }
    @And("^choose month \"([^\"]*)\"$")
    public void chooseMonth(String month) throws Throwable {
        register_page.selectMonth();
    }

    @And("^choose year \"([^\"]*)\"$")
    public void chooseYear(String year) throws Throwable {
        register_page.selectYear();
    }

  /////////////////////////
  // YOUR ADDRESS


    @And("^type company \"([^\"]*)\"$")
    public void typeCompany(String company) throws Throwable {
        Thread.sleep(2000);
        register_page.typeCompany(company);
    }

    @And("^type address \"([^\"]*)\"$")
    public void typeAddress(String address) throws Throwable {
        register_page.typeAddress(address);
    }

    @And("^type city \"([^\"]*)\"$")
    public void typeCity(String city) throws Throwable {
        register_page.typeCity(city);
    }

    @And("^choose state \"([^\"]*)\"$")
    public void chooseState(String state) throws Throwable {
        Thread.sleep(2000);
        register_page.slctState(state);
    }

    @And("^type zipcode \"([^\"]*)\"$")
    public void typeZipcode(String zipcode) throws Throwable {
        register_page.typeZip(zipcode);
    }
    @And("^choose country \"([^\"]*)\"$")
    public void chooseCountry(String country) throws Throwable {
        register_page.typeCountry(country);
    }

    @And("^type phone no \"([^\"]*)\"$")
    public void typePhoneNo(String phone) throws Throwable {
        register_page.typePhoneNo(phone);
    }

    @And("^type alias \"([^\"]*)\"$")
    public void typeAlias(String alias) throws Throwable {
        register_page.typeAlias(alias);
    }
    @And("^click register$")
    public void clickRegister() {
        register_page.clickRegister();
    }

    ///////////////////////////////////////////////





}
