package pageObjects;

import org.openqa.selenium.WebDriver;

public class DashBoardPageObject extends SidePanelPageObject{
    WebDriver driver;

    public DashBoardPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
