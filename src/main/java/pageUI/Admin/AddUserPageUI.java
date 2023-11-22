package pageUI.Admin;

public class AddUserPageUI {
    public static final String USER_ROLE_DROPDOWN_PARENT = "XPATH=//label[text()='User Role']/parent::div/following-sibling::div";
    public static final String USER_ROLE_DROPDOWN_CHILD = "XPATH=//label[text()='User Role']/parent::div/following-sibling::div//div[@role='option']/span";
    public static final String STATUS_DROPDOWN_PARENT = "XPATH=//label[text()='Status']/parent::div/following-sibling::div";
    public static final String STATUS_DROPDOWN_CHILD = "XPATH=//label[text()='Status']/parent::div/following-sibling::div//div[@role='option']/span";
    public static final String EMPLOYEE_NAME_SEARCH_TEXTBOX = "XPATH=//input[@placeholder='Type for hints...']";
    public static final String EMPLOYEE_NAME_DROPDOWN = "XPATH=//div[@role='option']/span";
    public static final String DYNAMIC_TEXTBOX_BY_NAME = "XPATH=//label[text()='%s']/parent::div/following-sibling::div/input";
    public static final String SAVE_BUTTON = "xpath=//button[text()=' Save ']";
    public static final String TOAST_MESSAGE = "XPATH=//p[text()='Successfully Saved']";
    public static final String EMPLOYEE_SEARCHING_ICON = "xpath=//div[text()='Searching....']";
    public static final String EMPLOYEE_FIRST_OPTION = "xpath=";
}
