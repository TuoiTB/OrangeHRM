package pageObjects;

import org.openqa.selenium.WebDriver;

public class TimePageObject extends SidePanelPageObject{
    WebDriver driver;

    public TimePageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
