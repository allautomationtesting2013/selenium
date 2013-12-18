package testChrome;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import util.ChromeBrowserSettings;
import util.LoginPage;

/**
 * This class implements the testLogin method that uses Chrome Browser
 * 
 * @author fionce
 * 
 */
public class TestLoginChrome extends ChromeBrowserSettings {

	private static final String LOGIN_URL = "https://account.mojang.com/login";
	private static final CharSequence EMAIL = "florina_melinda@yahoo.com";
	private static final CharSequence PASS = "278257florina";

	/**
	 * This is a test method that verifies the login option for an existing
	 * account on Mojang.com, using Chrome Browser
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
		loginPage.submitLogin.click();

	}
}
