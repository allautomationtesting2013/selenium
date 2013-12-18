package util;

/**
 * This class identifies the elements from the Login page and The main page of the mojang.com site
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElements {

	@FindBy(id = "ap_email")
	public WebElement emailInput;
	
	@FindBy(id = "ap_signin_existing_radio")
	public WebElement checkYes;
	
	@FindBy(id = "ap_password")
	public WebElement passwordInput;
	
	@FindBy(id = "signInSubmit-input")
	public WebElement submitButton;
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement toSearch;
	
	@FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div[4]/div/div/div/h3/a/span")
	public WebElement dealLink;
	
	@FindBy(id = "add-to-cart-button")
	public WebElement addButton;
	
	@FindBy(id = "confirm-text")
	public WebElement confirmationMessage;
	
	@FindBy(id = "nav-signin-text")
	public WebElement signIn;
	
	
}
