package Testing;

import Resources.BrowserDriver;
import TestsLayer.HomePageTests;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase {
    BrowserDriver driver;
    private HomePageTests homePageTests;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void beforeSuite(String browser){

        driver = new BrowserDriver(browser);
        homePageTests = new HomePageTests(driver.getDriver());



    }

    public HomePageTests getHomePageTests() {
        return homePageTests;
    }
}
