package pageObjects.PIM;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGeneratorManager;
import pageUI.PIMMenu.EmployeeListPageUI;

public class EmployeeListPageObject extends BasePage {
    WebDriver driver;

    public EmployeeListPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public AddEmployeePageObject clickToAddbutton() {
        waitForElementClickable(driver, EmployeeListPageUI.ADD_BUTTON);
        clickToElement(driver, EmployeeListPageUI.ADD_BUTTON);
        return PageGeneratorManager.getAddEmployeePage(driver);
    }

    public void SearchAtTextboxByLabel(String labelName, String valueToSearch) {
        waitForElementVisible(driver, EmployeeListPageUI.SEARCH_TEXTBOX_BY_LABEL, labelName);
        sendkeyToElement(driver, EmployeeListPageUI.SEARCH_TEXTBOX_BY_LABEL, valueToSearch, labelName);
        waitForElementClickable(driver, EmployeeListPageUI.SEARCH_BUTTON);
        clickToElement(driver, EmployeeListPageUI.SEARCH_BUTTON);
    }
    public PersionalDetailPageObject clickToRecordByFirstName(String firstName){
        waitForListElementVisible(driver, EmployeeListPageUI.RECORD_BY_FIRST_NAME, firstName);
        clickToElement(driver, EmployeeListPageUI.RECORD_BY_FIRST_NAME, firstName);
        return PageGeneratorManager.getPersionalDetailPage(driver);
    }


}
