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
public class Contact_Details_Screen extends BaseTest {

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

	public void PIM_03_Add_Information_At_Contact_Details_Screen(){
		log.info("PIM_03 - Step 01: Click Contact details on menu");

		log.info("PIM_03 - Step 01: Fill in Street 1");

		log.info("PIM_03 - Step 01: Fill in Street 2");

		log.info("PIM_03 - Step 01: Fill in City");

		log.info("PIM_03 - Step 01: Fill in State/Province");

		log.info("PIM_03 - Step 01: Fill in Zip/Postal Code");

		log.info("PIM_03 - Step 01: Fill in Home");

		log.info("PIM_03 - Step 01: Fill in Mobile");

		log.info("PIM_03 - Step 01: Fill in Work");

		log.info("PIM_03 - Step 01: Fill in Work Email");

		log.info("PIM_03 - Step 01: Fill in Other Email");

		log.info("PIM_03 - Step 01: Choose Country dropdown");

		log.info("PIM_03 - Step 01: Click Save button");

		log.info("PIM_03 - Step 01: Click Add Attachment");

		log.info("PIM_03 - Step 01: Upload file");

		log.info("PIM_03 - Step 01: Fill in Comment");

		log.info("PIM_03 - Step 01: Click Save button");

		log.info("PIM_03 - Step 01: Click Edit button at Actions column");

		log.info("PIM_03 - Step 01: Upload file");

		log.info("PIM_03 - Step 01: Fill in Comment");

		log.info("PIM_03 - Step 01: Click Save button");

		log.info("PIM_03 - Step 01: Click Download button at Actions column");

		log.info("PIM_03 - Step 01: Click Delete button at Actions column");

		log.info("PIM_03 - Step 01: Click Yes, Delete button at Popup");


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
