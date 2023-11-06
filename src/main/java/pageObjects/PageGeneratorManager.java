package pageObjects;

import org.openqa.selenium.WebDriver;

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
}
