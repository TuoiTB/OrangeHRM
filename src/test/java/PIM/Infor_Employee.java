package PIM;

import commons.BaseTest;
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
import utitlities.DataFaker;

@Epic("Account")
@Feature("Create Account")
public class Infor_Employee extends BaseTest {

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

		/*log.info("PIM_01 - Step 20: Verify Avatar is displayed.");
		verifyTrue(persionalDetailPage.isAvatarDisplayed());*/

	}
	public void PIM_02_Add_Information_At_Persional_Details_Screen(){
		log.info("PIM_02 - Step 01: Fill in Nickname");

		log.info("PIM_02 - Step 02: Fill in Other Id");

		log.info("PIM_02 - Step 02: Fill in Driver's License Number");

		log.info("PIM_02 - Step 02: Fill in License Expiry Date");

		log.info("PIM_02 - Step 02: Fill in SSN Number");

		log.info("PIM_02 - Step 02: Fill in Date of Birth");

		log.info("PIM_02 - Step 02: Fill in Military Servicer");

		log.info("PIM_02 - Step 02: Choose Nationality dropdown");

		log.info("PIM_02 - Step 02: Choose Marital Status dropdown");

		log.info("PIM_02 - Step 02: Choose Gender radiobutton");

		log.info("PIM_02 - Step 02: Click Save button");

		log.info("PIM_02 - Step 02: Choose Blood Type");

		log.info("PIM_02 - Step 02: Click Save button");

		log.info("PIM_02 - Step 02: Click Add Attachment");

		log.info("PIM_02 - Step 02: Upload file");

		log.info("PIM_02 - Step 02: Fill in Comment");

		log.info("PIM_02 - Step 02: Click Save button");

		log.info("PIM_02 - Step 02: Click Edit button at Actions column");

		log.info("PIM_02 - Step 02: Upload file");

		log.info("PIM_02 - Step 02: Fill in Comment");

		log.info("PIM_02 - Step 02: Click Save button");

		log.info("PIM_02 - Step 02: Click Download button at Actions column");

		log.info("PIM_02 - Step 02: Click Delete button at Actions column");

		log.info("PIM_02 - Step 02: Click Yes, Delete button at Popup");

	}
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

	public void PIM_05_Add_Information_At_Dependents_Screen(){
		log.info("PIM_05 - Step : Click Dependents on menu");
		log.info("PIM_05 - Step : Click Add button");
		log.info("PIM_05 - Step : Fill in Name");
		log.info("PIM_05 - Step : Fill in Relationship");
		log.info("PIM_05 - Step : Fill in Date of Birth");
		log.info("PIM_05 - Step : Click Save button");
		log.info("PIM_05 - Step : Click Edit button at Actions column");
		log.info("PIM_05 - Step : Fill in Relationship");
		log.info("PIM_05 - Step : Fill in Date of Birth");
		log.info("PIM_05 - Step : Click Save button");
		log.info("PIM_05 - Step : Click Delete button at Actions column");
		log.info("PIM_05 - Step : Click Yes, Delete button at Popup");
		log.info("PIM_05 - Step : Click Add Attachment");
		log.info("PIM_05 - Step : Upload file");
		log.info("PIM_05 - Step : Fill in Comment");
		log.info("PIM_05 - Step : Click Save button");
		log.info("PIM_05 - Step : Click Edit button at Actions column");
		log.info("PIM_05 - Step : Upload file");
		log.info("PIM_05 - Step : Fill in Comment");
		log.info("PIM_05 - Step : Click Save button");
		log.info("PIM_05 - Step : Click Download button at Actions column");
		log.info("PIM_05 - Step : Click Delete button at Actions column");
		log.info("PIM_05 - Step : Click Yes, Delete button at Popup");


	}
	public void PIM_06_Add_Information_At_Immigration_Screen(){
		log.info("PIM_06 - Step : Click Immigration on menu");

		log.info("PIM_06 - Step : Click Add button");

		log.info("PIM_06 - Step : Fill in Document");

		log.info("PIM_06 - Step : Fill in Number");

		log.info("PIM_06 - Step : Fill in Issued Date");

		log.info("PIM_06 - Step : Fill in Expiry Date");

		log.info("PIM_06 - Step : Fill in Eligible Status");

		log.info("PIM_06 - Step : Fill in Issued By");

		log.info("PIM_06 - Step : Fill in Eligible Review Date");

		log.info("PIM_06 - Step : Fill in Comments");

		log.info("PIM_06 - Step : Click Save button");

		log.info("PIM_06 - Step : Click Edit button at Actions column");

		log.info("PIM_06 - Step : Fill in Document");

		log.info("PIM_06 - Step : Fill in Number");

		log.info("PIM_06 - Step : Click Save button");

		log.info("PIM_06 - Step : Click Delete button at Actions column");

		log.info("PIM_06 - Step : Click Yes, Delete button at Popup");

		log.info("PIM_06 - Step : Click Add Attachment");

		log.info("PIM_06 - Step : Upload file");

		log.info("PIM_06 - Step : Fill in Comment");

		log.info("PIM_06 - Step : Click Save button");

		log.info("PIM_06 - Step : Click Edit button at Actions column");

		log.info("PIM_06 - Step : Upload file");

		log.info("PIM_06 - Step : Fill in Comment");

		log.info("PIM_06 - Step : Click Save button");

		log.info("PIM_06 - Step : Click Download button at Actions column");

		log.info("PIM_06 - Step : Click Delete button at Actions column");

		log.info("PIM_06 - Step : Click Yes, Delete button at Popup");

	}

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

	public void PIM_08_Add_Information_At_Salary_Screen(){
		log.info("PIM_08 - Step : Click Salary on menu");
		log.info("PIM_08 - Step : Fill in Salary Component");
		log.info("PIM_08 - Step : Fill in Pay Grade");
		log.info("PIM_08 - Step : Fill in Pay Frequency");
		log.info("PIM_08 - Step : Fill in Currency");
		log.info("PIM_08 - Step : Fill in pim.amount");
		log.info("PIM_08 - Step : Fill in Comments");
		log.info("PIM_08 - Step : Fill in On Include Direct Deposit Details toggle");
		log.info("PIM_08 - Step : Fill in Account Number");
		log.info("PIM_08 - Step : Fill in Account Type");
		log.info("PIM_08 - Step : Fill in Routing Number");
		log.info("PIM_08 - Step : Fill in pim.amount");
		log.info("PIM_08 - Step : Fill in Click Save button");
		log.info("PIM_08 - Step : Fill in Click Edit button at Actions column");
		log.info("PIM_08 - Step : Fill in Salary Component");
		log.info("PIM_08 - Step : Fill in Pay Grade");
		log.info("PIM_08 - Step : Fill in Pay Frequency");
		log.info("PIM_08 - Step : Fill in Currency");
		log.info("PIM_08 - Step : Fill in pim.amount");
		log.info("PIM_08 - Step : Fill in Comments");
		log.info("PIM_08 - Step : Click Save button");
		log.info("PIM_08 - Step : Click Delete button at Actions column");
		log.info("PIM_08 - Step : Click Yes, Delete button at Popup");

	}

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
