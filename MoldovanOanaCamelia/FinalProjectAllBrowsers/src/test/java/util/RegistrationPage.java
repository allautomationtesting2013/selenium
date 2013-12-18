package util;

/**
 * This class identifies the elements from the Register page of the mojang.com site
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

	@FindBy(id = "registration_email")
	public WebElement emailInput;
	
	@FindBy(id = "registration_password")
	public WebElement password;
	
	@FindBy(id = "registration_passwordAgain")
	public WebElement confirmPassword;
	
	@FindBy(id = "registration_firstname")
	public WebElement firstName;
	
	@FindBy(id = "registration_lastname")
	public WebElement lastName;
	
	@FindBy(name = "registration.day")
	public WebElement day;
	
	@FindBy(name = "registration.month")
	public WebElement month;
	
	@FindBy(name = "registration.year")
	public WebElement year;
	
	@FindBy(id = "registration.question0")
	public WebElement question0;
	
	@FindBy(id = "registration.answer0")
	public WebElement answer0;
	
	@FindBy(id = "registration.question1")
	public WebElement question1;
	
	@FindBy(id = "registration.answer1")
	public WebElement answer1;
	
	@FindBy(id = "registration.question2")
	public WebElement question2;
	
	@FindBy(id = "registration.answer2")
	public WebElement answer2;
	
	@FindBy(id = "registration.acceptsTerms")
	public WebElement accept;
	
	@FindBy(xpath = "/html/body/div/div/div/section/form/button")
	public WebElement register;
	
	@FindBy(xpath = "/html/body/div/div/h1")
	public WebElement textMessage;
	
	
}
