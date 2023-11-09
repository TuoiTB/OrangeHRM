package PIM;

import commons.BaseTest;
import commons.DashBoardPageObject;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.common.LoginPageObject;
import pageObjects.MainMenu.PIMPageObject;
import pageObjects.PIM.EmployeeListPageObject;
import pageObjects.PIM.PersionalDetailPageObject;
import pageObjects.PageGeneratorManager;
import utitlities.DataFaker;

@Epic("Account")
public class Persional_Detail_Screen extends BaseTest {

	WebDriver driver;
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
	private String commentNotes;
	private String nationalityChoose;
	private String marital;
	private String fileSize;
	private String commentNotesEdit;
	private String fileSizeEdit;



	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getBrowserDriver(browserName, url);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.loginToSystem(userNameLogin,passwordLogin);
		dashBoardPage = PageGeneratorManager.getDashBoardPage(driver);
		dashBoardPage.openPIMPage();
		employeeListPage = PageGeneratorManager.getEmployeeListPage(driver);
		employeeListPage.SearchAtTextboxByLabel("Employee Name", "fd rtet");
		persionalDetailPage = employeeListPage.clickToRecordByFirstName("fd rtet");

		faker = DataFaker.getDataFaker();
		otherId = faker.getId();
		password = "JctVn@1#TTT";
		uploadFileName = "JCT.jpg";
		uploadFileNameEdit = "DKT.jpg";
		fileSize = "5.46 kB";
		fileSizeEdit = "177.38 kB";
		licenseExpiryDate = "2032-01-01";
		driverLicenseNumber = "A123-233-44467";
		dateOfBirth = "1999-01-01";
		nationalityChoose = "Danish";
		commentNotes = "Comment notes abc";
		commentNotesEdit = commentNotes + "edit";
		marital = "Other";

	}
	@Description("TC_01")
	@Story("PIM")
	@Test
	public void Add_Information_At_Persional_Details_Screen(){
		log.info("Step 02: Fill in Other Id");
		persionalDetailPage.waitInvisibleSpinnerIcon();
		persionalDetailPage.enterToTextboxByName("Other Id", otherId);

		log.info("Step 02: Fill in Driver's License Number");
		persionalDetailPage.enterToTextboxByName("License Number", driverLicenseNumber);

		log.info("Step 02: Fill in License Expiry Date");
		persionalDetailPage.enterToTextboxByName("License Expiry Date", licenseExpiryDate);

		log.info("Step 02: Fill in Date of Birth");
		persionalDetailPage.enterToTextboxByName("Date of Birth", dateOfBirth);

		log.info("Step 02: Choose Nationality dropdown");
		persionalDetailPage.chooseItemAtDropdownByName("Nationality",nationalityChoose);

		log.info("Step 02: Choose Marital Status dropdown");
		persionalDetailPage.chooseItemAtDropdownByName("Marital Status",  marital);

		log.info("Step 02: Choose Gender radiobutton");
		persionalDetailPage.chooseItemAtGenderRadioButton("Female");

		log.info("Step 02: Click Save button");
		persionalDetailPage.clickToSaveButtonByTitle("Personal Details");

		log.info("Step 02: Verify Toast message is displayed with content Successfully Updated");
		verifyTrue(persionalDetailPage.isToastMessageDisplayedByText("Successfully Updated"));

		log.info("Step 02: Verify data is displayed");
		//verifyEquals(persionalDetailPage.getValueTextboxByName("Other Id"), otherId);
		//verifyEquals(persionalDetailPage.getValueTextboxByName("License Number"), driverLicenseNumber);
		//verifyEquals(persionalDetailPage.getValueTextboxByName("License Expiry Date"), licenseExpiryDate);
		//verifyEquals(persionalDetailPage.getValueTextboxByName("Date of Birth"), dateOfBirth);

		log.info("Step 02: Click Add Attachment");
		persionalDetailPage.clickToAddAtachment();

		log.info("Step 02: Upload file");
		persionalDetailPage.uploadFile(uploadFileName);

		log.info("Step 02: Verify file is uploaded successfully");
		verifyTrue(persionalDetailPage.isFileUploadedSuccessfully(uploadFileName));

		log.info("Step 02: Fill in Comment");
		persionalDetailPage.enterToComment(commentNotes);

		log.info("Step 02: Click Save button");
		persionalDetailPage.clickToSaveButtonByTitle("Add Attachment");

		log.info("Step 02: Verify Toast message is displayed with content Successfully Saved");
		verifyTrue(persionalDetailPage.isToastMessageDisplayedByText("Successfully Saved"));

		log.info("Step 02: Verify data is displayed at table");
		verifyTrue(persionalDetailPage.isDataAttachmentDisplayedByName(uploadFileName,commentNotes,fileSize));

		log.info("Step 02: Click Edit button at Actions column");
		persionalDetailPage.clickEditButtonByFileName(uploadFileName);

		log.info("Step 02: Upload file");
		persionalDetailPage.uploadFile(uploadFileNameEdit);

		log.info("Step 02: Verify file is uploaded successfully");
		verifyTrue(persionalDetailPage.isFileUploadedSuccessfully(uploadFileNameEdit));

		log.info("Step 02: Fill in Comment");
		persionalDetailPage.enterToComment(commentNotes);

		log.info("Step 02: Click Save button");
		persionalDetailPage.clickToSaveButtonByTitle("Attachments");

		log.info("Step 02: Verify Toast message is displayed with content Successfully Updated");
		verifyTrue(persionalDetailPage.isToastMessageDisplayedByText("Successfully Updated"));

		log.info("Step 02: Verify data is displayed at table");
		verifyTrue(persionalDetailPage.isDataAttachmentDisplayedByName(uploadFileNameEdit, commentNotesEdit, fileSizeEdit ));

		//log.info("Step 02: Click Download button at Actions column");

		log.info("Step 02: Click Delete button at Actions column");
		persionalDetailPage.clickToDeleteByFileName(uploadFileNameEdit);

		log.info("Step 02: Click Yes, Delete button at Popup");
		persionalDetailPage.clickToYesDeleteButton();

		log.info("Step 02: Verify Toast message is displayed with content Successfully Deleted");
		verifyTrue(persionalDetailPage.isToastMessageDisplayedByText("Successfully Deleted"));

		log.info("Step 02: Verify data is undisplayed at table");
		verifyTrue(persionalDetailPage.isDataAttachmentUnDisplayedByName(uploadFileNameEdit, commentNotesEdit, fileSizeEdit ));
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		//quitBrowserDriver();
	}

	LoginPageObject loginPage;
	EmployeeListPageObject employeeListPage;
	PersionalDetailPageObject persionalDetailPage;
	DashBoardPageObject dashBoardPage;
	PIMPageObject  pimPage;
}
