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

    public EditUserPageObject clickEditButton(String userName) {
        waitForElementClickable(driver, UserManagementListPageUI.EDIT_ICON_BY_USERNAME, userName);
        clickToElement(driver, UserManagementListPageUI.EDIT_ICON_BY_USERNAME, userName);
        return PageGeneratorManager.getEditUserPage(driver);
    }

    public void enterToUserNameSearchTextbox(String userName) {
        waitForElementVisible(driver, UserManagementListPageUI.USER_NAME_SEARCH_TEXTBOX);
        clickToElement(driver, UserManagementListPageUI.USER_NAME_SEARCH_TEXTBOX);
        sendkeyToElement(driver, UserManagementListPageUI.USER_NAME_SEARCH_TEXTBOX, userName);
    }

    public void clickSearchButton() {
        waitForElementClickable(driver, UserManagementListPageUI.SEARCH_BUTTON);
        clickToElement(driver, UserManagementListPageUI.SEARCH_BUTTON);
    }

    public boolean isResultSearchDisplayed(String useName, String userRole, String employeeName, String status) {
        waitForElementVisible(driver, UserManagementListPageUI.ADMIN_DYNAMIC_LOCATOR_BY_COLUMN_NAME, useName, userRole, employeeName, status);
        return isElementDisplayed(driver, UserManagementListPageUI.ADMIN_DYNAMIC_LOCATOR_BY_COLUMN_NAME, useName, userRole, employeeName, status);
    }

    public void clickToDeleteButton(String userName) {
        waitForElementClickable(driver, UserManagementListPageUI.DELETE_ICON_BY_USERNAME, userName);
        clickToElement(driver, UserManagementListPageUI.DELETE_ICON_BY_USERNAME, userName);
    }

    public void clickToYesDeleteButton() {
        waitForElementClickable(driver,UserManagementListPageUI.YES_DELETE_ICON);
        clickToElement(driver,UserManagementListPageUI.YES_DELETE_ICON);
    }

    public boolean isNoRecordFoundMessageDisplayed() {
        waitForElementVisible(driver, UserManagementListPageUI.NO_RECORD_FOUND_MESSAGE);
        return isElementDisplayed(driver, UserManagementListPageUI.NO_RECORD_FOUND_MESSAGE);
    }

    public boolean isNoRecordFoundToastMessageDisplayed() {
        waitForElementVisible(driver, UserManagementListPageUI.NO_RECORD_FOUND_TOAST_MESSAGE);
        return isElementDisplayed(driver, UserManagementListPageUI.NO_RECORD_FOUND_TOAST_MESSAGE);
    }

    public boolean isRecordUndisplayed(String useName, String userRole, String employeeName, String status) {
        waitForElementVisible(driver, UserManagementListPageUI.ADMIN_DYNAMIC_LOCATOR_BY_COLUMN_NAME, useName, userRole, employeeName, status);
        return isElementUndisplayed(driver, UserManagementListPageUI.ADMIN_DYNAMIC_LOCATOR_BY_COLUMN_NAME, useName, userRole, employeeName, status);
    }
}
