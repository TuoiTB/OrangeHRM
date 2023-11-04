package pageUI;

import org.openqa.selenium.WebDriver;
import pageObjects.SidePanelPageObject;

public class AdminPageUI extends SidePanelPageObject {
    WebDriver driver;

    public AdminPageUI(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
