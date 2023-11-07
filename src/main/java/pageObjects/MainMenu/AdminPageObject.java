package pageObjects.MainMenu;

import org.openqa.selenium.WebDriver;

public class AdminPageObject extends SidePanelPageObject {
    WebDriver driver;

    public AdminPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
