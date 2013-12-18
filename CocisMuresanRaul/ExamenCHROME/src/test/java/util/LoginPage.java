package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * LoginPage localize the elements from page
 * @author rcocismuresan
 * @version 1.0
 */
public class LoginPage {

	@FindBy(id = "Header1_LoginControl_txtUser")
	public WebElement userName;

	@FindBy(id = "Header1_LoginControl_txtPassword")
	public WebElement pass;

	@FindBy(id = "Header1_LoginControl_btLogin")
	public WebElement submit;

}
