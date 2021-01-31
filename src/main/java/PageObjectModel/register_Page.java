package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class register_Page extends AbstractClass {

    private WebDriver driver;

    public register_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.login")  //a[contains(@class,'login')]
    private WebElement FirstSignInButton;

    public void clickOnSignInButton() {
        clickFunction(FirstSignInButton);
    }


    @FindBy(name = "email_create")  //input[@name='email_create']
    private WebElement emailTextBox;

    public void typeEmail(String email) {
        sendKeysFunction(emailTextBox, email);
    }


    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")   //span[contains(.,'Create an account')] //*[@id="SubmitCreate"]/span (id = "submitCreate")
    private WebElement createAnAccountButton;

    public void clickOnCreateAnAccountButton() {
        clickFunction(createAnAccountButton);
    }


    @FindBy(id = "id_gender") //input[@type='radio'][contains(@id,'gender1')]
    private WebElement genderM;

    public void clickOnGender() {
        clickFunction(genderM);
    }


    @FindBy(id = "customer_firstname") //input[@name='customer_firstname']
    private WebElement firstname;
    @FindBy(id = "customer_lastname") //input[@name='customer_lastname']
    private WebElement lastname;

    public void typeFirstNameAndLastName(String FirstName,String LastName) {
        sendKeysFunction(firstname,FirstName);
        sendKeysFunction(lastname,LastName);
    }


    @FindBy(name = "passwd")  //input[@name='passwd']
    private WebElement password;

    public void typePassword(String PassWord) {
        sendKeysFunction(password,PassWord);
    }
    //////////////////////// OK \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\



    @FindBy(xpath = "//select[@name='days']")  //select[contains(@name,'days')]
    private WebElement slctDay;

    public void day(String DaY) {
       selectElementFromDropdown(slctDay,DaY);
    }


//select[@name='days']   //select[contains(@name,'days')]
//
// select[@name='months'] //select[@name='months']

//input[@name='firstname']  //input[@name='lastname'] //input[@name='lastname']

//input[@name='address1'] //input[@name='address2']  //input[@name='city']
    //select[@name='id_state']  //input[@name='postcode']  //select[@name='id_country']
    //input[@name='phone_mobile']  //input[@name='alias']   //span[contains(.,'Register')]


    @FindBy(id = "company")
    private WebElement company;

    public void typeCompany(String Company) {
        sendKeysFunction(company,Company);
    }


    @FindBy(name = "address1")
    private WebElement address;

    public void typeAddress(String AddresS) {
        sendKeysFunction(address,AddresS);
    }














}
