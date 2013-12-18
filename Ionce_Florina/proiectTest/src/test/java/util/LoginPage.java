package util;

/** 
 * This class LoginPage localizes the elements from the page
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="username")
	public WebElement emailLogin;
	
	@FindBy(id="password")
	public WebElement passLogin;
	
	@FindBy(xpath="/html/body/div/div/div/form/p[5]/button")
	public WebElement submitLogin;	
	
	@FindBy(xpath="/html/body/div/header/div/ul/li[2]/ul/li[3]/a")
	public WebElement logOut1;	
	
	@FindBy(xpath = "/html/body/div/div/div/div/h2")
	public static WebElement confirmationMessageText;
}
