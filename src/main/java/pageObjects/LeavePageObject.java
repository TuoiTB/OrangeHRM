package pageObjects;

import org.openqa.selenium.WebDriver;

public class LeavePageObject extends SidePanelPageObject{
    WebDriver driver;

    public LeavePageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
