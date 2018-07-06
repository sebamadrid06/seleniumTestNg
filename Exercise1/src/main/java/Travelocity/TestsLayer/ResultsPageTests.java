package Travelocity.TestsLayer;

import Travelocity.PagesLayer.ResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ResultsPageTests extends ResultsPage {
    public ResultsPageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public void checkButton() {
        List<WebElement> obj = getDriver().findElements(By.cssSelector("#flightModuleList li:nth-child(N) button"));

        for (int i = 0; i < obj.size(); i++) {
            WebElement item = obj.get(i);
            System.out.println(item.getText());

        }

    }


    public void checkFlightDurationElement() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flightModuleList li:nth-child(N) span[data-test-id='duration']")));


        List<WebElement> flightDurationElement = getDriver().findElements(By.cssSelector("#flightModuleList li:nth-child(N) span[data-test-id='duration']"));

        for (int i = 0; i < flightDurationElement.size(); i++) {

            WebElement item = flightDurationElement.get(i);

            System.out.println(item.getText());

        }
    }

    public void checkFlightDetails() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flightModuleList li:nth-child(N) span[class='show-flight-details']")));


        List<WebElement> flightDurationElement = getDriver().findElements(By.cssSelector("#flightModuleList li:nth-child(N) span[class='show-flight-details']"));

        for (int i = 0; i < flightDurationElement.size(); i++) {

            WebElement item = flightDurationElement.get(i);

            System.out.println(item.getText());

        }
    }



}






