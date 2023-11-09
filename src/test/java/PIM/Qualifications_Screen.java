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
public class Qualifications_Screen extends BaseTest {

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
	public void PIM_10_Add_Information_At_Qualifications_Screen(){
		log.info("PIM_10 - Step : Click Qualifications on menu");
		log.info("PIM_10 - Step : Click Work Experience add button");
		log.info("PIM_10 - Step : Fill in Company");
		log.info("PIM_10 - Step : Fill in Job Title");
		log.info("PIM_10 - Step : Fill in From");
		log.info("PIM_10 - Step : Fill in To");
		log.info("PIM_10 - Step : Fill in Comment");
		log.info("PIM_10 - Step : Click Save button");
		log.info("PIM_10 - Step : Click Education add button");
		log.info("PIM_10 - Step : Fill in Level");
		log.info("PIM_10 - Step : Fill in Institute");
		log.info("PIM_10 - Step : Fill in Major/Specialization");
		log.info("PIM_10 - Step : Fill in Year");
		log.info("PIM_10 - Step : Fill in GPA/Score");
		log.info("PIM_10 - Step : Fill in Start Date");
		log.info("PIM_10 - Step : Fill in End Date");
		log.info("PIM_10 - Step : Click Save button");
		log.info("PIM_10 - Step : Click Skills add button");
		log.info("PIM_10 - Step : Fill in Skill");
		log.info("PIM_10 - Step : Fill in Years of Experience");
		log.info("PIM_10 - Step : Fill in Comments");
		log.info("PIM_10 - Step : Click Save button");
		log.info("PIM_10 - Step : Click Languages add button");
		log.info("PIM_10 - Step : Fill in Language");
		log.info("PIM_10 - Step : Fill in Fluency");
		log.info("PIM_10 - Step : Fill in Competency");
		log.info("PIM_10 - Step : Fill in Comments");
		log.info("PIM_10 - Step : Click Save button");
		log.info("PIM_10 - Step : Click License add button");
		log.info("PIM_10 - Step : Fill in License Type");
		log.info("PIM_10 - Step : Fill in License Number");
		log.info("PIM_10 - Step : Fill in Issued Date");
		log.info("PIM_10 - Step : Fill in Expiry Date");
		log.info("PIM_10 - Step : Click Save button");

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
