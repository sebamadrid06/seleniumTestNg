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



    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getTripDetails() {

        return tripDetails;
    }

    public WebElement getPriceGuarantee() {
        return priceGuarantee;
    }
}
