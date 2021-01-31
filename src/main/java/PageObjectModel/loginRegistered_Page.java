package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class loginRegistered_Page extends AbstractClass {

    WebDriver driver;

    public loginRegistered_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='login']")
    private WebElement firstSignIn;

    public void clickFirstSignIn() {
        clickFunction(firstSignIn);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    public void enterEmailAddress(String EMail) {
        sendKeysFunction(email, EMail);
    }

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    public void enterPassword(String pword) {
        sendKeysFunction(password, pword);
    }


    @FindBy(xpath = "//span[contains(.,'Sign in')]")
    private WebElement signin;

    public void clickSignIn() {
        clickFunction(signin);
    }

    @FindBy(xpath = "//h1[contains(.,'My account')]")
    private WebElement verification;

    public void assertPage(){
        Assertion(verification,"MY ACCOUNT");
    }
}
