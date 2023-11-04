package pageObjects;

import org.openqa.selenium.WebDriver;

public class PIMPageObject extends SidePanelPageObject{
    WebDriver driver;

    public PIMPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
