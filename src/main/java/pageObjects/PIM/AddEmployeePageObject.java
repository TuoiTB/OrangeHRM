package pageObjects.PIM;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.PIMMenu.AddEmployeePageUI;

public class AddEmployeePageObject extends BasePage {
    WebDriver driver;

    public AddEmployeePageObject(WebDriver driver) {
        this.driver = driver;
    }
    public void enterFirstName(String firstName){
        waitForElementVisible(driver, AddEmployeePageUI.FIRST_NAME_TEXTBOX);
        sendkeyToElement(driver, AddEmployeePageUI.FIRST_NAME_TEXTBOX, firstName);
    }
    public void enterMiddleName(String middleName){
        waitForElementVisible(driver, AddEmployeePageUI.MIDDLE_NAME_TEXTBOX);
        sendkeyToElement(driver, AddEmployeePageUI.MIDDLE_NAME_TEXTBOX, middleName);
    }
    public void enterLastName(String lastName){
        waitForElementVisible(driver, AddEmployeePageUI.LAST_NAME_TEXTBOX);
        sendkeyToElement(driver, AddEmployeePageUI.LAST_NAME_TEXTBOX, lastName);
    }

    public String getEmployeeId() {
        waitForElementVisible(driver,AddEmployeePageUI.EMPLOYEE_TEXTBOX);
        return getElementAttribute(driver,AddEmployeePageUI.EMPLOYEE_TEXTBOX,"value");
    }
    public void clickToSaveButton() {
        waitForElementClickable(driver,AddEmployeePageUI.SAVE_BUTTON);
        clickToElement(driver,AddEmployeePageUI.SAVE_BUTTON);
    }

    public void clickToCreatLoginDetailsToggle() {
        waitForElementClickable(driver,AddEmployeePageUI.CREATE_LOGIN_DETAIL_TOGGLE);
        clickToElement(driver,AddEmployeePageUI.CREATE_LOGIN_DETAIL_TOGGLE);
    }

    public void enterToUserName(String userName) {
        waitForElementVisible(driver, AddEmployeePageUI.USER_NAME_TEXTBOX);
        sendkeyToElement(driver, AddEmployeePageUI.USER_NAME_TEXTBOX, userName);
    }

    public void chooseStatusByText(String statusText) {
        waitForElementClickable(driver,AddEmployeePageUI.STATUS_RADIOBUTTON_BY_TEXT, statusText);
        checkToCheckboxOrRadio(driver,AddEmployeePageUI.STATUS_RADIOBUTTON_BY_TEXT, statusText);
    }

    public void enterToPassWord(String password) {
        waitForElementVisible(driver, AddEmployeePageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, AddEmployeePageUI.PASSWORD_TEXTBOX, password);
    }

    public void enterToConfirmPassWord(String confirmPassword) {
        waitForElementVisible(driver, AddEmployeePageUI.CONFIRM_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, AddEmployeePageUI.CONFIRM_PASSWORD_TEXTBOX, confirmPassword);
    }

    public void uploadAvatar(String fileName) {
        uploadMultipleFiles(driver,fileName);
    }
    public String getValueBeforeUploadAvatar() {
        waitForElementVisible(driver, AddEmployeePageUI.UPLOAD_AVATAR);
        return getElementAttribute(driver, AddEmployeePageUI.UPLOAD_AVATAR, "src");
    }

    public String getValueAfterUploadAvatar() {
        waitForElementVisible(driver, AddEmployeePageUI.UPLOAD_AVATAR);
        return getElementAttribute(driver, AddEmployeePageUI.UPLOAD_AVATAR, "src");
    }

    public String getToastMessage() {
        waitForElementVisible(driver,AddEmployeePageUI.TOAST_MESSAGE_SUCCESS);
        return getElementText(driver,AddEmployeePageUI.TOAST_MESSAGE_SUCCESS);
    }
}
