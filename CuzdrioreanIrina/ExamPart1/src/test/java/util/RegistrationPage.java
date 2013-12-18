package util;
/**
 * @author Nina
 * in this class are created the Web Elements for each field from Registration form
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
	
	@FindBy(id = "registerControl_txtFirstName")
	public WebElement firstNameInput;

	@FindBy(id = "registerControl_txtLastName")
	public WebElement lastNameInput;
	
	@FindBy(id = "registerControl_txtUserName")
	public WebElement emailInput;

	@FindBy(id = "registerControl_chkSolicit")
	public WebElement policy;

	@FindBy(id = "registerControl_txtPassword1")
	public WebElement password;
	
	@FindBy(id = "registerControl_txtPassword2")
	public WebElement confirmPassword;
	
	@FindBy(id = "registerControl_selSecurityQuestions")
	public WebElement securityQuestions;
	
	@FindBy(id = "registerControl_txtSecurityAnswer")
	public WebElement securityAnswer;
	
	@FindBy(id = "registerControl_selDOB_Day")
	public WebElement selectDay;
	
	@FindBy(id = "registerControl_selDOB_Month")
	public WebElement selectMonth;
	
	@FindBy(id = "registerControl_selDOB_Year")
	public WebElement selectYear;
	
	@FindBy(id = "registerControl_optGender_Female")
	public WebElement selectGenderF;
	
	@FindBy(id = "registerControl_optGender_Male")
	public WebElement selectGenderM;
	
	@FindBy(id = "registerControl_selOccupation")
	public WebElement occupation;
	
	@FindBy(id = "registerControl_selEducation")
	public WebElement educationLevel;
	
	@FindBy(id = "registerControl_txtPostalCode")
	public WebElement postalCode;
	
	@FindBy(id = "registerControl_selCountry")
	public WebElement country;
	
	@FindBy(id = "registerControl_ckbxTerms")
	public WebElement terms;
	
	@FindBy(id = "registerControl_btnRegister")
	public WebElement registerButton;
	
	@FindBy(id = "Header1_LoginControl_lblGreeting")
	public static WebElement confirmationMessageText;
	

}
