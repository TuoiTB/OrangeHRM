package pageUI;

import org.openqa.selenium.WebDriver;
import pageObjects.SidePanelPageObject;

public class BuzzPageUI extends SidePanelPageObject {
    WebDriver driver;

    public BuzzPageUI(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
