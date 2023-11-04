package PIM;

import commons.BaseTest;
import commons.GlobalConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utitlities.DataFaker;

@Epic("Account")
@Feature("Create Account")
public class Add_Employee extends BaseTest {

	private WebDriver driver;
	
	DataFaker faker;
	private String firstName;
	private String lastName;
	private String password;
	private String emailAddress;
	
	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getBrowserDriver(browserName, url);
		/*homePage = PageGeneratorManager.getHomePage(driver);
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		faker = DataFaker.getDataFaker();
		firstName = faker.getFirstName();
		lastName = faker.getLastName();
		password = faker.getPassword();
		emailAddress = faker.getEmailAddress();*/
	}
	@Description("TC_01")
	@Story("Add Employee")
	@Test
	public void TC_01() {
	}
	

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		quitBrowserDriver();
	}

}
