package testIE;

import java.util.ResourceBundle;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import util.IEBrowserSettings;
import util.LoginPage;

/**
 * This class implements the testLogin method that uses Firefox Browser
 * 
 * @author fionce
 * 
 */

public class TestLoginIE extends IEBrowserSettings {

	private static final String LOGIN_URL = "https://account.mojang.com/login";
	ResourceBundle bundle1 = ResourceBundle.getBundle("credentials");
	private static final CharSequence EMAIL = "florina_melinda@yahoo.com";
	private static final CharSequence PASS = "278257florina";

	/**
	 * This is a test method that verifies the login option for an existing
	 * account on Mojang.com, using Firefox Browser
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testLogin() throws InterruptedException {

		driver.get(LOGIN_URL);

		new PageFactory();
		final LoginPage loginPage = PageFactory.initElements(driver,
				LoginPage.class);
		loginPage.emailLogin.sendKeys(EMAIL);
		loginPage.passLogin.sendKeys(PASS);
		Thread.sleep(2000);
		loginPage.passLogin.submit();
	}
}
