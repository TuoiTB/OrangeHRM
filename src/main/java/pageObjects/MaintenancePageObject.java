package pageObjects;

import org.openqa.selenium.WebDriver;

public class MaintenancePageObject extends SidePanelPageObject{
    WebDriver driver;

    public MaintenancePageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
