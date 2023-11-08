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
	private String userName;
	private String password;
	private String otherId;
	private  String uploadFileName;
	private String licenseExpiryDate;
	private String driverLicenseNumber;
	private String dateOfBirth;
	private String uploadFileNameEdit;
	private String sizeFileUpload;
	private String commentNotes = "Comment notes abc";
	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getBrowserDriver(browserName, url);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.loginToSystem(userNameLogin,passwordLogin);

		faker = DataFaker.getDataFaker();
		otherId = faker.getId();
		password = "JctVn@1#TTT";
		uploadFileName = "JCT.jpg";
		licenseExpiryDate = "1/1/2032";
		driverLicenseNumber = "A123-233-44467";
		dateOfBirth = "1/1/1999";
		uploadFileNameEdit = "DKT.jpg";
	}
	@Description("TC_01")
	@Story("PIM")
	@Test
	public void Add_Information_At_Persional_Details_Screen(){
		log.info("Step 02: Fill in Other Id");
		persionalDetailPage.enterToTextboxByName("Other Id", otherId);

		log.info("Step 02: Fill in Driver's License Number");
		persionalDetailPage.enterToTextboxByName("Driver's License Number", driverLicenseNumber);

		log.info("Step 02: Fill in License Expiry Date");
		persionalDetailPage.enterDateToTextboxByName("License Expiry Date", licenseExpiryDate);

		log.info("Step 02: Fill in Date of Birth");
		persionalDetailPage.enterDateToTextboxByName("Date of Birth", dateOfBirth);

		log.info("Step 02: Choose Nationality dropdown");
		persionalDetailPage.chooseItemAtDropdownByName("Nationality","Afghan");

		log.info("Step 02: Choose Marital Status dropdown");
		persionalDetailPage.chooseItemAtDropdownByName("Marital","Single");

		log.info("Step 02: Choose Gender radiobutton");
		persionalDetailPage.chooseItemAtGenderDropdown("Female");

		log.info("Step 02: Click Save button");
		persionalDetailPage.clickToSaveButtonByTitle("Personal Details");

		log.info("Step 02: Verify Toast message is displayed with content Successfully Updated");
		verifyTrue(persionalDetailPage.isToastMessageDisplayedByText("Successfully Updated"));

		log.info("Step 02: Verify data is displayed");
		verifyTrue(persionalDetailPage.isDataPersionalDetailDisplayedByName("",""));

		log.info("Step 02: Click Add Attachment");
		persionalDetailPage.clickToAddAtachment();

		log.info("Step 02: Upload file");
		persionalDetailPage.uploadFile(uploadFileName);

		log.info("Step 02: Verify file is uploaded successfully");
		verifyTrue(persionalDetailPage.isFileUploadedSuccessfully(uploadFileName));

		log.info("Step 02: Get size of file upload");
		sizeFileUpload = persionalDetailPage.getSizeOfFileUploadByFileName(uploadFileName);

		log.info("Step 02: Fill in Comment");
		persionalDetailPage.EnterToComment(commentNotes);

		log.info("Step 02: Click Save button");
		persionalDetailPage.clickToSaveButtonByTitle("Attachments");

		log.info("Step 02: Verify Toast message is displayed with content Successfully Saved");
		verifyTrue(persionalDetailPage.isToastMessageDisplayedByText("Successfully Saved"));

		log.info("Step 02: Verify data is displayed at table");
		verifyTrue(persionalDetailPage.isDataAttachmentDisplayedByColumnName("File Name",uploadFileName));
		verifyTrue(persionalDetailPage.isDataAttachmentDisplayedByColumnName("Size",sizeFileUpload));

		log.info("Step 02: Click Edit button at Actions column");
		persionalDetailPage.clickEditButtonByFileName(uploadFileName);

		log.info("Step 02: Upload file");
		persionalDetailPage.uploadFile(uploadFileNameEdit);

		log.info("Step 02: Verify file is uploaded successfully");
		verifyTrue(persionalDetailPage.isFileUploadedSuccessfully(uploadFileNameEdit));

		log.info("Step 02: Get size of file upload");
		sizeFileUpload = persionalDetailPage.getSizeOfFileUploadByFileName(uploadFileNameEdit);

		log.info("Step 02: Fill in Comment");
		persionalDetailPage.EnterToComment(commentNotes);

		log.info("Step 02: Click Save button");
		persionalDetailPage.clickToSaveButtonByTitle("Attachments");

		log.info("Step 02: Verify Toast message is displayed with content Successfully Updated");
		verifyTrue(persionalDetailPage.isToastMessageDisplayedByText("Successfully Updated"));

		log.info("Step 02: Verify data is displayed at table");
		verifyTrue(persionalDetailPage.isDataAttachmentDisplayedByColumnName("File Name",uploadFileNameEdit));
		verifyTrue(persionalDetailPage.isDataAttachmentDisplayedByColumnName("Size",sizeFileUpload));

		//log.info("Step 02: Click Download button at Actions column");

		log.info("Step 02: Click Delete button at Actions column");
		persionalDetailPage.clickToDeleteByFileName(uploadFileNameEdit);

		log.info("Step 02: Click Yes, Delete button at Popup");
		persionalDetailPage.clickToYesDeleteButton();

		log.info("Step 02: Verify Toast message is displayed with content Successfully Deleted");
		verifyTrue(persionalDetailPage.isToastMessageDisplayedByText("Successfully Deleted"));

		log.info("Step 02: Verify data is undisplayed at table");
		verifyTrue(persionalDetailPage.isDataAttachmentUndisplayedByColumnName("File Name",uploadFileNameEdit));
		verifyTrue(persionalDetailPage.isDataAttachmentUndisplayedByColumnName("Size",sizeFileUpload));

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
