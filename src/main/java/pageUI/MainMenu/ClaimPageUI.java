package pageUI.MainMenu;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenu.SidePanelPageObject;

public class ClaimPageUI extends SidePanelPageObject {
    WebDriver driver;

    public ClaimPageUI(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
