package Travelocity.PagesLayer;

import Travelocity.Testing.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ResultsPage extends BasePage {


    @FindBy(name = "sort")
    public WebElement sortElement;

    public ResultsPage(WebDriver pdriver) {

        super(pdriver);

    }

    public WebElement getSortElement() {
        return sortElement;
    }

    public void checkElements() {

        Select orderBy;
        orderBy = new Select(getDriver().findElement(By.name("sort")));
        orderBy.selectByValue("price:asc");
        getWait().until(ExpectedConditions.elementToBeClickable(sortElement));
        orderBy.selectByValue("price:desc");
        getWait().until(ExpectedConditions.elementToBeClickable(sortElement));
        orderBy.selectByValue("duration:asc");
        getWait().until(ExpectedConditions.elementToBeClickable(sortElement));
        orderBy.selectByValue("duration:desc");
        getWait().until(ExpectedConditions.elementToBeClickable(sortElement));
        orderBy.selectByValue("departuretime:asc");
        getWait().until(ExpectedConditions.elementToBeClickable(sortElement));
        orderBy.selectByValue("departuretime:desc");
        getWait().until(ExpectedConditions.elementToBeClickable(sortElement));
        orderBy.selectByValue("arrivaltime:asc");
        getWait().until(ExpectedConditions.elementToBeClickable(sortElement));
        orderBy.selectByValue("arrivaltime:desc");


    }


}
