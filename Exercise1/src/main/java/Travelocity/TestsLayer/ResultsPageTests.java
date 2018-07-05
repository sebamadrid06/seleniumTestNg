package Travelocity.TestsLayer;

import Travelocity.PagesLayer.ResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultsPageTests extends ResultsPage {
    public ResultsPageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public void checkButton() {
        List<WebElement> obj = getDriver().findElements(By.cssSelector("#flightModuleList li:nth-child(N) button"));

        for (int i = 0 ; i <obj.size() ; i++)
        {
            WebElement item = obj.get(i);
            System.out.println(item.getText());

        }

    }




}
