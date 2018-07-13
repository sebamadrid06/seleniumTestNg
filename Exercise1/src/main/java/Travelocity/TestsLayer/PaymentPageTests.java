package Travelocity.TestsLayer;

import Travelocity.PagesLayer.PaymentPage;
import org.openqa.selenium.WebDriver;

public class PaymentPageTests extends PaymentPage {
    public PaymentPageTests(WebDriver pdriver) {
        super(pdriver);
    }

    /*public void verifyValidations() {
        boolean alertPresent = false;
        try {

            Alert alert = getDriver().switchTo().alert();
            alertPresent = true;
            alert.dismiss();
            getWait().until(ExpectedConditions.elementToBeClickable(getBookButton()));
            getBookButton().click();
        } catch (NoAlertPresentException e) {
            getWait().until(ExpectedConditions.elementToBeClickable(getBookButton()));
            getBookButton().click();
        }

    }*/
}
