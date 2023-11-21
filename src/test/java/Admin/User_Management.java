package Admin;

import commons.BaseTest;
import commons.DashBoardPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.Admin.AddUserPageObject;
import pageObjects.Admin.EditUserPageObject;
import pageObjects.Admin.UserManagementListPageObject;
import pageObjects.MainMenu.AdminPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.common.LoginPageObject;
import utitlities.DataFaker;

public class User_Management extends BaseTest {
    private WebDriver driver;
    private String userNameLogin = "Admin";
    private String passwordLogin = "admin123";
    private String userName, password, employeeName, userRole, status;
    private String userNameEdit, passwordEdit, employeeNameEdit, userRoleEdit, statusEdit;
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
        userRole = "Admin";
        status = "Disabled";
        employeeName = "Tuoituoi";

        userNameEdit = faker.getEmailAddress();
        passwordEdit = "JctVn@1#TTT";
        userRoleEdit = "ESS";
        statusEdit = "Enabled";
        employeeNameEdit = "Tuoituoi";
    }
    @Test
    public void USER_01_Add_User() {
        log.info("USER_01 - Step 01: Click Add button");
        addUserPage = userManagementListPage.clickToAddButton();

        log.info("USER_01 - Step 02: Choose User Role dropdown");
        addUserPage.chooseUserRole(userRole);

        log.info("USER_01 - Step 03: Enter Employee Name textbox search");
        addUserPage.enterToSearchEmployeeTextbox(employeeName);
        addUserPage.chooseEmployeeNameAtDropdown(employeeName);

        log.info("USER_01 - Step 04: Choose Status dropdown");
        addUserPage.chooseStatusDropdown(status);

        log.info("USER_01 - Step 05: Enter to Username textbox");
        addUserPage.enterToTextboxByName("Username",userName);

        log.info("USER_01 - Step 06: Enter to Password textbox");
        addUserPage.enterToTextboxByName("Password",password);

        log.info("USER_01 - Step 07: Enter to Confirm Password textbox");
        addUserPage.enterToTextboxByName("Confirm Password",password);

        log.info("USER_01 - Step 08: Click Save button");
        addUserPage.clickToSaveButton();

        log.info("USER_01 - Step 09: Verify toast message is displayed");
        verifyTrue(addUserPage.isSavedToastMessageDisplayed());
    }
    public void USER_02_Search_User() {
        userManagementListPage = PageGeneratorManager.getUserManagementPage(driver);
        log.info("USER_02 - Step : Enter to UserName search textbox");
        userManagementListPage.enterToUserNameSearchTextbox(userName);

        log.info("USER_02 - Step : Click Search button ");
        userManagementListPage.clickSearchButton();

        log.info("USER_02 - Step : Verify result search");
        verifyTrue(userManagementListPage.isResultSearchDisplayed(userName, userRole, employeeName, status));

    }

    public void USER_03_Edit_User() {
        log.info("USER_03 - Step : Click Edit button");
        editUserPage = userManagementListPage.clickEditButton(userNameEdit);

        log.info("USER_01 - Step 02: Choose User Role dropdown");
        editUserPage.chooseUserRole(userRole);

        log.info("USER_01 - Step 03: Enter Employee Name textbox search");
        editUserPage.enterToSearchEmployeeTextbox(employeeNameEdit);
        editUserPage.chooseEmployeeNameAtDropdown(employeeNameEdit);

        log.info("USER_01 - Step 04: Choose Status dropdown");
        editUserPage.chooseStatusDropdown(status);

        log.info("USER_01 - Step 05: Enter to Username textbox");
        editUserPage.enterToTextboxByName("Username",userNameEdit);

        log.info("USER_01 - Step 06: Check to Change Password checkbox");
        editUserPage.checkToChangePasswordCheckbox();

        log.info("USER_01 - Step 07: Enter to Password textbox");
        editUserPage.enterToTextboxByName("Password",passwordEdit);

        log.info("USER_01 - Step 08: Enter to Confirm Password textbox");
        editUserPage.enterToTextboxByName("Confirm Password",passwordEdit);

        log.info("USER_01 - Step 08: Click Save button");
        editUserPage.clickToSaveButton();

        log.info("USER_01 - Step 09: Verify toast message is displayed");
        verifyTrue(editUserPage.isUpdatedToastMessageDisplayed());
    }
    public void USER_04_Delete_User() {
        userManagementListPage = PageGeneratorManager.getUserManagementPage(driver);
        log.info("USER_04 - Step : Enter to UserName search textbox");
        userManagementListPage.enterToUserNameSearchTextbox(userNameEdit);

        log.info("USER_04 - Step : Click Search button ");
        userManagementListPage.clickSearchButton();

        log.info("USER_04 - Step : Verify result search");
        verifyTrue(userManagementListPage.isResultSearchDisplayed(userNameEdit, userRoleEdit, employeeNameEdit, statusEdit));

        log.info("USER_04 - Step : Click Delete button");
        userManagementListPage.clickToDeleteButton(userNameEdit);

        log.info("USER_04 - Step : Click Yes, Delete button");
        userManagementListPage.clickToYesDeleteButton();

        log.info("USER_04 - Step : Enter to UserName search textbox");
        userManagementListPage.enterToUserNameSearchTextbox(userNameEdit);

        log.info("USER_04 - Step : Click Search button ");
        userManagementListPage.clickSearchButton();

        log.info("USER_04 - Step : Verify record is deleted");
        verifyTrue(userManagementListPage.isNoRecordFoundMessageDisplayed());
        verifyTrue(userManagementListPage.isNoRecordFoundToastMessageDisplayed());
        verifyTrue(userManagementListPage.isRecordUndisplayed(userNameEdit, userRoleEdit, employeeNameEdit, statusEdit));

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
    EditUserPageObject editUserPage;
}
