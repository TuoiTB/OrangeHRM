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
import pageObjects.PIM.AddEmployeePageObject;
import pageObjects.PIM.EmployeeListPageObject;
import pageObjects.PIM.PersionalDetailPageObject;
import pageObjects.common.LoginPageObject;
import utitlities.DataFaker;

@Epic("Account")
@Feature("Create Account")
public class Job_Screen extends BaseTest {

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

	public void PIM_07_Add_Information_At_Job_Screen(){
		log.info("PIM_07 - Step : Click Job on menu");

		log.info("PIM_07 - Step : Fill in Joined Date");

		log.info("PIM_07 - Step : Fill in Job Title");

		log.info("PIM_07 - Step : Fill in Job Specification");

		log.info("PIM_07 - Step : Fill in Job Category");

		log.info("PIM_07 - Step : Fill in Sub Unit");

		log.info("PIM_07 - Step : Fill in Location");

		log.info("PIM_07 - Step : Fill in Employment Status");

		log.info("PIM_07 - Step : On Include Employment Contract Details toggle");

		log.info("PIM_07 - Step : Fill in Contract Start Date");

		log.info("PIM_07 - Step : Fill in Contract End Date");

		log.info("PIM_07 - Step : Upload file to Contract Details");

		log.info("PIM_07 - Step : Click Save button");

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
