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

@Epic("Account")
@Feature("Create Account")
public class Persional_Detail_Screen extends BaseTest {

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
	@Story("PIM")
	@Test
	public void Add_Information_At_Persional_Details_Screen(){

		log.info("Step 01: Fill in Nickname");

		log.info("Step 02: Fill in Other Id");

		log.info("Step 02: Fill in Driver's License Number");

		log.info("Step 02: Fill in License Expiry Date");

		log.info("Step 02: Fill in SSN Number");

		log.info("Step 02: Fill in Date of Birth");

		log.info("Step 02: Fill in Military Servicer");

		log.info("Step 02: Choose Nationality dropdown");

		log.info("Step 02: Choose Marital Status dropdown");

		log.info("Step 02: Choose Gender radiobutton");

		log.info("Step 02: Click Save button");

		log.info("Step 02: Choose Blood Type");

		log.info("Step 02: Click Save button");

		log.info("Step 02: Click Add Attachment");

		log.info("Step 02: Upload file");

		log.info("Step 02: Fill in Comment");

		log.info("Step 02: Click Save button");

		log.info("Step 02: Click Edit button at Actions column");

		log.info("Step 02: Upload file");

		log.info("Step 02: Fill in Comment");

		log.info("Step 02: Click Save button");

		log.info("Step 02: Click Download button at Actions column");

		log.info("Step 02: Click Delete button at Actions column");

		log.info("Step 02: Click Yes, Delete button at Popup");

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
