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
public class Tax_Exemptions_Screen extends BaseTest {

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
	public void PIM_09_Add_Information_At_Tax_Exemptions_Screen(){
		log.info("PIM_09 - Step : Click Tax Exemptions on menu");
		log.info("PIM_09 - Step : Fill in Status at Federal Income Tax");
		log.info("PIM_09 - Step : Fill in Exemptions at Federal Income Tax");
		log.info("PIM_09 - Step : Fill in State at State Income Tax");
		log.info("PIM_09 - Step : Fill in Status at State Income Tax");
		log.info("PIM_09 - Step : Fill in Exemptions at State Income Tax");
		log.info("PIM_09 - Step : Fill in Unemployment State at State Income Tax");
		log.info("PIM_09 - Step : Fill in Work State at State Income Tax");
		log.info("PIM_09 - Step : Click Save button");

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
