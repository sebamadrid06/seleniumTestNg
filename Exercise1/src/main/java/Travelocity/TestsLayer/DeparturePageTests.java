package Travelocity.TestsLayer;

import Travelocity.PagesLayer.DeparturePage;
import Travelocity.PagesLayer.ReturnPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeparturePageTests extends DeparturePage {

    WebElement selectButton = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(1) button"));


    public DeparturePageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public ReturnPage clickFirstResult(){
    selectButton.click();

    return new ReturnPage(getDriver());
    }



}
