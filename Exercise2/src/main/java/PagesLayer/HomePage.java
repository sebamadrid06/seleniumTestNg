package PagesLayer;

import Resources.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    public HomePage(WebDriver pdriver) {
        super(pdriver);
        pdriver.manage().window().maximize();
        pdriver.get("http://travelocity.com");
    }
    @FindBy(css = "button[data-section-id='#section-flight-tab-hp']")
    private WebElement flightButton;
    @FindBy(css = "button[data-section-id='#section-package-tab-hp']")
    private WebElement flightHotelButton;
    @FindBy(css="label[class='check col gcw-option']")
    private WebElement hotelOptions;
    @FindBy(css = "input[id='flight-origin-hp-flight']")
    private WebElement originCity;
    @FindBy(css ="input[id='flight-destination-hp-flight']")
    private WebElement destinationCity;
    @FindBy(css = "input[id='flight-departing-hp-flight']")
    private WebElement departingCalendar;
    @FindBy(css = "input[id='flight-returning-hp-flight']")
    private WebElement returningCalendar;
    @FindBy(css="button[class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
    private WebElement nextMonth;
    @FindBy(css="button[data-year='2018'][data-month='9'][data-day='1']")
    private WebElement firstDay;
    @FindBy(css="button[data-year='2018'][data-month='9'][data-day='14']")
    private WebElement lastDay;
    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit ']")
    private WebElement searchButton;
    public WebElement getFlightButton() {
        return flightButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getFlightHotelButton() {
        return flightHotelButton;
    }

    public WebElement getHotelOptions() {
        return hotelOptions;
    }

    public WebElement getOriginCity() {
        return originCity;
    }

    public WebElement getDestinationCity() {
        return destinationCity;
    }

    public WebElement getNextMonth() {
        return nextMonth;
    }

    public WebElement getFirstDay() {
        return firstDay;
    }

    public WebElement getLastDay() {
        return lastDay;
    }

    public WebElement getDepartingCalendar() {
        return departingCalendar;
    }

    public WebElement getReturningCalendar() {
        return returningCalendar;
    }
}

