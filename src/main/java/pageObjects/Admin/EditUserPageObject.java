package pageObjects.Admin;

import commons.BasePage;
import commons.GlobalConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageUI.Admin.EditUserPageUI;

import java.time.Duration;
import java.util.List;

public class EditUserPageObject extends BasePage {
    WebDriver driver;

    public EditUserPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseUserRole(String expectedText) {
        waitForElementClickable(driver, EditUserPageUI.USER_ROLE_DROPDOWN_PARENT);
        selectItemInCustomDropdown(driver, EditUserPageUI.USER_ROLE_DROPDOWN_PARENT, EditUserPageUI
                .USER_ROLE_DROPDOWN_CHILD, expectedText);
    }

    public void enterToSearchEmployeeTextbox(String valueToSend) {
        waitForElementVisible(driver, EditUserPageUI
                .EMPLOYEE_NAME_SEARCH_TEXTBOX);
        sendkeyToElement(driver, EditUserPageUI
                .EMPLOYEE_NAME_SEARCH_TEXTBOX, valueToSend);
    }

    public void chooseEmployeeNameAtDropdown(String expectedText) {
        List<WebElement> allItems = new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.LONG_TIMEOUT))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(getByLocator(EditUserPageUI
                        .EMPLOYEE_NAME_DROPDOWN)));
        for (WebElement tempElement : allItems) {
            if (tempElement.getText().equals(expectedText)) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded(true);", tempElement);
                tempElement.click();
                break;
            }
        }
    }

    public void chooseStatusDropdown(String expectedText) {
        waitForElementClickable(driver, EditUserPageUI
                .STATUS_DROPDOWN_PARENT);
        selectItemInCustomDropdown(driver, EditUserPageUI
                .STATUS_DROPDOWN_PARENT, EditUserPageUI
                .STATUS_DROPDOWN_CHILD, expectedText);
    }

    public void enterToTextboxByName(String textboxName, String valueToSend) {
        waitForElementVisible(driver, EditUserPageUI
                .DYNAMIC_TEXTBOX_BY_NAME, textboxName);
        sendkeyToElement(driver, EditUserPageUI
                .DYNAMIC_TEXTBOX_BY_NAME, valueToSend, textboxName);
    }

    public void clickToSaveButton() {
        waitForElementClickable(driver, EditUserPageUI
                .SAVE_BUTTON);
        clickToElement(driver, EditUserPageUI
                .SAVE_BUTTON);
    }

    public boolean isUpdatedToastMessageDisplayed() {
        waitForElementVisible(driver, EditUserPageUI
                .TOAST_MESSAGE);
        return isElementDisplayed(driver, EditUserPageUI
                .TOAST_MESSAGE);
    }

    public void checkToChangePasswordCheckbox() {
        waitForElementClickable(driver, EditUserPageUI.CHANGE_PASSWORD_CHECKBOX);
        checkToCheckboxOrRadio(driver, EditUserPageUI.CHANGE_PASSWORD_CHECKBOX);
    }
}
