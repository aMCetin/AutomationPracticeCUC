package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactUs_Page extends AbstractClass {
    WebDriver driver;

    public contactUs_Page() {
        driver = utilities.Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

// Findby tek madde,
// FindAll liste or dropdown or checkbox listesi,
// FindBys

    @FindBy(xpath = "//*[@id=\"contact-link\"]/a") //a[@title='Contact Us']
    private WebElement contactUsButton;  // hocaninki //a[@title='Contact-Us']

    public void clickContactUsButton() {
        clickFunction(contactUsButton);
    }

    @FindBy(name = "id_contact")  //select[@name='id_contact']
    private WebElement subjectHeadingDropdown;

    public void selectFromDropdown() {
        selectElementFromDropdown(subjectHeadingDropdown, "Webmaster");
    }

    @FindBy(id = "email")  //*[@id="email"]  //input[@name='from']
    private WebElement emailAddressArea;

    public void typeEmail() {
        sendKeysFunction(emailAddressArea, "ametincetin69@gmail.com");
    }

    @FindBy(name = "id_order") //input[@name='id_order']
    private WebElement order;

    public void typeOrderReference() {
        sendKeysFunction(order, "order123");
    }

    @FindBy(id = "message")  //textarea[@name='message']
    private WebElement messageBox;

    public void typeMessage() {
        sendKeysFunction(messageBox, "thanks for this website");
    }

    @FindBy(id = "submitMessage")  //span[contains(.,'Send')]
    private WebElement sendButton;

    public void clickOnSendButton() {
        clickFunction(sendButton);
    }

    @FindBy(css = "p.alert-success")  //linki ekle
    private WebElement successMessage;

    public void assertMyMessage() {
        Assertion(successMessage,"Your message has been successfully sent to our team.");

    }

}
