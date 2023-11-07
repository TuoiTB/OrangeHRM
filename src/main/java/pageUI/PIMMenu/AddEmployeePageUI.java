package pageUI.PIMMenu;

public class AddEmployeePageUI {
    public static final String FIRST_NAME_TEXTBOX = "css=input.orangehrm-firstname";
    public static final String MIDDLE_NAME_TEXTBOX = "css=input.orangehrm-middlename";
    public static final String LAST_NAME_TEXTBOX = "css=input.orangehrm-lastname";
    public static final String EMPLOYEE_TEXTBOX = "xpath=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
    public static final String CREATE_LOGIN_DETAIL_TOGGLE = "xpath=//p[text()='Create Login Details']/parent::div//following-sibling::div//span";
    public static final String USER_NAME_TEXTBOX = "xpath=//label[text()='Username']/parent::div/following-sibling::div/input";
    public static final String PASSWORD_TEXTBOX = "XPATH=//label[text()='Password']/parent::div/following-sibling::div/input";
    public static final String CONFIRM_PASSWORD_TEXTBOX = "XPATH=//label[text()='Confirm Password']/parent::div/following-sibling::div/input";
    public static final String STATUS_RADIOBUTTON_BY_TEXT ="xpath=//label[text()='Status']/parent::div/following-sibling::div//label[text()='%s']";
    public static final String SAVE_BUTTON = "css=button.orangehrm-left-space";
  //  public static final String FILE_UPLOADED_BY_NAME = "xpath=//a[text()='%s']";
    public static final String UPLOAD_AVATAR = "CSS=img.employee-image";
    public static final String TOAST_MESSAGE_SUCCESS = "css=p.oxd-text--toast-message";
}
