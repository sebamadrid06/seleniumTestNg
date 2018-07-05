package Travelocity.Testing;

import Travelocity.TestsLayer.HomePageTests;
import Travelocity.TestsLayer.ResultsPageTests;
import org.testng.annotations.Test;

public class TestingExercise1 extends TestBase {

@Test
public void init(){

    HomePageTests home = getHomePage();
    ResultsPageTests results = home.searchFlightAction();
    results.checkButton();
    results.checkElements();
}

}
