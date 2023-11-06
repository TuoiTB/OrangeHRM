package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.EmployeeListPageUI;

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
}
