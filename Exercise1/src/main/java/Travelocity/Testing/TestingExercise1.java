package Travelocity.Testing;

import Travelocity.TestsLayer.HomePageTests;
import Travelocity.TestsLayer.ResultsPageTests;
import Travelocity.TestsLayer.ReturnPageTests;
import Travelocity.TestsLayer.ReviewTripPageTests;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

public class TestingExercise1 extends TestBase {

    @Test
    public void init() throws InterruptedException {

        HomePageTests home = getHomePage();
        ResultsPageTests results = home.searchFlightAction();
        ReturnPageTests returnPageTests;
        ReviewTripPageTests reviewTripPageTests = null;
        for (int i = 0; i < 4; i++)

            try {
                results.checkElements();
                break;
            } catch (StaleElementReferenceException e) {
                e.toString();
                System.out.println("Trying to recover from Stale element...:  ");
            }

        for (int i = 0; i < 4; i++)

            try {
                results.checkButton();
                break;
            } catch (StaleElementReferenceException e) {
                e.toString();
                System.out.println("Trying to recover from Stale element...:  ");
            }

        for (int i = 0; i < 4; i++)

            try {
                results.checkFlightDurationElement();
                break;
            } catch (StaleElementReferenceException e) {
                e.toString();
                System.out.println("Trying to recover from Stale element...:  ");
            }

        for (int i = 0; i < 4; i++)

            try {
                results.checkFlightDetails();
                break;
            } catch (StaleElementReferenceException e) {
                e.toString();
                System.out.println("Trying to recover from Stale element...:  ");
            }

         returnPageTests = results.ClickFirstResult();


        for (int i = 0; i < 4; i++)

            try {
                results.checkDurationSort();
                break;
            } catch (StaleElementReferenceException e) {
                e.toString();
                System.out.println("Trying to recover from Stale element...:  ");
            }

        for (int i = 0; i < 4; i++)

            try {
                returnPageTests = results.ClickFirstResult();
                break;
            } catch (StaleElementReferenceException e) {
                e.toString();
                System.out.println("Trying to recover from Stale element...:  ");
            }

        for (int i = 0; i < 4; i++)

        {
            try {
                reviewTripPageTests = returnPageTests.clickThirdResult();
                break;
            } catch (StaleElementReferenceException e) {
                e.toString();
                System.out.println("Trying to recover from Stale element...:  ");
            }
        }

        for (int i = 0; i < 4; i++)

        {
            try {
                reviewTripPageTests.checkReviewDetails();
                break;
            } catch (StaleElementReferenceException e) {
                e.toString();
                System.out.println("Trying to recover from Stale element...:  ");
            }
        }




    }

}
