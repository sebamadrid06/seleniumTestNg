package Travelocity.TestsLayer;

import Travelocity.PagesLayer.PaymentPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PaymentPageTests extends PaymentPage {
    public PaymentPageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public void verifyValidations() {
        boolean alertPresent = false;
        try {

            Alert alert = getDriver().switchTo().alert();
            alertPresent = true;
            alert.dismiss();
            getWait().until(ExpectedConditions.elementToBeClickable(getSectionTitle()));
            Assert.assertTrue(getSectionTitle().isDisplayed());
            getWait().until(ExpectedConditions.elementToBeClickable(getFirstNameField()));
            Assert.assertTrue(getFirstNameField().isDisplayed());
            getWait().until(ExpectedConditions.elementToBeClickable(getMiddleName()));
            Assert.assertTrue(getMiddleName().isDisplayed());
            getWait().until(ExpectedConditions.elementToBeClickable(getLastName()));
            Assert.assertTrue(getLastName().isDisplayed());
            getWait().until(ExpectedConditions.elementToBeClickable(getPayment()));
            Assert.assertTrue(getPayment().isDisplayed());

        } catch (NoAlertPresentException e) {
            getWait().until(ExpectedConditions.elementToBeClickable(getSectionTitle()));
            Assert.assertTrue(getSectionTitle().isDisplayed());
            getWait().until(ExpectedConditions.elementToBeClickable(getFirstNameField()));
            Assert.assertTrue(getFirstNameField().isDisplayed());
            getWait().until(ExpectedConditions.elementToBeClickable(getMiddleName()));
            Assert.assertTrue(getMiddleName().isDisplayed());
            getWait().until(ExpectedConditions.elementToBeClickable(getLastName()));
            Assert.assertTrue(getLastName().isDisplayed());
            getWait().until(ExpectedConditions.elementToBeClickable(getPayment()));
            Assert.assertTrue(getPayment().isDisplayed());
        }

    }
}
