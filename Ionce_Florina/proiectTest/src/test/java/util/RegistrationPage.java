package util;
/** 
 * This class RegistrationPage localizes the elements from the page
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

	@FindBy(id="registration_email")
	public WebElement emailInput;
	
	@FindBy(id="registration_password")
	public WebElement password;
	
	@FindBy(id="registration_passwordAgain")
	public WebElement confirmPassword;
	
	@FindBy(id="registration_firstname")
	public WebElement firstNameInput;
	
	@FindBy(id="registration_lastname")
	public WebElement secondNameInput;
	
	@FindBy(name="registration.day")
	public WebElement daybirth;
	
	@FindBy(name="registration.month")
	public WebElement monthbirth;
	
	@FindBy(name="registration.year")
	public WebElement yearbirth;
	
	@FindBy(id="registration.question0")
	public WebElement selectQuestion1;
	
	@FindBy(id="registration.answer0")
	public WebElement answerQuestion1;
	
	@FindBy(id="registration.question1")
	public WebElement selectQuestion2;
	
	@FindBy(id="registration.answer1")
	public WebElement answerQuestion2;
	
	@FindBy(id="registration.question2")
	public WebElement selectQuestion3;
	
	@FindBy(id="registration.answer2")
	public WebElement answerQuestion3;
	
	@FindBy(id="registration.acceptsTerms")
	public WebElement acceptButton;
	
	@FindBy(xpath="/html/body/div/div/div/section/form/button")
	public WebElement submitButton;
	
	
}
