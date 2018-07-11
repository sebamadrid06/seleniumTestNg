package Travelocity.Testing;

import Travelocity.Resources.NewDriver;
import Travelocity.TestsLayer.HomePageTests;
import Travelocity.TestsLayer.ResultsPageTests;
import Travelocity.TestsLayer.ReturnPageTests;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase {

    NewDriver myDriver;

    private HomePageTests homePage;
    private ResultsPageTests resultsPage;
    private ReturnPageTests returnPage;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void beforeSuite(String browser) {

        myDriver = new NewDriver(browser);
        homePage = new HomePageTests(myDriver.getDriver());
        String handle = myDriver.getDriver().getWindowHandle();

    }
//@AfterSuite(alwaysRun = true)
//public void afterSuite(){

    //   homePage.dispose();

//}


    public HomePageTests getHomePage() {
        return homePage;
    }

    public ResultsPageTests getResultsPage() {
        return resultsPage;
    }

    public ReturnPageTests getReturnPage() {
        return returnPage;
    }
}
