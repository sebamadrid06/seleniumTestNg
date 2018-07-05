package Travelocity.Testing;

import Travelocity.Resources.NewDriver;
import Travelocity.TestsLayer.HomePageTests;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase {

NewDriver myDriver;

    private HomePageTests homePage;

@BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void beforeSuite(String browser){

    myDriver = new NewDriver(browser);
    homePage = new HomePageTests(myDriver.getDriver());

}
//@AfterSuite(alwaysRun = true)
//public void afterSuite(){

 //   homePage.dispose();

//}


    public HomePageTests getHomePage() {
        return homePage;
    }
}
