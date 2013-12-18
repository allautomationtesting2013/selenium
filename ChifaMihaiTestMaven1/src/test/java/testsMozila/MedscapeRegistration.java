package testsMozila;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSetup;
import util.MedscapeRegistrationCredentials;
import util.RandomEmail;
import util.RandomUserName;

public class MedscapeRegistration extends BrowserSetup {

	private static final String F_NAME = "Ana";
	private static final String L_NAME = "Pop";
	private static final CharSequence ZIP = "21842";

	private static final CharSequence PASSWORD = "pas123";
	private static final CharSequence HINT_ANSWER = "Andra";
	private static final Object COUNTRY_NAME = "United States";
	private static final Object HINT_QUESTION = "In which city was your mother born?";
	private static final Object PROFESSION = "Media/Press";

	@Test
	public void medscapeRegisterTest() throws InterruptedException {

		FirefoxBrowser();

		driver.get("https://profreg.medscape.com/px/registration.do");

		RandomEmail remail = new RandomEmail();
		String email = remail.EmailGenerator();

		RandomUserName run = new RandomUserName();
		String userName = run.userNameGenerator(F_NAME, L_NAME);

		new PageFactory();
		final MedscapeRegistrationCredentials re = PageFactory.initElements(
				driver, MedscapeRegistrationCredentials.class);
		WebElement countryName = driver.findElement(By.name("country"));
		List<WebElement> wl = countryName.findElements(By.tagName("option"));
		for (WebElement webElement : wl) {
			if (webElement.getText().equals(COUNTRY_NAME)) {
				webElement.click();
				break;
			}
		}

		re.firstName.sendKeys(F_NAME);
		re.lastName.sendKeys(L_NAME);
		re.zipCode.sendKeys(ZIP);
		re.email.sendKeys(email);
		re.emailConfirm.sendKeys(email);
		re.username.sendKeys(userName);
		re.password.sendKeys(PASSWORD);
		re.passwordConfirm.sendKeys(PASSWORD);

		WebElement securityQuestion = driver.findElement(By
				.name("hintQuestion"));
		List<WebElement> we = securityQuestion.findElements(By
				.tagName("option"));
		for (WebElement webElement : we) {
			if (webElement.getText().equals(HINT_QUESTION)) {
				webElement.click();
				break;
			}
		}

		re.hintanswer.sendKeys(HINT_ANSWER);

		WebElement profession = driver.findElement(By.name("profession"));
		List<WebElement> we1 = profession.findElements(By.tagName("option"));
		for (WebElement webElement : we1) {
			if (webElement.getText().equals(PROFESSION)) {
				webElement.click();
				break;
			}
		}
		//Thread.sleep(10000);
		re.submitr.click();

	}
}
