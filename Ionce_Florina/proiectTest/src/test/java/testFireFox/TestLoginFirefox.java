package testFireFox;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSettings;
import util.LoginPage;

/**
 * This class implements the testLogin method that uses Firefox Browser
 * 
 * @author fionce
 * 
 */

public class TestLoginFirefox extends BrowserSettings {

	private static final String LOGIN_URL = "https://account.mojang.com/login";
	private static final CharSequence EMAIL = "florina_melinda@yahoo.com";
	private static final CharSequence PASS = "278257florina";

	/**
	 * This is a test method that verifies the login option for an existing
	 * account on Mojang.com, using Firefox Browser
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testLogin() {
		driver.get(LOGIN_URL);

		new PageFactory();
		final LoginPage loginPage = PageFactory.initElements(driver,
				LoginPage.class);
		loginPage.emailLogin.sendKeys(EMAIL);
		loginPage.passLogin.sendKeys(PASS);
		loginPage.submitLogin.click();
		driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div/header/div/ul/li[2]/ul/li[3]/a"))
				.click();

	}
}
