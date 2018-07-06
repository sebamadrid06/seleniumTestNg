package Travelocity.Testing;

import Travelocity.TestsLayer.HomePageTests;
import Travelocity.TestsLayer.ResultsPageTests;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestingExercise1 extends TestBase {

@Test
public void init() throws InterruptedException {

    HomePageTests home = getHomePage();
    ResultsPageTests results = home.searchFlightAction();
    results.checkButton();


    results.checkFlightDurationElement();

    for (int i=0;i<4;i++)

        try{
            results.checkElements();
            break;
        }catch(StaleElementReferenceException e){
        e.toString();
            System.out.println("Trying to recover from Stale element...:  ");
        }

}

}
