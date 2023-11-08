package pageUI.PIMMenu;

public class PersionalDetailPageUI {
    public static final String TITLE_PAGE = "xpath=//h6[text()='Personal Details']";
    public static final String FIRST_NAME_TEXTBOX = "xpath=//div[@class='orangehrm-edit-employee']//input[@placeholder='First Name']";
    public static final String MIDDLE_NAME ="xpath=//input[@name='middleName']";
    public static final String LAST_NAME ="xpath=//input[@name='lastName']";
    public static final String EMPLOYEE_TEXTBOX = "xpath=//label[text()='Employee Id']/parent::div/following-sibling::div/input";
    public static final String SPINNER_ICON = "css=div.oxd-form-loader>div.oxd-loading-spinner-container";
    public static final String ENTER_TO_TEXTBOX_BY_NAME ="xpath=//label[contains(text(),'%s')]/parent::div/following-sibling::div//input";
    public static final String PARENT_DROPDOWN_BY_NAME = "XPATH=//label[text()='%s']/parent::div/following-sibling::div//div[@class='oxd-select-text-input']";
    public static final String CHILD_DROPDOWN_BY_NAME = "XPATH=//label[text()='%s']/parent::div/following-sibling::div//div[@role='listbox']";
    public static final String GENDER_RADIO_BUTTON = "XPATH=//label[text()='Gender']/parent::div/following-sibling::div//label[text()='%s']";
    public static final String SAVE_BUTTON_BY_TITLE = "XPATH=//h6[text()='%s']//parent::div/form//button[@type='submit']";
    public static final String TOAST_MESSAGE_BY_TEXT = "XPATH=//p[contains(@class,'oxd-text--toast-message') and text()='%s']";
    public static final String ADD_ATTACHMENT = "XPATH=//h6[text()='Attachments']/following-sibling::button";
    public static final String AFTER_UPLOAD_FILE = "XPATH=//label[text()='Select File']/parent::div/following-sibling::div//div[text()='%s']";
    public static final String COMMENT_TEXTAREA = "XPATH=//label[text()='Comment']/parent::div/following-sibling::div/textarea";
    public static final String EDIT_ICON = "CSS=i.bi-pencil-fill";

    public static final String DELETE_ICON_BY_FILE_NAME = "XPATH=//div[text()='%s']/parent::div/following-sibling::div//i[@class='oxd-icon bi-trash']";
    public static final String YES_DELETE_BUTTON = "css=button.oxd-button--label-danger";



}
