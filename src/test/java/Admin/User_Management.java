package Admin;

import commons.BaseTest;
import commons.DashBoardPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.Admin.UserManagementListPageObject;
import pageObjects.MainMenu.AdminPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.common.LoginPageObject;
import utitlities.DataFaker;

public class User_Management extends BaseTest {
    private WebDriver driver;
    private String userNameLogin = "automationfc";
    private String passwordLogin = "Auto123456@";
    private String userName, password;
    DataFaker faker;
    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGeneratorManager.getLoginPage(driver);
        loginPage.loginToSystem(userNameLogin, passwordLogin);
        dashBoardPage = PageGeneratorManager.getDashBoardPage(driver);
        adminPageObject = dashBoardPage.openAdminPage();
        userManagementListPage = PageGeneratorManager.getUserManagementPage(driver);
        faker = DataFaker.getDataFaker();
        userName = faker.getEmailAddress();
        password = "JctVn@1#TTT";
    }
    @Test
    public void USER_01_Add_User() {
        log.info("USER_01 - Step 01: Click Add button");
        userManagementListPage.clickToAddButton();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        //quitBrowserDriver();
    }

    LoginPageObject loginPage;
    DashBoardPageObject dashBoardPage;
    AdminPageObject adminPageObject;
    UserManagementListPageObject userManagementListPage;
}
