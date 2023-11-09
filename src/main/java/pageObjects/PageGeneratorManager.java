package pageObjects;

import commons.DashBoardPageObject;
import org.openqa.selenium.WebDriver;
import pageObjects.Admin.UserManagementListPageObject;
import pageObjects.MainMenu.*;
import pageObjects.PIM.AddEmployeePageObject;
import pageObjects.PIM.EmployeeListPageObject;
import pageObjects.PIM.PersionalDetailPageObject;
import pageObjects.common.LoginPageObject;

public class PageGeneratorManager {
    public static AdminPageObject getAdminPage(WebDriver driver){
        return new AdminPageObject(driver);
    }
    public static BuzzPageObject getBuzzPage(WebDriver driver){
        return new BuzzPageObject(driver);
    }
    public static ClaimPageObject getClaimPage(WebDriver driver){
        return new ClaimPageObject(driver);
    }
    public static DashBoardPageObject getDashBoardPage(WebDriver driver){
        return new DashBoardPageObject(driver);
    }
    public static DirectoryPageObject getDirectoryPage(WebDriver driver){
        return new DirectoryPageObject(driver);
    }
    public static LeavePageObject getLeavePage(WebDriver driver){
        return new LeavePageObject(driver);
    }
    public static MaintenancePageObject getMaintenancePage(WebDriver driver){
        return new MaintenancePageObject(driver);
    }
    public static MyInforPageObject getMyInforPage(WebDriver driver){
        return new MyInforPageObject(driver);
    }
    public static PerformancePageObject getPerformancePage(WebDriver driver){
        return new PerformancePageObject(driver);
    }
    public static PIMPageObject getPIMPage(WebDriver driver){
        return new PIMPageObject(driver);
    }
    public static RecruitmentPageObject getRecruitmentPage(WebDriver driver){
        return new RecruitmentPageObject(driver);
    }
    public static TimePageObject getTimePage(WebDriver driver){
        return new TimePageObject(driver);
    }
    public static LoginPageObject getLoginPage(WebDriver driver){
        return new LoginPageObject(driver);
    }
    public static EmployeeListPageObject getEmployeeListPage(WebDriver driver){
        return new EmployeeListPageObject(driver);
    }
    public static AddEmployeePageObject getAddEmployeePage(WebDriver driver){
        return new AddEmployeePageObject(driver);
    }
    public static PersionalDetailPageObject getPersionalDetailPage(WebDriver driver){
        return new PersionalDetailPageObject(driver);
    }
    public static UserManagementListPageObject getUserManagementPage(WebDriver driver){
        return new UserManagementListPageObject(driver);
    }

}
