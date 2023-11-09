package pageObjects.Admin;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.Admin.UserManagementListPageUI;

public class UserManagementListPageObject extends BasePage {
    WebDriver driver;

    public UserManagementListPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToAddButton() {
        waitForElementClickable(driver, UserManagementListPageUI.ADD_BUTTON);
        clickToElement(driver, UserManagementListPageUI.ADD_BUTTON);
    }
}
