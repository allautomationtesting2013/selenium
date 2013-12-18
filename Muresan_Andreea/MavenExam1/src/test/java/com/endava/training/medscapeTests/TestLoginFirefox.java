package com.endava.training.medscapeTests;

import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.endava.training.util.FirefoxSettings;
import com.endava.training.util.SettingsMedscape;

/**
 * This class extends the FirefoxSettings class and contains one Test method.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class TestLoginFirefox extends FirefoxSettings {

	ResourceBundle bundle5 = ResourceBundle.getBundle("values");

	String USERNAME = bundle5.getString("username");
	String PASSWORD = bundle5.getString("password");
	String MED_LOGIN = bundle5.getString("medUrlLogin");

	/**
	 * This Test method verifies the successful login into medscape.com website
	 * on Mozilla Firefox browser.
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testLoginFirefox() throws InterruptedException {

		driver.get(MED_LOGIN);
		new PageFactory();
		final SettingsMedscape loginPage = PageFactory.initElements(driver,
				SettingsMedscape.class);

		loginPage.userLoginInput.clear();
		loginPage.userLoginInput.sendKeys(USERNAME);
		loginPage.passwordLoginInput.sendKeys(PASSWORD);
		Thread.sleep(2000);
		loginPage.loginButton.click();
		Thread.sleep(1000);

		Assert.assertEquals(
				"Latest Medical News, Clinical Trials, Guidelines – Today on Medscape",
				driver.getTitle());

	}
}
