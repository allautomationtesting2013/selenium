package authentic.happiness;
/**
 * This class implements the testLogin method that uses InternetExplorer browser
 */
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import util.IExplorerSettings;
import util.LoginPage;

public class LoginIExplorer extends IExplorerSettings {

	private static final String MOJAN_URL = "https://account.mojang.com/login";
	private static final String email = "email@login.com";
	private static final CharSequence password = "pass1234";
	
	/**
	 * This is a test method that verifies the login option for an existing account on mojang.com, using the InternetExplorer browser 
	 */
	@Test
	public void testLogin()  {
		driver.get(MOJAN_URL);
		new PageFactory();
		final LoginPage loginPage = PageFactory.initElements(
				driver, LoginPage.class);
		loginPage.emailInput2.sendKeys(email);
		loginPage.password2.sendKeys(password);
		loginPage.rememberButton.click();
		loginPage.loginButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}
