package pageObjects;

import org.openqa.selenium.WebDriver;

public class ClaimPageObject extends SidePanelPageObject{
    WebDriver driver;

    public ClaimPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
