package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

public class AbstractClass {


    // click, assert, sendKeys, wait,
    // random elemanin default kodlari
    // select, dropdown
    // for loops in lists

    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver,10);


    public void clickFunction (WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendkeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendkeysElement));
        sendkeysElement.sendKeys(value);
    }
    public void selectElementFromDropdown(WebElement dropdown, String element){
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }
    public void Assertion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));

        Assert.assertEquals(actual.getText(),expected);
        System.out.println("Target Message: " + actual.getText());
    }
/*
    @Given("navigate to website")
    public void navigate_to_website()
    {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }   */
}



