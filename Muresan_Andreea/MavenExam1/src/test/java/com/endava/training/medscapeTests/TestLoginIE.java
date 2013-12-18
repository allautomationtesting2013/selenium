package com.endava.training.medscapeTests;

import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.endava.training.util.IExplorerSettings;
import com.endava.training.util.SettingsMedscape;

/**
 * This class extends the IESettings class and contains one Test method.
 * 
 * @author AnMuresan
 * @version
 */
public class TestLoginIE extends IExplorerSettings {

	ResourceBundle bundle6 = ResourceBundle.getBundle("values");

	String USERNAME = bundle6.getString("username");
	String PASSWORD = bundle6.getString("password");
	String MED_LOGIN = bundle6.getString("medUrlLogin");

	/**
	 * This Test method verifies the successful login into medscape.com website
	 * on Internet Explorer browser.
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testLoginFirefox() throws InterruptedException {

		driver.get(MED_LOGIN);
		new PageFactory();
		final SettingsMedscape loginPage = PageFactory.initElements(driver,
				SettingsMedscape.class);

		loginPage.userLoginInput.sendKeys(USERNAME);
		loginPage.passwordLoginInput.sendKeys(PASSWORD);
		Thread.sleep(3000);
		loginPage.loginButton.click();
		Thread.sleep(3000);

		Assert.assertEquals(
				"Latest Medical News, Clinical Trials, Guidelines – Today on Medscape",
				driver.getTitle());

	}

}
