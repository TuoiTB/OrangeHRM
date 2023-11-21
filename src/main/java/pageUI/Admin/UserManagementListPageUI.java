package pageUI.Admin;

import org.openqa.selenium.WebElement;

public class UserManagementListPageUI {
    public static final String USER_NAME_SEARCH_TEXTBOX = "XPATH=//label[text()='Username']/parent::div/following-sibling::div/input";
    public static final String USER_ROLE_SEARCH_DROPDOWN = "XPATH=//label[text()='User Role']/parent::div/following-sibling::div/div";
    public static final String USER_ROLE_SEARCH_DROPDOWN_OPTIONS = "XPATH=//div[contains(text(),'Select')]/parent::div/following-sibling::div//span";
    public static final String EMPLOYEE_NAME_SEARCH_TEXTBOX = "XPATH=//label[text()='Employee Name']/parent::div/following-sibling::div/div//input";
    public static final String STATUS_SEARCH_DROPDOWN = "XPATH=//label[text()='Status']/parent::div/following-sibling::div/div";
    public static final String STATUS_SEARCH_DROPDOWN_OPTIONS = "XPATH=//div[contains(text(),'Select')]/parent::div/following-sibling::div//span";
    public static final String ADD_BUTTON = "CSS=div.orangehrm-header-container>button";
    public static final String EDIT_ICON_BY_USERNAME = "XPATH=//div[text()='%s']/parent::div/following-sibling::div//i[@class='oxd-icon bi-pencil-fill']";
    public static final String DELETE_ICON_BY_USERNAME = "XPATH=//div[text()='%s']/parent::div/following-sibling::div//i[@class='oxd-icon bi-trash']";
    public static final String YES_DELETE_ICON = "css=button.orangehrm-button-margin i";
    public static final String SEARCH_BUTTON ="xpath=//button[@type='submit']" ;
    public static final String ADMIN_DYNAMIC_LOCATOR_BY_COLUMN_NAME = "xpath=//div[text()='%s']/parent::div/following-sibling::div/div[text()='%s']/parent::div/following-sibling::div/div[text()='%s']/parent::div/following-sibling::div/div[text()='%s']" ;
    public static final String NO_RECORD_FOUND_MESSAGE = "xpath=//span[text()='No Records Found']";
    public static final String NO_RECORD_FOUND_TOAST_MESSAGE =  "xpath=//p[text()='No Records Found']";
}
