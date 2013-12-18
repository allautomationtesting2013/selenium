package util;

/**
 * This class identifies the elements from the Login page of the mojang.com site
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "username")
	public WebElement emailInput2;
	
	@FindBy(id = "password")
	public WebElement password2;
	
	@FindBy(id = "remember")
	public WebElement rememberButton;
	
	@FindBy (xpath = "/html/body/div/div/div/form/p[5]/button")
	public WebElement loginButton;
	
}
