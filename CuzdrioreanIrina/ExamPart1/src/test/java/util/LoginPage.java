package util;
/**
 * @author Nina
 * in this class are created the Web Elements for each field from Log in form
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "Header1_LoginControl_txtUser")
	public WebElement email;

	@FindBy(id = "Header1_LoginControl_txtPassword")
	public WebElement password;
	
	@FindBy(id = "Header1_LoginControl_btLogin")
	public WebElement loginButton;

}
