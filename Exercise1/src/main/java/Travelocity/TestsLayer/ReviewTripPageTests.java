package Travelocity.TestsLayer;

import Travelocity.PagesLayer.ReviewTripPage;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class ReviewTripPageTests extends ReviewTripPage {
    public ReviewTripPageTests(WebDriver pdriver) {
        super(pdriver);
    }

    public void checkreviewDetails(){


        Set<String> st= getDriver().getWindowHandles();
        Iterator<String> it = st.iterator();
        String child =it.next();
// switch to child
      getDriver().switchTo().window(child);



    }


}
