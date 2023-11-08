package pageObjects.PIMMenu;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.PIMMenu.PersionalDetailPageUI;

public class PersionalDetailPageObject extends BasePage {
    WebDriver driver;

    public PersionalDetailPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPersionalDetailTitleDisplayed() {
        waitForElementVisible(driver, PersionalDetailPageUI.TITLE_PAGE);
        return isElementDisplayed(driver, PersionalDetailPageUI.TITLE_PAGE);
    }

    public String getFirstName() {
        waitForElementInvisible(driver, PersionalDetailPageUI.SPINNER_ICON);
        waitForElementVisible(driver, PersionalDetailPageUI.FIRST_NAME_TEXTBOX);
        return getElementAttribute(driver, PersionalDetailPageUI.FIRST_NAME_TEXTBOX, "value");
    }

    public String getMiddleName() {
        waitForElementVisible(driver, PersionalDetailPageUI.MIDDLE_NAME);
        return getElementAttribute(driver, PersionalDetailPageUI.MIDDLE_NAME, "value");
    }

    public String getLastName() {
        waitForElementVisible(driver, PersionalDetailPageUI.LAST_NAME);
        return getElementAttribute(driver, PersionalDetailPageUI.LAST_NAME, "value");
    }

    /*public boolean isAvatarSavedSuccessfully() {

    }*/

    public String getEmployeeId() {
        waitForElementVisible(driver, PersionalDetailPageUI.EMPLOYEE_TEXTBOX);
        return getElementAttribute(driver, PersionalDetailPageUI.EMPLOYEE_TEXTBOX, "value");
    }

    public void enterToTextboxByName(String textboxName, String valueToSend) {
        waitForElementVisible(driver, PersionalDetailPageUI.ENTER_TO_TEXTBOX_BY_NAME, textboxName);
        sendkeyToElement(driver, PersionalDetailPageUI.ENTER_TO_TEXTBOX_BY_NAME, valueToSend, textboxName);
    }

    public void chooseItemAtDropdownByName(String dropdownName, String expectedText) {
        waitForElementVisible(driver, "//label[text()='Nationality']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']");
        selectItemInCustomDropdown(driver, PersionalDetailPageUI.PARENT_DROPDOWN_BY_NAME, PersionalDetailPageUI.CHILD_DROPDOWN_BY_NAME, expectedText, dropdownName);
        sleepInSecond(2);
    }

    public void chooseItemAtGenderRadioButton(String valueToChoose) {
        waitForElementClickable(driver, PersionalDetailPageUI.GENDER_RADIO_BUTTON, valueToChoose);
        checkToCheckboxOrRadio(driver, PersionalDetailPageUI.GENDER_RADIO_BUTTON, valueToChoose);
    }

    public void clickToSaveButtonByTitle(String titleName) {
        waitForElementClickable(driver, PersionalDetailPageUI.SAVE_BUTTON_BY_TITLE, titleName);
        clickToElement(driver, PersionalDetailPageUI.SAVE_BUTTON_BY_TITLE, titleName);
    }

    public boolean isToastMessageDisplayedByText(String textMessage) {
        waitForElementVisible(driver, PersionalDetailPageUI.TOAST_MESSAGE_BY_TEXT, textMessage);
        return isElementDisplayed(driver, PersionalDetailPageUI.TOAST_MESSAGE_BY_TEXT, textMessage);
    }

    public String getValueTextboxByName(String textboxName) {
        waitForElementVisible(driver, PersionalDetailPageUI.ENTER_TO_TEXTBOX_BY_NAME, textboxName);
        return getElementAttribute(driver, PersionalDetailPageUI.ENTER_TO_TEXTBOX_BY_NAME, textboxName);
    }

    public void clickToAddAtachment() {
        waitForElementClickable(driver, PersionalDetailPageUI.ADD_ATTACHMENT);
        clickToElement(driver, PersionalDetailPageUI.ADD_ATTACHMENT);
    }

    public void uploadFile(String uploadFileName) {
        uploadMultipleFiles(driver, uploadFileName);
    }

    public void enterToComment(String commentNotes) {
        waitForElementVisible(driver, PersionalDetailPageUI.COMMENT_TEXTAREA);
        clickToElement(driver, PersionalDetailPageUI.COMMENT_TEXTAREA);
    }

    public boolean isFileUploadedSuccessfully(String uploadFileName) {
        waitForElementVisible(driver, PersionalDetailPageUI.AFTER_UPLOAD_FILE, uploadFileName);
        return isElementDisplayed(driver, PersionalDetailPageUI.AFTER_UPLOAD_FILE, uploadFileName);
    }

    /*public String getSizeOfFileUploadByFileName(String uploadFileName) {
        waitForElementVisible(driver, PersionalDetailPageUI.AFTER_UPLOAD_FILE, uploadFileName);
        return getListElementSize();
    }*/

    public boolean isDataAttachmentDisplayedByColumnName(String fileName, String uploadFileName) {
        return false;
    }

    public void clickEditButtonByFileName(String uploadFileName) {
    }

    public void clickToDeleteByFileName(String uploadFileNameEdit) {
    }

    public void clickToYesDeleteButton() {
    }

    public boolean isDataAttachmentUndisplayedByColumnName(String fileName, String uploadFileNameEdit) {
        return true;
    }
}
