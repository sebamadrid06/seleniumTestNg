package Travelocity.TestsLayer;

import Travelocity.PagesLayer.ReturnPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReturnPageTests extends ReturnPage {
    public ReturnPageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public ReviewTripPageTests clickThirdResult(){

        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("scroll(0,400);");

        getWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[data-test-id='select-button']"))));
        WebElement selectButton = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[data-test-id='select-button']"));
        selectButton.click();
       // getWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[aria-label='select this basic economy fare for result 3']"))));
        //WebElement selectFareButton = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[aria-label='select this basic economy fare for result 3']"));
        //selectFareButton.click();

      //SWITCH TAB

       String ParentWindowHandle = getDriver().getWindowHandle();
        System.out.println(ParentWindowHandle);

        for(String childTab:getDriver().getWindowHandles())
        {
            getDriver().switchTo().window(childTab);
        }
        System.out.println(getDriver().getTitle());

      return new ReviewTripPageTests(getDriver());


    }

    public void clickSelectFare(){
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("scroll(0,400);");
        getWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[aria-label='select this basic economy fare for result 3']"))));
        WebElement selectFareButton = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[aria-label='select this basic economy fare for result 3']"));
        selectFareButton.click();

    }








}
