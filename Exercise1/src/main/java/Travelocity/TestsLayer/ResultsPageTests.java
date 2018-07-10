package Travelocity.TestsLayer;

import Travelocity.PagesLayer.ResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultsPageTests extends ResultsPage {
    public ResultsPageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public void checkButton() {
        List<WebElement> obj = getDriver().findElements(By.cssSelector("#flightModuleList li:nth-child(N) button"));

        for (int i = 0; i < obj.size(); i++) {
            WebElement item = obj.get(i);
            System.out.println(item.getText());

        }

    }


    public void checkFlightDurationElement() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flightModuleList li:nth-child(N) span[data-test-id='duration']")));


        List<WebElement> flightDurationElement = getDriver().findElements(By.cssSelector("#flightModuleList li:nth-child(N) span[data-test-id='duration']"));

        for (int i = 0; i < flightDurationElement.size(); i++) {

            WebElement item = flightDurationElement.get(i);

            System.out.println(item.getText());

        }
    }

    public void checkFlightDetails() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flightModuleList li:nth-child(N) span[class='show-flight-details']")));


        List<WebElement> flightDurationElement = getDriver().findElements(By.cssSelector("#flightModuleList li:nth-child(N) span[class='show-flight-details']"));

        for (int i = 0; i < flightDurationElement.size(); i++) {

            WebElement item = flightDurationElement.get(i);

            System.out.println(item.getText());

        }
    }

    public void checkDurationSort() {

        Select orderBy;
        orderBy = new Select(getDriver().findElement(By.name("sort")));
        orderBy.selectByValue("duration:asc");
        getWait().until(ExpectedConditions.elementToBeClickable(sortElement));
        List<WebElement> flightDurationElement = getDriver().findElements(By.cssSelector("#flightModuleList li:nth-child(N) span[data-test-id='duration']"));
        List<String> durationList = new ArrayList<String>();
        List<String> modList = new ArrayList<String>();
        String aux;
        for (int i = 0; i < flightDurationElement.size(); i++) {

            WebElement item = flightDurationElement.get(i);
            durationList.add(item.getText().trim());
        }
        for (int i = 0; i < durationList.size(); i++) {
            char c = durationList.get(i).charAt(4);

            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9' && c != '0') {
                aux = durationList.get(i).replace(" ", "0");
                durationList.set(i, aux);
                //System.out.println(durationList.get(i).replace(" ",""));
            }

        }

        for(int i = 0; i<durationList.size(); i++){
            modList.add(durationList.get(i).replaceAll("\\s+",""));
        }
        System.out.println(modList);
        boolean isSorted = true;
        for(int i = 1 ; i<modList.size();i++){

            if(modList.get(i-1).compareTo(modList.get(i)) > 0){

                isSorted = false;
            }

        }
        Assert.assertTrue(isSorted);
    }

    public void selectFirstResult() {

        WebElement item = getDriver().findElement(By.cssSelector("#flightModuleList li:nth-child(1) button"));

    }

}










