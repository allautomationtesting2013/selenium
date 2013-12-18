package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author larisa
 *this class identifies the elements from the register Form page by id or xpath
 */

public class PageReg {

	@FindBy(id = "registerControl_txtFirstName")
	public WebElement firstNameInput;

	@FindBy(id = "registerControl_txtLastName")
	public WebElement lastNameInput;

	@FindBy(id = "registerControl_txtUserName")
	public WebElement emailInput;

	@FindBy(id = "registerControl_txtPassword1")
	public WebElement password;

	@FindBy(id = "registerControl_txtPassword2")
	public WebElement confirmPassword;
	
	@FindBy(id = "registerControl_txtSecurityAnswer")
	public WebElement answerInput;
	
	@FindBy(id = "registerControl_txtPostalCode")
	public WebElement postalInput;
	
	@FindBy(id = "registerControl_txtSecurityAnswer")
	public WebElement answerjjjInput;
	
	
	
	@FindBy(id = "registerControl_btnRegister")
	public WebElement submitButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/p")
	public WebElement confirmationMessageText;
		
	
}
