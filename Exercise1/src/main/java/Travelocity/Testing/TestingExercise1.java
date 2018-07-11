package Travelocity.Testing;

import Travelocity.TestsLayer.HomePageTests;
import Travelocity.TestsLayer.ResultsPageTests;
import Travelocity.TestsLayer.ReturnPageTests;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

public class TestingExercise1 extends TestBase {

@Test
public void init() throws InterruptedException {

    HomePageTests home = getHomePage();
    ResultsPageTests results = home.searchFlightAction();
    for (int i=0;i<4;i++)

        try{
            results.checkElements();
            break;
        }catch(StaleElementReferenceException e){
            e.toString();
            System.out.println("Trying to recover from Stale element...:  ");
        }

    for (int i=0;i<4;i++)

        try{
            results.checkButton();
            break;
        }catch(StaleElementReferenceException e){
            e.toString();
            System.out.println("Trying to recover from Stale element...:  ");
        }

    for (int i=0;i<4;i++)

        try{
            results.checkFlightDurationElement();
            break;
        }catch(StaleElementReferenceException e){
            e.toString();
            System.out.println("Trying to recover from Stale element...:  ");
        }

    for (int i=0;i<4;i++)

        try{
            results.checkFlightDetails();
            break;
        }catch(StaleElementReferenceException e){
            e.toString();
            System.out.println("Trying to recover from Stale element...:  ");
        }

    ReturnPageTests returnPageTests = results.ClickFirstResult();


    for (int i=0;i<4;i++)

        try{
            results.checkDurationSort();
            break;
        }catch(StaleElementReferenceException e){
            e.toString();
            System.out.println("Trying to recover from Stale element...:  ");
        }

    for (int i=0;i<4;i++)

        try{
            results.ClickFirstResult();
            break;
        }catch(StaleElementReferenceException e){
            e.toString();
            System.out.println("Trying to recover from Stale element...:  ");
        }

    for (int i=0;i<4;i++)

    {
        try{
          returnPageTests.clickThirdResult();
            break;
        }catch(StaleElementReferenceException e){
            e.toString();
            System.out.println("Trying to recover from Stale element...:  ");
        }
    }
}

}
