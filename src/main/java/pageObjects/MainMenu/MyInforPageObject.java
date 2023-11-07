package pageObjects.MainMenu;

import org.openqa.selenium.WebDriver;

public class MyInforPageObject extends SidePanelPageObject {
    WebDriver driver;

    public MyInforPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
