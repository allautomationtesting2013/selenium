package com.endava.training.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class contains the web elements from Login and Registration page on
 * medscape.com website.
 * 
 * @author AnMuresan
 * 
 */
public class SettingsMedscape {

	@FindBy(id = "regfnamefield")
	public WebElement firstNameInput;

	@FindBy(id = "reglnamefield")
	public WebElement lastNameInput;
	
	@FindBy(id = "regzippractice")
	public WebElement zipCode;
	
	@FindBy(id = "regemailaddress")
	public WebElement emailAddress;
	
	@FindBy(id = "regemailaddressconfirm")
	public WebElement emailAddressConfirm;
	
	@FindBy(id = "regusername")
	public WebElement username;
	
	@FindBy(id = "regpassword")
	public WebElement password;
	
	@FindBy(id = "regpasswordconfirm")
	public WebElement passwordConfirm;

	
	@FindBy(id = "reghintanswer")
	public WebElement securityAnswer;
	
	@FindBy(id = "submitreg")
	public WebElement submitButton;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div")
	public WebElement welcomeMessage;
	
	@FindBy(id = "userId")
	public WebElement userLoginInput;
	
	@FindBy(id = "password")
	public WebElement passwordLoginInput;
	
	@FindBy(id = "loginbtn")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id='null.errors']")
	public WebElement incorrectCredentialsMessage;
	
	
}
