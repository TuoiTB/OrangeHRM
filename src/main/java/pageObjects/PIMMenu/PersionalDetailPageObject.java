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
        waitForElementInvisible(driver,PersionalDetailPageUI.SPINNER_ICON);
        waitForElementVisible(driver,PersionalDetailPageUI.FIRST_NAME_TEXTBOX);
        return getElementAttribute(driver,PersionalDetailPageUI.FIRST_NAME_TEXTBOX,"value");
    }

    public String getMiddleName() {
        waitForElementVisible(driver,PersionalDetailPageUI.MIDDLE_NAME);
        return getElementAttribute(driver,PersionalDetailPageUI.MIDDLE_NAME,"value");
    }

    public String getLastName() {
        waitForElementVisible(driver,PersionalDetailPageUI.LAST_NAME);
        return getElementAttribute(driver,PersionalDetailPageUI.LAST_NAME,"value");
    }

    /*public boolean isAvatarSavedSuccessfully() {

    }*/

    public String getEmployeeId() {
        waitForElementVisible(driver,PersionalDetailPageUI.EMPLOYEE_TEXTBOX);
        return getElementAttribute(driver,PersionalDetailPageUI.EMPLOYEE_TEXTBOX,"value");
    }
    public void clickCustomDropdownListByName(){
        waitForElementVisible(driver, "//label[text()='Nationality']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']");
        selectItemInCustomDropdown(driver,"//label[text()='Nationality']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']","//label[text()='Nationality']/parent::div/following-sibling::div//div[@role='listbox']","Afghan");
        sleepInSecond(4);
    }

    public void enterToTextboxByName(String otherId, String otherId1) {
    }

    public void enterDateToTextboxByName(String licenseExpiryDate, String licenseExpiryDate1) {
    }

    public void chooseItemAtDropdownByName(String nationality, String afghan) {
    }

    public void chooseItemAtGenderDropdown(String female) {
    }

    public void clickToSaveButtonByTitle(String personalDetails) {
    }

    public boolean isToastMessageDisplayedByText(String successfullyUpdated) {
        return false;
    }

    public boolean isDataPersionalDetailDisplayedByName(String s, String s1) {
        return false;
    }

    public void clickToAddAtachment() {
    }

    public void uploadFile(String uploadFileName) {
    }

    public void EnterToComment(String commentNotes) {
    }

    public boolean isFileUploadedSuccessfully(String uploadFileName) {
        return false;
    }

    public String getSizeOfFileUploadByFileName(String uploadFileName) {
        return uploadFileName;
    }

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
