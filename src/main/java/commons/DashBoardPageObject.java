package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.MainMenu.SidePanelPageObject;

public class DashBoardPageObject extends SidePanelPageObject {
    WebDriver driver;

    public DashBoardPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
