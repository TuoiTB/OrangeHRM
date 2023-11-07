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
public class Memberships_Screen extends BaseTest {

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

	public void PIM_11_Add_Information_At_Memberships_Screen(){
		log.info("PIM_11 - Step : Click Memberships on menu");
		log.info("PIM_11 - Step : Click Assigned Memberships add button");
		log.info("PIM_11 - Step : Fill in Membership");
		log.info("PIM_11 - Step : Fill in Subscription Paid By");
		log.info("PIM_11 - Step : Fill in Subscription Amount");
		log.info("PIM_11 - Step : Fill in Currency");
		log.info("PIM_11 - Step : Fill in Subscription Commence Date");
		log.info("PIM_11 - Step : Fill in Subscription Renewal Date");
		log.info("PIM_11 - Step : Click Save button");
		log.info("PIM_11 - Step : Click Edit button at Actions column");
		log.info("PIM_11 - Step : Fill in Membership");
		log.info("PIM_11 - Step : Fill in Subscription Paid By");
		log.info("PIM_11 - Step : Fill in Subscription Amount");
		log.info("PIM_11 - Step : Fill in Currency");
		log.info("PIM_11 - Step : Fill in Subscription Commence Date");
		log.info("PIM_11 - Step : Fill in Subscription Renewal Date");
		log.info("PIM_11 - Step : Click Save button");
		log.info("PIM_11 - Step : Click Delete button at Actions column");
		log.info("PIM_11 - Step : Click Yes, Delete button at Popup");
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
