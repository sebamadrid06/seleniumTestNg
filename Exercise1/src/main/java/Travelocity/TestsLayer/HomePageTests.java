package Travelocity.TestsLayer;

import Travelocity.PagesLayer.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HomePageTests extends HomePage {
    public HomePageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public ResultsPageTests searchFlightAction() {

//        getWait().until(ExpectedConditions.elementToBeClickable(flightsButton));
        getFlightsButton().click();
        getRoundtripButton().click();
        getFlyingFrom().click();
        getFlyingFrom().sendKeys("Las Vegas");
        getWait().until(ExpectedConditions.elementToBeClickable(getCityResults()));
        getSelectOrigin().click();
        getFlyingTo().click();
        getFlyingTo().sendKeys("Los Angeles");
        getWait().until(ExpectedConditions.elementToBeClickable(getCityResults()));
        getSelectDestiny().click();
        getDepartingDate().click();
        getCalendarNextButton().click();
        getCalendarNextButton().click();
        getDepartingDay().click();
        getReturningDate().click();
        getReturningDay().click();
        Select adultos = new Select(getDriver().findElement(By.id("flight-adults-hp-flight")));
        adultos.selectByValue("1");
        getSearchButton().click();


        return new ResultsPageTests(getDriver());

    }


}
