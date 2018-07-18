package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {
    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public BrowserDriver(String browser) {
        if(browser.equals("firefox")){
            driver = new FirefoxDriver();
        }
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\hugo.madrid\\Desktop\\Tools\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }


    }
}
