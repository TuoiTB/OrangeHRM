package pageObjects;

import org.openqa.selenium.WebDriver;

public class PerformancePageObject extends SidePanelPageObject{
    WebDriver driver;

    public PerformancePageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
