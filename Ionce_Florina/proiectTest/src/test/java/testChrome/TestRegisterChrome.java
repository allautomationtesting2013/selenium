package testChrome;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.ChromeBrowserSettings;
import util.RandomEmail;
import util.RegistrationPage;

/**
 * This class implements the test21Register method that uses Chrome Browser
 * 
 * @author fionce
 * @version 1.0
 */

public class TestRegisterChrome extends ChromeBrowserSettings {

	private static final String BBY_URL = "https://account.mojang.com/register?agent=minecraft";
	private static final CharSequence FIRST_NAME = "anca";
	private static final String LAST_NAME = "maria";
	private static final String PASSWORD = "parola2341";
	private static final String QUESTION1 = "What is your favorite ice cream flavor?";
	private static final String QUESTION2 = "Where did you go on your first holiday?";
	private static final String QUESTION3 = "What is your dream job?";
	private static final String DAY = "8";
	private static final String MONTH = "April";
	private static final String YEAR = "1990";

	/**
	 * This is a test method that verifies the register option for an account on
	 * Mojing.com, using Chrome Browser account. It completes all necessary
	 * fields and create a new account for a random password
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void test21Register() {

		driver.get(BBY_URL);
		RandomEmail randomEmail = new RandomEmail();
		new PageFactory();
		final RegistrationPage registrationPage = PageFactory.initElements(
				driver, RegistrationPage.class);

		registrationPage.emailInput.sendKeys(randomEmail.generateRandomEmail());
		registrationPage.password.sendKeys(PASSWORD);
		registrationPage.confirmPassword.sendKeys(PASSWORD);
		registrationPage.firstNameInput.sendKeys(FIRST_NAME);
		registrationPage.secondNameInput.sendKeys(LAST_NAME);

		WebElement day = driver.findElement(By.name("registration.day"));
		List<WebElement> d = day.findElements(By.tagName("option"));
		for (WebElement webElement1 : d) {
			if (webElement1.getText().equals(DAY)) {
				webElement1.click();
			}
		}

		WebElement month = driver.findElement(By.name("registration.month"));
		List<WebElement> m = month.findElements(By.tagName("option"));
		for (WebElement webElement2 : m) {
			if (webElement2.getText().equals(MONTH)) {
				webElement2.click();
			}
		}

		WebElement year = driver.findElement(By.name("registration.year"));
		List<WebElement> y = year.findElements(By.tagName("option"));
		for (WebElement webElement3 : y) {
			if (webElement3.getText().equals(YEAR)) {
				webElement3.click();
			}
		}

		WebElement question1 = driver.findElement(By
				.name("registration.question0"));
		List<WebElement> q1 = question1.findElements(By.tagName("option"));
		for (WebElement webElement4 : q1) {
			if (webElement4.getText().equals(QUESTION1)) {
				webElement4.click();
			}
		}

		registrationPage.answerQuestion1.sendKeys("vanilie");

		WebElement question2 = driver.findElement(By
				.name("registration.question1"));
		List<WebElement> q2 = question2.findElements(By.tagName("option"));
		for (WebElement webElement5 : q2) {
			if (webElement5.getText().equals(QUESTION2)) {
				webElement5.click();
			}
		}

		registrationPage.answerQuestion2.sendKeys("Paris");

		WebElement question3 = driver.findElement(By
				.name("registration.question2"));
		List<WebElement> q3 = question3.findElements(By.tagName("option"));
		for (WebElement webElement6 : q3) {
			if (webElement6.getText().equals(QUESTION3)) {
				webElement6.click();
			}
		}

		registrationPage.answerQuestion3.sendKeys("Pictor");
		registrationPage.acceptButton.click();
		registrationPage.acceptButton.submit();

	}
}
