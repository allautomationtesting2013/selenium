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
public class TestNotSuccessfullyLogin extends FirefoxSettings {

	ResourceBundle bundle7 = ResourceBundle.getBundle("values");
	String MED_LOGIN = bundle7.getString("medUrlLogin");
	String USERNAME = bundle7.getString("username");
	String WRONG_PASSWORD = bundle7.getString("wrongPassword");

	/**
	 * This Test method verifies if the error message is displayed when entering
	 * a wrong password into login form on medscape.com website on Mozilla
	 * Firefox browser.
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testNotSuccessfullyLogin() throws InterruptedException {

		driver.get(MED_LOGIN);
		new PageFactory();
		final SettingsMedscape loginPage = PageFactory.initElements(driver,
				SettingsMedscape.class);

		loginPage.userLoginInput.sendKeys(USERNAME);
		loginPage.passwordLoginInput.sendKeys(WRONG_PASSWORD);
		loginPage.loginButton.click();
		Thread.sleep(2000);
		Assert.assertEquals("That username/password combination is not valid.",
				loginPage.incorrectCredentialsMessage.getText());
	}

}
