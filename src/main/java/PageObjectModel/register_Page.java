package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
    private WebElement titleChoose;

  public void titel(){
      clickFunction(titleChoose);
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
//select day
    @FindBy(xpath = "//select[contains(@name,'days')]")
        private WebElement day;
    public void selectDay(){
        selectElementByValue(day,"23");
    }

// select month
    @FindBy(xpath = "//select[contains(@name,'months')]")
        private WebElement month;
    public void selectMonth(){
       selectElementByValue(month,"5");
    }

//select year
    @FindBy(xpath = "//select[contains(@name,'years')]")
        private WebElement year;
    public void selectYear(){
        selectElementByValue(year,"2000");
    }



    @FindBy(id = "company")  //input[@name='company']
    private WebElement company;

    public void typeCompany(String Company) {
        sendKeysFunction(company,Company);
    }


    @FindBy(name = "address1") //input[@name='address1']
    private WebElement address;

    public void typeAddress(String AddresS) {
        sendKeysFunction(address,AddresS);
    }
// city
    @FindBy(xpath = "//input[@name='city']") //input[@name='city']
    private WebElement city;

    public void typeCity(String CITY) {
        sendKeysFunction(city,CITY);
    }

// state
    @FindBy(xpath = "//select[@name='id_state']") //select[@name='id_state']
    private WebElement state;

    public void slctState(String STATE) {
        selectElementFromDropdown(state,STATE);
    }
// zipcode
    @FindBy(xpath = "//input[@name='postcode']") //input[@name='postcode']
    private WebElement zip;

    public void typeZip(String ZipcodE) {
        sendKeysFunction(zip,ZipcodE);
    }

// country
    @FindBy(xpath = "//select[@name='id_country']") //select[@name='id_country']
        private WebElement country;
    public void typeCountry(String COUNTRY) {
        selectElementFromDropdown(country,COUNTRY);
    }


    @FindBy(name = "phone_mobile") //input[@name='phone_mobile']
        private WebElement phone;
    public void typePhoneNo(String PhonE) {
        sendKeysFunction(phone,PhonE);
    }
// alias
    @FindBy(xpath = "//input[@name='alias']") //input[@name='alias']
        private WebElement alias;
    public void typeAlias(String ALIAS) {
        sendKeysFunction(alias,ALIAS);
    }

    @FindBy(xpath = "//span[contains(.,'Register')]") //span[contains(.,'Register')]
    private WebElement register;

    public void clickRegister() {
        clickFunction(register);
    }
}
    //////////////////////// OK \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


//select[@name='days']   //select[contains(@name,'days')]
//
// select[@name='months'] //select[@name='months']

//input[@name='firstname']  //input[@name='lastname'] //input[@name='lastname']

//input[@name='address1'] //input[@name='address2']  //input[@name='city']
    //select[@name='id_state']  //input[@name='postcode']  //select[@name='id_country']
    //input[@name='phone_mobile']  //input[@name='alias']   //span[contains(.,'Register')]





















