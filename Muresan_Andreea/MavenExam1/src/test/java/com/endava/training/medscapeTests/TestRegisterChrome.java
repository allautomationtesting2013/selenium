package com.endava.training.medscapeTests;

import java.util.List;
import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.endava.training.util.ChromeSettings;
import com.endava.training.util.RandomEmail;
import com.endava.training.util.RandomUsername;
import com.endava.training.util.SettingsMedscape;

/**
 * This class extends the ChromeSettings class and contains one Test method.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class TestRegisterChrome extends ChromeSettings {

	ResourceBundle bundle2 = ResourceBundle.getBundle("values");

	String FIRST_NAME = bundle2.getString("firstName");
	String LAST_NAME = bundle2.getString("lastName");
	String ZIP_CODE = bundle2.getString("zipCode");
	String PASSWORD = bundle2.getString("password");
	String PET_NAME = bundle2.getString("petName");
	String MED_URL = bundle2.getString("medUrlRegister");

	/**
	 * This Test method verifies the successful registration of a new user on
	 * medscape.com website using Chrome browser.
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testRegisterChrome() throws InterruptedException {

		driver.get(MED_URL);

		RandomEmail randomEmail = new RandomEmail();
		String email = randomEmail.generateRandomEmail();
		RandomUsername randomUsername = new RandomUsername();

		new PageFactory();
		final SettingsMedscape registrationPage = PageFactory.initElements(
				driver, SettingsMedscape.class);

		WebElement form = driver.findElement(By.id("country"));
		List<WebElement> options = form.findElements(By.tagName("option"));

		for (WebElement webElement : options) {
			if (webElement.getText().equals("United States")) {
				webElement.click();
				Thread.sleep(3000);
				break;
			}
		}

		Thread.sleep(3000);
		registrationPage.firstNameInput.sendKeys(FIRST_NAME);
		registrationPage.lastNameInput.sendKeys(LAST_NAME);
		registrationPage.zipCode.sendKeys(ZIP_CODE);
		registrationPage.emailAddress.sendKeys(email);
		registrationPage.emailAddressConfirm.sendKeys(email);
		registrationPage.username.sendKeys(randomUsername
				.generateRandomUsername());
		Thread.sleep(3000);
		registrationPage.password.sendKeys(PASSWORD);
		registrationPage.passwordConfirm.sendKeys(PASSWORD);

		WebElement form1 = driver.findElement(By.id("hintQuestion"));
		List<WebElement> options1 = form1.findElements(By.tagName("option"));

		for (WebElement webElement1 : options1) {
			if (webElement1.getText().equals(
					"What is the name of your first pet?")) {
				webElement1.click();
				Thread.sleep(3000);
				break;
			}
		}

		Thread.sleep(3000);

		registrationPage.securityAnswer.sendKeys(PET_NAME);

		WebElement form2 = driver.findElement(By.id("profession"));
		List<WebElement> options3 = form2.findElements(By.tagName("option"));

		for (WebElement webElement2 : options3) {
			if (webElement2.getText().equals("Consumer/Other")) {
				webElement2.click();
				Thread.sleep(3000);
				break;
			}
		}

		registrationPage.submitButton.click();
		Thread.sleep(3000);
		Assert.assertEquals("Thank you for joining Medscape.",
				registrationPage.welcomeMessage.getText());
	}
}
