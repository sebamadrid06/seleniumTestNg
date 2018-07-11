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

    public void clickThirdResult(){

        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("scroll(0,400);");

        getWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[data-test-id='select-button']"))));
        WebElement selectButton = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[data-test-id='select-button']"));
        selectButton.click();
       // getWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[aria-label='select this basic economy fare for result 3']"))));
        //WebElement selectFareButton = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[aria-label='select this basic economy fare for result 3']"));
        //selectFareButton.click();

    }

    public void clickSelectFare(){
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("scroll(0,400);");
        getWait().until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[aria-label='select this basic economy fare for result 3']"))));
        WebElement selectFareButton = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button[aria-label='select this basic economy fare for result 3']"));
        selectFareButton.click();

    }




}
