package pageObjects.Admin;

import commons.BasePage;
import commons.GlobalConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageUI.Admin.AddUserPageUI;
import pageUI.Admin.UserManagementListPageUI;
import pageUI.PIMMenu.PersionalDetailPageUI;

import java.time.Duration;
import java.util.List;

public class AddUserPageObject extends BasePage {
    WebDriver driver;

    public AddUserPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseUserRole(String expectedText) {
        waitForElementClickable(driver, AddUserPageUI.USER_ROLE_DROPDOWN_PARENT);
        selectItemInCustomDropdown(driver, AddUserPageUI.USER_ROLE_DROPDOWN_PARENT, AddUserPageUI.USER_ROLE_DROPDOWN_CHILD, expectedText);
    }

    public void enterToSearchEmployeeTextbox(String valueToSend) {
        waitForElementVisible(driver, AddUserPageUI.EMPLOYEE_NAME_SEARCH_TEXTBOX);
        sendkeyToElement(driver, AddUserPageUI.EMPLOYEE_NAME_SEARCH_TEXTBOX, valueToSend);
    }

    public void chooseEmployeeNameAtDropdown(String expectedText) {
        List<WebElement> allItems = new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.LONG_TIMEOUT))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(getByLocator(AddUserPageUI.EMPLOYEE_NAME_DROPDOWN)));
        for (WebElement tempElement : allItems) {
            if (tempElement.getText().equals(expectedText)) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(true);", tempElement);
                tempElement.click();
                break;
            }
        }
    }

    public void chooseStatusDropdown(String expectedText) {
        waitForElementClickable(driver, AddUserPageUI.STATUS_DROPDOWN_PARENT);
        selectItemInCustomDropdown(driver, AddUserPageUI.STATUS_DROPDOWN_PARENT, AddUserPageUI.STATUS_DROPDOWN_CHILD, expectedText);
    }

    public void enterToTextboxByName(String textboxName, String valueToSend) {
        waitForElementVisible(driver, AddUserPageUI.DYNAMIC_TEXTBOX_BY_NAME, textboxName);
        sendkeyToElement(driver, AddUserPageUI.DYNAMIC_TEXTBOX_BY_NAME, valueToSend, textboxName);
    }

    public void clickToSaveButton() {
        waitForElementClickable(driver, AddUserPageUI.SAVE_BUTTON);
        clickToElement(driver, AddUserPageUI.SAVE_BUTTON);
    }

    public boolean isSavedToastMessageDisplayed() {
        waitForElementVisible(driver, AddUserPageUI.TOAST_MESSAGE);
        return isElementDisplayed(driver, AddUserPageUI.TOAST_MESSAGE);
    }
}
