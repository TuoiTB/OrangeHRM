package pageUI.PIMMenu;

public class PersionalDetailPageUI {
    public static final String TITLE_PAGE = "xpath=//h6[text()='Personal Details']";
    public static final String FIRST_NAME_TEXTBOX = "xpath=//div[@class='orangehrm-edit-employee']//input[@placeholder='First Name']";
    public static final String MIDDLE_NAME ="xpath=//input[@name='middleName']";
    public static final String LAST_NAME ="xpath=//input[@name='lastName']";
    public static final String EMPLOYEE_TEXTBOX = "xpath=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
    public static final String SPINNER_ICON = "css=div.oxd-form-loader>div.oxd-loading-spinner-container";

    public static final String ENTER_TO_TEXTBOX_BY_NAME ="xpath=//label[contains(text(),'%s')]/parent::div/following-sibling::div/input";

    public static final String SAVE_BUTTON_BY_TITLE = "XPATH=//h6[text()='%s']//parent::div/form//button[@type='submit']";
    public static final String EDIT_ICON = "CSS=i.bi-pencil-fill";

    public static final String DELETE_ICON_BY_FILE_NAME = "XPATH=//div[text()='%s']/parent::div/following-sibling::div//i[@class='oxd-icon bi-trash']";
    public static final String YES_DELETE_BUTTON = "css=button.oxd-button--label-danger";



}
