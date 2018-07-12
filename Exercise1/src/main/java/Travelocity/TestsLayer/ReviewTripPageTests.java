package Travelocity.TestsLayer;

import Travelocity.PagesLayer.ReviewTripPage;
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


}
