import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.BrowserSettings;
import util.RandomEmail;
import util.RegistrationPage;

/**
 * TestRegister class implements testRegister() method
 * 
 * @author rcocismuresan
 * @version 1.0
 */
public class TestRegister extends BrowserSettings {

	private static final String PASSWORD = "abc1123A";
	private static final String PAGE_URL = "http://www.authentichappiness.sas.upenn.edu/register.aspx";
	private static final String NR_TELEFON = "0722345678";
	private static final String FNAME = "Raul";
	private static final String LNAME = "Cocis";
	private static final String SEC_ANSWER = "HaiPa";

	/**
	 * testRegister() method realize the registration to site
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testRegister() throws InterruptedException {

		driver.get(PAGE_URL);
		new PageFactory();
		final RegistrationPage registrationPage = PageFactory.initElements(
				driver, RegistrationPage.class);
		registrationPage.firstName.sendKeys(FNAME);
		registrationPage.lastName.sendKeys(LNAME);
		RandomEmail randomEmail = new RandomEmail();
		registrationPage.emailInput.sendKeys(randomEmail.generateRandomEmail());
		registrationPage.password.sendKeys(PASSWORD);
		registrationPage.repassword.sendKeys(PASSWORD);
		WebElement testElement = driver.findElement(By
				.id("registerControl_selSecurityQuestions"));
		Select clickThis = new Select(testElement);
		clickThis.selectByVisibleText("High School Mascot?");
		driver.findElement(By.id("registerControl_txtSecurityAnswer"))
				.sendKeys("HaiPa");
		WebElement testElement2 = driver.findElement(By
				.id("registerControl_selDOB_Day"));
		List<WebElement> options = testElement2.findElements(By
				.tagName("option"));
		for (WebElement webElement : options) {
			if (webElement.getText().equals("7")) {
				webElement.click();
			}
		}
		WebElement testElement3 = driver.findElement(By
				.id("registerControl_selDOB_Month"));
		List<WebElement> options2 = testElement3.findElements(By
				.tagName("option"));
		for (WebElement webElement2 : options2) {
			if (webElement2.getText().equals("Feb")) {
				webElement2.click();
			}
		}

		WebElement testElement4 = driver.findElement(By
				.id("registerControl_selDOB_Year"));
		List<WebElement> options3 = testElement4.findElements(By
				.tagName("option"));
		for (WebElement webElement3 : options3) {
			if (webElement3.getText().equals("1907")) {
				webElement3.click();
			}
		}

		registrationPage.chkboxMale.click();

		WebElement testElement5 = driver.findElement(By
				.id("registerControl_selOccupation"));
		List<WebElement> options4 = testElement5.findElements(By
				.tagName("option"));
		for (WebElement webElement4 : options4) {
			if (webElement4.getText().equals("Actor")) {
				webElement4.click();
			}
		}

		WebElement testElement6 = driver.findElement(By
				.id("registerControl_selEducation"));
		List<WebElement> options5 = testElement6.findElements(By
				.tagName("option"));
		for (WebElement webElement5 : options5) {
			if (webElement5.getText().equals("Some college")) {
				webElement5.click();
			}
		}

		registrationPage.zipCode.sendKeys("4056790");
		WebElement testElement7 = driver.findElement(By
				.id("registerControl_selCountry"));
		List<WebElement> options6 = testElement7.findElements(By
				.tagName("option"));
		for (WebElement webElement6 : options6) {
			if (webElement6.getText().equals("Romania")) {
				webElement6.click();
			}
		}
		registrationPage.termsChkbox.click();
		registrationPage.submitButton.click();
		Thread.sleep(4000);

	}

}
