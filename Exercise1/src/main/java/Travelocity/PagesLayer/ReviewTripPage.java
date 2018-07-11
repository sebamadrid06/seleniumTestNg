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
    @FindBy(css = "div[class='flex-content']")
    private WebElement tripInformation;


    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getTripInformation() {
        return tripInformation;
    }
}
