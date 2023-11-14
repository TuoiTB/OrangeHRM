package pageObjects.Admin;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGeneratorManager;
import pageUI.Admin.UserManagementListPageUI;

public class UserManagementListPageObject extends BasePage {
    WebDriver driver;

    public UserManagementListPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public AddUserPageObject clickToAddButton() {
        waitForElementClickable(driver, UserManagementListPageUI.ADD_BUTTON);
        clickToElement(driver, UserManagementListPageUI.ADD_BUTTON);
        return PageGeneratorManager.getAddUserPage(driver);
    }
}
