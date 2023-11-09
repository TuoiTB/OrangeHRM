package pageUI.Admin;

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
}
