package Testing;

import PagesLayer.HomePage;
import TestsLayer.HomePageTests;
import org.testng.annotations.Test;

public class TestingExercise2 extends TestBase{

    @Test
    public void init() throws InterruptedException{

        HomePageTests homePageTests = getHomePageTests();
        homePageTests.checkElements();
        homePageTests.inputTravelData();
    }

}
