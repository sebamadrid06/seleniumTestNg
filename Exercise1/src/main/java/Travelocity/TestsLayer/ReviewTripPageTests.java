package Travelocity.TestsLayer;

import Travelocity.PagesLayer.ReviewTripPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ReviewTripPageTests extends ReviewTripPage {
    public ReviewTripPageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public void checkReviewDetails() {

        getWait().until(ExpectedConditions.elementToBeClickable(getTotalPrice()));
        boolean priceDisplayed = getTotalPrice().isEnabled();
        getWait().until(ExpectedConditions.elementToBeClickable(getTripDetails()));
        boolean detailsDisplayed = getTripDetails().isEnabled();
        getWait().until(ExpectedConditions.elementToBeClickable(getPriceGuarantee()));
        boolean guaranteeDisplayed = getPriceGuarantee().isEnabled();
        Assert.assertTrue(priceDisplayed);
        Assert.assertTrue(detailsDisplayed);
        Assert.assertTrue(guaranteeDisplayed);

    }

    public PaymentPageTests clickContinueButton() {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("scroll(0,800);");
    boolean alertPresent = false;
        try{

            Alert alert = getDriver().switchTo().alert();
        alertPresent = true;
        alert.dismiss();
            getWait().until(ExpectedConditions.elementToBeClickable(getBookButton()));
            getBookButton().click();
        }catch(NoAlertPresentException e){
            getWait().until(ExpectedConditions.elementToBeClickable(getBookButton()));
            getBookButton().click();
        }

       // getWait().until(ExpectedConditions.elementToBeClickable(getCloseAdButton()));
      //  getCloseAdButton().click();
        //getWait().until(ExpectedConditions.elementToBeClickable(getBookButton()));
     // getBookButton().click();

return new PaymentPageTests(getDriver());
    }




}
