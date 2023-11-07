package PIM;

import commons.BaseTest;
import commons.DashBoardPageObject;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;
import pageObjects.PIMMenu.AddEmployeePageObject;
import pageObjects.PIMMenu.EmployeeListPageObject;
import pageObjects.PIMMenu.PersionalDetailPageObject;
import utitlities.DataFaker;

public class Emergency_Contacts_Screen extends BaseTest{
    private WebDriver driver;
    private String userNameLogin = "automationfc";
    private String passwordLogin = "Auto123456@";

    DataFaker faker;
    private String firstName;
    private String middleName;
    private String lastName;
    private String userName;
    private String password;
    private String employeeId;
    private String avatarFileName;

    @Parameters({"browser","url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        loginPage = PageGeneratorManager.getLoginPage(driver);
        loginPage.loginToSystem(userNameLogin,passwordLogin);

        faker = DataFaker.getDataFaker();
        firstName = faker.getFirstName();
        middleName = faker.getMiddleName();
        lastName = faker.getLastName();
        userName = faker.getEmailAddress();
        password = "JctVn@1#TTT";
        avatarFileName = "JCT.jpg";
    }
    public void PIM_04_Add_Information_At_Emergency_Contacts_Screen(){
        log.info("PIM_04 - Step : Click Assigned Emergency Contacts on menu");

        log.info("PIM_04 - Step : Click Add button");

        log.info("PIM_04 - Step : Fill in Name");

        log.info("PIM_04 - Step : Fill in Relationship");

        log.info("PIM_04 - Step : Fill in Home Telephone");

        log.info("PIM_04 - Step : Fill in Mobile");

        log.info("PIM_04 - Step : Fill in Work Telephone");

        log.info("PIM_04 - Step : Click Save button");

        log.info("PIM_04 - Step : Click Edit button at Actions column");

        log.info("PIM_04 - Step : Fill in Name");

        log.info("PIM_04 - Step : Fill in Relationship");

        log.info("PIM_04 - Step : Fill in Home Telephone");

        log.info("PIM_04 - Step : Fill in Mobile");

        log.info("PIM_04 - Step : Fill in Work Telephone");

        log.info("PIM_04 - Step : Click Save button");

        log.info("PIM_04 - Step : Click Delete button at Actions column");

        log.info("PIM_04 - Step : Click Yes, Delete button at Popup");

        log.info("PIM_04 - Step : Click Add Attachment");

        log.info("PIM_04 - Step : Upload file");

        log.info("PIM_04 - Step : Fill in Comment");

        log.info("PIM_04 - Step : Click Save button");

        log.info("PIM_04 - Step : Click Edit button at Actions column");

        log.info("PIM_04 - Step : Upload file");

        log.info("PIM_04 - Step : Fill in Comment");

        log.info("PIM_04 - Step : Click Save button");

        log.info("PIM_04 - Step : Click Download button at Actions column");

        log.info("PIM_04 - Step : Click Delete button at Actions column");

        log.info("PIM_04 - Step : Click Yes, Delete button at Popup");

    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        //quitBrowserDriver();
    }

    LoginPageObject loginPage;
    DashBoardPageObject dashBoardPage;
    EmployeeListPageObject employeeListPage;
    AddEmployeePageObject addEmployeePage;
    PersionalDetailPageObject persionalDetailPage;

}
