package util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MedscapeRegistrationCredentials extends BrowserSetup{
	

	
	@FindBy(id="regfnamefield")
	public WebElement firstName;
	
	@FindBy(id="reglnamefield")
	public WebElement lastName;
	
	@FindBy(id="regzippractice")
	public WebElement zipCode;
	
	@FindBy(id="regemailaddress")
	public WebElement email;
	
	@FindBy(id="regemailaddressconfirm")
	public WebElement emailConfirm;
	
	@FindBy(id="regusername")
	public WebElement username;
	
	@FindBy(id="regpassword")
	public WebElement password;
	
	@FindBy(id="regpasswordconfirm")
	public WebElement passwordConfirm;
	
	
	@FindBy(id="reghintanswer")
	public WebElement hintanswer;
	
	@FindBy(id="submitreg")
	public WebElement submitr;
	
	
}
