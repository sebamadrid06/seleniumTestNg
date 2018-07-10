package Travelocity.PagesLayer;

import Travelocity.Testing.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeparturePage extends BasePage {

    WebElement selectButton = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(3) button"));

    public DeparturePage(WebDriver pdriver) {
        super(pdriver);
    }
}
