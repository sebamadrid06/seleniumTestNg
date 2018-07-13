package Travelocity.PagesLayer;

import Travelocity.Testing.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewTripPage extends BasePage {
    public ReviewTripPage(WebDriver pdriver) {

        super(pdriver);

    }

    @FindBy(css = "span[class='packagePriceTotal']")
    private WebElement totalPrice;
    @FindBy(css ="div[class='flex-content']")
    private WebElement tripDetails;
    @FindBy(css = "div[class='priceGuarantee']")
    private WebElement priceGuarantee;
    @FindBy(id = "bookButton")
    private WebElement bookButton;
    @FindBy(css = "span[id='yie-close-button-53738f66-31fd-581e-a901-e949335f5845']")
    private WebElement closeAdButton;

    @FindBy(css = "span[class='icon icon-close']")
    private WebElement closeButton;
    public WebElement getCloseButton() {
        return closeButton;
    }


    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getTripDetails() {

        return tripDetails;
    }

    public WebElement getPriceGuarantee() {
        return priceGuarantee;
    }

    public WebElement getBookButton() {
        return bookButton;
    }

    public WebElement getCloseAdButton() {
        return closeAdButton;
    }
}
