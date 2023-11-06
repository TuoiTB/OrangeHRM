package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUI.LoginPageUI;

public class LoginPageObject extends BasePage {
    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToSystem(String userName, String password){
        waitForElementVisible(driver, LoginPageUI.USER_NAME_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.USER_NAME_TEXTBOX, userName);
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
        waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    }
}
