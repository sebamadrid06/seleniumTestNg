package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver pdriver) {
        PageFactory.initElements(pdriver,this);
        wait = new WebDriverWait(pdriver,10);
        driver = pdriver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
