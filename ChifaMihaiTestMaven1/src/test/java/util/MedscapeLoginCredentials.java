package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedscapeLoginCredentials {

	@FindBy(id="userId")
	public WebElement userid;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="loginbtn")
	public WebElement buttonL;
}
