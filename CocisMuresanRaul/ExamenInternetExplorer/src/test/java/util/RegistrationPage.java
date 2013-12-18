package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * RegistrationPage localize the elements froms page
 * 
 * @author rcocismuresan
 * 
 */
public class RegistrationPage {

	@FindBy(id = "registerControl_txtFirstName")
	public WebElement firstName;

	@FindBy(id = "registerControl_txtLastName")
	public WebElement lastName;

	@FindBy(id = "registerControl_txtUserName")
	public WebElement emailInput;

	@FindBy(id = "registerControl_txtPassword1")
	public WebElement password;

	@FindBy(id = "registerControl_txtPassword2")
	public WebElement repassword;

	@FindBy(id = "registerControl_selSecurityQuestions")
	public WebElement secQuestion;

	@FindBy(id = "registerControl_txtSecurityAnswers")
	public WebElement secAnswer;

	@FindBy(id = "registerControl_selDOB_Day")
	public WebElement day;

	@FindBy(id = "registerControl_selDOB_Month")
	public WebElement month;

	@FindBy(id = "registerControl_selDOB_Year")
	public WebElement luna;

	@FindBy(id = "registerControl_optGender_Male")
	public WebElement chkboxMale;

	@FindBy(id = "registerControl_selOccupation")
	public WebElement lstOccupation;

	@FindBy(id = "registerControl_txtPostalCode")
	public WebElement zipCode;

	@FindBy(id = "registerControl_ckbxTerms")
	public WebElement termsChkbox;

	@FindBy(id = "registerControl_btnRegister")
	public WebElement submitButton;

	@FindBy(id = "Header1_LoginControl_btLogout")
	public WebElement logOut;

}
