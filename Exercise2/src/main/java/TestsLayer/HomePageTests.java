package TestsLayer;

import PagesLayer.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePageTests extends HomePage {


    public HomePageTests(WebDriver pdriver) {
        super(pdriver);
    }
public void checkElements(){
        boolean isDisplayed = false;
        getWait().until(ExpectedConditions.elementToBeClickable(getFlightHotelButton()));
        getFlightHotelButton().click();
        getWait().until(ExpectedConditions.elementToBeClickable(getHotelOptions()));
        if(getHotelOptions().isDisplayed()==true){
            isDisplayed = true;
        }
    Assert.assertTrue(isDisplayed);

}

public void inputTravelData() throws InterruptedException {
getWait().until(ExpectedConditions.elementToBeClickable(getFlightButton()));
getFlightButton().click();
getWait().until(ExpectedConditions.elementToBeClickable(getOriginCity()));
getOriginCity().sendKeys("LAS");
Thread.sleep(2000);
getOriginCity().sendKeys(Keys.RETURN);
getWait().until(ExpectedConditions.elementToBeClickable(getDestinationCity()));
getDestinationCity().sendKeys("LAX");
Thread.sleep(2000);
getDestinationCity().sendKeys(Keys.RETURN);
getWait().until(ExpectedConditions.elementToBeClickable(getDepartingCalendar()));
getDepartingCalendar().click();
getNextMonth().click();
getNextMonth().click();
Thread.sleep(2000);
getWait().until(ExpectedConditions.elementToBeClickable(getFirstDay()));
getFirstDay().click();
Thread.sleep(2000);
getReturningCalendar().click();
getWait().until(ExpectedConditions.elementToBeClickable(getLastDay()));
getLastDay().click();
//getWait().until(ExpectedConditions.elementToBeClickable(getLastDay()));
//getFirstDay().click();
//getLastDay().click();
    Thread.sleep(2000);
getWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.id("flight-adults-hp-flight"))));
Select comboAdults = new Select(getDriver().findElement(By.id("flight-adults-hp-flight")));
comboAdults.selectByValue("1");
getSearchButton().click();

}





}
