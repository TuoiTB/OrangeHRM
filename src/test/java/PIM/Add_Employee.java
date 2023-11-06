package PIM;

import commons.BaseTest;
import commons.GlobalConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;
import utitlities.DataFaker;

@Epic("Account")
@Feature("Create Account")
public class Add_Employee extends BaseTest {

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
	@Description("TC_01")
	@Story("Add Employee")
	@Test
	public void PIM_01_Add_Employee() {
		log.info("PIM_01 - Step 01: Open PIM link at menu");
		dashBoardPage = PageGeneratorManager.getDashBoardPage(driver);
		dashBoardPage.openPIMPage();

		log.info("PIM_01 - Step 02: Click Add button");
		employeeListPage = PageGeneratorManager.getEmployeeListPage(driver);
		addEmployeePage = employeeListPage.clickToAddbutton();

		log.info("PIM_01 - Step 03: Fill in First Name");
		addEmployeePage.enterFirstName(firstName);

		log.info("PIM_01 - Step 04: Fill in Middle Name");
		addEmployeePage.enterMiddleName(middleName);

		log.info("PIM_01 - Step 05: Fill in Last Name");
		addEmployeePage.enterLastName(lastName);

		log.info("PIM_01 - Step 06: Get value of Employee id");
		employeeId = addEmployeePage.getEmployeeId();
		System.out.println(employeeId);

		log.info("PIM_01 - Step 07: On Create Login Details toggle");
		addEmployeePage.clickToCreatLoginDetailsToggle();

		log.info("PIM_01 - Step 08: Fill in User Name");
		addEmployeePage.enterToUserName(userName);

		log.info("PIM_01 - Step 09: Choose Status radio button");
		addEmployeePage.chooseStatusByText("Disabled");

		log.info("PIM_01 - Step 10: Fill in Password");
		addEmployeePage.enterToPassWord(password);

		log.info("PIM_01 - Step 11: Fill in Confirm Password");
		addEmployeePage.enterToConfirmPassWord(password);

		log.info("PIM_01 - Step 12: Upload Avatar and verify uploaded successed");
		String valueBeforeUploadAvatar = addEmployeePage.getValueBeforeUploadAvatar();
		System.out.println(valueBeforeUploadAvatar);
		addEmployeePage.uploadAvatar(avatarFileName);
		String valueAfterUploadAvatar = addEmployeePage.getValueAfterUploadAvatar();
		System.out.println(valueAfterUploadAvatar);
		verifyFalse(valueBeforeUploadAvatar.equals(valueAfterUploadAvatar));

		log.info("PIM_01 - Step 13: Click Save button");
		addEmployeePage.clickToSaveButton();

		log.info("PIM_01 - Step 14: Verify Toast message is displayed with content Successfully Saved");
		verifyEquals(addEmployeePage.getToastMessage(),"Successfully Saved");

		log.info("PIM_01 - Step 15: Verify openning Persional Detail Screen is true");
		persionalDetailPage = PageGeneratorManager.getPersionalDetailPage(driver);
		verifyTrue(persionalDetailPage.isPersionalDetailTitleDisplayed());

		log.info("PIM_01 - Step 16: Verify First Name is displayed.");
		verifyEquals(persionalDetailPage.getFirstName(),firstName);

		log.info("PIM_01 - Step 17: Verify Middle Name is displayed.");
		verifyEquals(persionalDetailPage.getMiddleName(),middleName);

		log.info("PIM_01 - Step 18: Verify Last Name is displayed.");
		verifyEquals(persionalDetailPage.getLastName(),lastName);

		log.info("PIM_01 - Step 19: Verify Employee id is displayed.");
		verifyEquals(persionalDetailPage.getEmployeeId(),employeeId);

		log.info("PIM_01 - Step 20: Verify Avatar is displayed.");
		//verifyTrue(persionalDetailPage.isAvatarDisplayed());

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
