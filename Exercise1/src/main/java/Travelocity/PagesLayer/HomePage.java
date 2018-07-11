package Travelocity.PagesLayer;

import Travelocity.Testing.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

    Actions action = new Actions(getDriver());
    @FindBy(id = "tab-flight-tab-hp")
    private WebElement flightsButton;
    @FindBy(xpath = "//a[@id='aria-option-0']//span[@class='text']//div[@class='multiLineDisplay']")
    private WebElement selectOrigin;
    @FindBy(xpath = "//a[@id='aria-option-0']//span[@class='text']//div[@class='multiLineDisplay']")
    private WebElement selectDestiny;
    @FindBy(id = "flight-origin-hp-flight")
    private WebElement flyingFrom;
    @FindBy(id = "flight-destination-hp-flight")
    private WebElement flyingTo;
    @FindBy(id = "flight-type-roundtrip-label-hp-flight")
    private WebElement roundtripButton;
    @FindBy(id = "flight-departing-hp-flight")
    private WebElement departingDate;
    @FindBy(id = "flight-returning-hp-flight")
    private WebElement returningDate;
    @FindBy(xpath = "//html//section[@id='WizardHero']//button[2]")
    private WebElement calendarNextButton;
    @FindBy(xpath = "//div[@class='datepicker-close']//button[@type='button']")
    private WebElement calendarCloseButton;
    @FindBy(xpath = "//a[@id='aria-option-0']//span[@class='text']//div[@class='multiLineDisplay']")
    private WebElement cityResults;
    @FindBy(xpath = "//html//tr[1]/td[2]/button[1]")
    private WebElement departingDay;
    //Search for a flight action
    @FindBy(xpath = "//html//div[3]/table[1]/tbody[1]/tr[5]/td[4]/button[1]")
    private WebElement returningDay;
    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//div[@class='cols-nested']//label[@class='col search-btn-col']//button[@type='submit']")
    private WebElement searchButton;

    public HomePage(WebDriver pdriver) {
        super(pdriver);
        pdriver.manage().window().maximize();
        //getDriver().manage().deleteAllCookies();
        pdriver.get("http://travelocity.com");

    }

    Select comboFrom;

    public WebElement getFlightsButton() {
        return flightsButton;
    }

    public WebElement getSelectOrigin() {
        return selectOrigin;
    }

    public WebElement getSelectDestiny() {
        return selectDestiny;
    }

    public WebElement getFlyingFrom() {
        return flyingFrom;
    }

    public WebElement getFlyingTo() {
        return flyingTo;
    }

    public WebElement getRoundtripButton() {
        return roundtripButton;
    }

    public WebElement getDepartingDate() {
        return departingDate;
    }

    public WebElement getReturningDate() {
        return returningDate;
    }

    public WebElement getCalendarNextButton() {
        return calendarNextButton;
    }

    public WebElement getCalendarCloseButton() {
        return calendarCloseButton;
    }

    public WebElement getCityResults() {
        return cityResults;
    }

    public WebElement getDepartingDay() {
        return departingDay;
    }

    public WebElement getReturningDay() {
        return returningDay;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }


}
