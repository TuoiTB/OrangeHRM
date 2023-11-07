package pageUI.MainMenu;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenu.SidePanelPageObject;

public class BuzzPageUI extends SidePanelPageObject {
    WebDriver driver;

    public BuzzPageUI(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
