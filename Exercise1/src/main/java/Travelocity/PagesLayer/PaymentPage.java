package Travelocity.PagesLayer;

import Travelocity.Testing.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver pdriver) {
        super(pdriver);
    }


    @FindBy(css = "span[class='icon icon-close']")
    private WebElement closeButton;
    public WebElement getCloseButton() {
        return closeButton;
    }

}
