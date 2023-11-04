package pageObjects;

import org.openqa.selenium.WebDriver;

public class RecruitmentPageObject extends SidePanelPageObject{
    WebDriver driver;

    public RecruitmentPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
