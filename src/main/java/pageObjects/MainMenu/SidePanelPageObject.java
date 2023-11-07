package pageObjects.MainMenu;

import commons.BasePage;
import commons.DashBoardPageObject;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGeneratorManager;
import pageUI.MainMenu.SidePanelPageUI;

public class SidePanelPageObject extends BasePage {
    WebDriver driver;

    public SidePanelPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public AdminPageObject openAdminPage() {
        waitForElementClickable(driver, SidePanelPageUI.ADMIN_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.ADMIN_PAGE_LINK);
        return PageGeneratorManager.getAdminPage(driver);
    }
    public BuzzPageObject openBuzzPage() {
        waitForElementClickable(driver, SidePanelPageUI.BUZZ_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.BUZZ_PAGE_LINK);
        return PageGeneratorManager.getBuzzPage(driver);
    }
    public ClaimPageObject openClaimPage() {
        waitForElementClickable(driver, SidePanelPageUI.CLAIM_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.CLAIM_PAGE_LINK);
        return PageGeneratorManager.getClaimPage(driver);
    }
    public DashBoardPageObject openDashBoardPage() {
        waitForElementClickable(driver, SidePanelPageUI.DASHBOARD_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.DASHBOARD_PAGE_LINK);
        return PageGeneratorManager.getDashBoardPage(driver);
    }
    public DirectoryPageObject openDirectoryPage() {
        waitForElementClickable(driver, SidePanelPageUI.DIRECTORY_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.DIRECTORY_PAGE_LINK);
        return PageGeneratorManager.getDirectoryPage(driver);
    }
    public LeavePageObject openLeavePage() {
        waitForElementClickable(driver, SidePanelPageUI.LEAVE_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.LEAVE_PAGE_LINK);
        return PageGeneratorManager.getLeavePage(driver);
    }
    public MaintenancePageObject openMaintenancePage() {
        waitForElementClickable(driver, SidePanelPageUI.MAINTENANCE_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.MAINTENANCE_PAGE_LINK);
        return PageGeneratorManager.getMaintenancePage(driver);
    }
    public MyInforPageObject openMyInforPage() {
        waitForElementClickable(driver, SidePanelPageUI.MY_INFOR_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.MY_INFOR_PAGE_LINK);
        return PageGeneratorManager.getMyInforPage(driver);
    }
    public PerformancePageObject openPerformancePage() {
        waitForElementClickable(driver, SidePanelPageUI.PERFORMANCE_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.PERFORMANCE_PAGE_LINK);
        return PageGeneratorManager.getPerformancePage(driver);
    }
    public PIMPageObject openPIMPage() {
        waitForElementClickable(driver, SidePanelPageUI.PIM_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.PIM_PAGE_LINK);
        return PageGeneratorManager.getPIMPage(driver);
    }
    public RecruitmentPageObject openRecruitmentPage() {
        waitForElementClickable(driver, SidePanelPageUI.RECRUITMENT_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.RECRUITMENT_PAGE_LINK);
        return PageGeneratorManager.getRecruitmentPage(driver);
    }
    public TimePageObject openTimePage() {
        waitForElementClickable(driver, SidePanelPageUI.TIME_PAGE_LINK);
        clickToElement(driver, SidePanelPageUI.TIME_PAGE_LINK);
        return PageGeneratorManager.getTimePage(driver);
    }
}
