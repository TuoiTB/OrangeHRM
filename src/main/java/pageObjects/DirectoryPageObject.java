package pageObjects;

import org.openqa.selenium.WebDriver;

public class DirectoryPageObject extends SidePanelPageObject{
    WebDriver driver;

    public DirectoryPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
