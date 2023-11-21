package pageUI.Admin;

public class EditUserPageUI {
    public static final String USER_ROLE_DROPDOWN_PARENT = "XPATH=//label[text()='User Role']/parent::div/following-sibling::div";
    public static final String USER_ROLE_DROPDOWN_CHILD = "XPATH=//label[text()='User Role']/parent::div/following-sibling::div//div[@role='option']/span";
    public static final String STATUS_DROPDOWN_PARENT = "XPATH=//label[text()='Status']/parent::div/following-sibling::div";
    public static final String STATUS_DROPDOWN_CHILD = "XPATH=//label[text()='Status']/parent::div/following-sibling::div//div[@role='option']/span";
    public static final String EMPLOYEE_NAME_SEARCH_TEXTBOX = "XPATH=//input[@placeholder='Type for hints...']";
    public static final String EMPLOYEE_NAME_DROPDOWN = "XPATH=//input[@placeholder='Type for hints...']/parent::div/following-sibling::div/div/span";
    public static final String DYNAMIC_TEXTBOX_BY_NAME = "XPATH=//label[text()='%s']/parent::div/following-sibling::div/input";
    public static final String SAVE_BUTTON = "xpath=//button[text()=' Save ']";
    public static final String TOAST_MESSAGE = "XPATH=//p[text()='Successfully Updated']";
    public static final String CHANGE_PASSWORD_CHECKBOX = "xpath=//input[@type='checkbox']";
}
