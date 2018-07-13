package Travelocity.PagesLayer;

import Travelocity.Testing.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver pdriver) {
        super(pdriver);
    }


    @FindBy(css = "h2[class='faceoff-module-title']")
    private WebElement sectionTitle;
    @FindBy(id = "firstname[0]")
    private WebElement firstNameField;
    @FindBy(id = "middlename[0]")
    private WebElement middleName;
    @FindBy(id = "lastname[0]")
    private WebElement lastName;
    @FindBy(id = "payments")
    private WebElement payment;


    public WebElement getSectionTitle() {
        return sectionTitle;
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getMiddleName() {
        return middleName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getPayment() {
        return payment;
    }
}


