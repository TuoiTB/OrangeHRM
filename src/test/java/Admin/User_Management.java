package Admin;

import commons.BaseTest;
import commons.DashBoardPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.Admin.AddUserPageObject;
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
        addUserPage = userManagementListPage.clickToAddButton();

        log.info("USER_01 - Step 02: Choose User Role dropdown");
        addUserPage.chooseUserRole("Admin");

        log.info("USER_01 - Step 03: Enter Employee Name textbox search");
        addUserPage.enterToSearchEmployeeTextbox("e");
        addUserPage.chooseEmployeeNameAtDropdown("ee ee ee");

        log.info("USER_01 - Step 04: Choose Status dropdown");
        addUserPage.chooseStatusDropdown("Disabled");

        log.info("USER_01 - Step 05: Enter to Username textbox");
        addUserPage.enterToTextboxByName("Username",userName);

        log.info("USER_01 - Step 06: Enter to Password textbox");
        addUserPage.enterToTextboxByName("Password",password);

        log.info("USER_01 - Step 07: Enter to Confirm Password textbox");
        addUserPage.enterToTextboxByName("Confirm Password",password);

        log.info("USER_01 - Step 08: Click Save button");
        addUserPage.clickToSaveButton();

        log.info("USER_01 - Step 09: Verify toast message is displayed");
       verifyTrue(addUserPage.isToastMessageDisplayed());
    }
    public void USER_02_Search_User() {
        userManagementListPage = PageGeneratorManager.getUserManagementPage(driver);

    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        //quitBrowserDriver();
    }

    LoginPageObject loginPage;
    DashBoardPageObject dashBoardPage;
    AdminPageObject adminPageObject;
    UserManagementListPageObject userManagementListPage;
    AddUserPageObject addUserPage;
}
