package stepDefinitons;

import PageObjectModel.contactUs_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import java.util.concurrent.TimeUnit;


public class ContactUs_steps {

    private WebDriver driver;
    contactUs_Page contactUs_page = new contactUs_Page();




    @And("click on Contact Us button")
    public void click_on_Contact_Us_button() {
        contactUs_page.clickContactUsButton();
    }


    @And("select Subject Heading")
    public void select_Subject_Heading() {
        contactUs_page.selectFromDropdown();
    }


    @And("type Email")
    public void type_Email() {
        contactUs_page.typeEmail();
    }

    @And("type Order Reference")
    public void type_Order_Reference() {
        contactUs_page.typeOrderReference();
    }

    @And("type a message")
    public void type_a_message() {
        contactUs_page.typeMessage();
    }

    @When("click on Submit button")
    public void click_on_Submit_button() {
        contactUs_page.clickOnSendButton();
    }


    @Then("verify success message")
    public void verify_success_message() {
        contactUs_page.assertMyMessage();


    }

}
