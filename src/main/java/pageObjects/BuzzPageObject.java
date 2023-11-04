package pageObjects;

import org.openqa.selenium.WebDriver;

public class BuzzPageObject extends SidePanelPageObject{
    WebDriver driver;

    public BuzzPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
