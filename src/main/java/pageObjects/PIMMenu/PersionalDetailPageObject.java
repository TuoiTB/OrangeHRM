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
}
