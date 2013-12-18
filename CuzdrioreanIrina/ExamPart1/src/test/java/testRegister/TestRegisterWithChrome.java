package testRegister;
/**
 * @author Nina
 * this class calls testRegister() method
 * @param first_name, last_name, password, URL, answer, postal_code
 */
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.ChromeBrowser;
import util.RandomEmail;
import util.RegistrationPage;

public class TestRegisterWithChrome extends ChromeBrowser{
	
	private static final String FIRST_NAME = "abc";
	private static final CharSequence LAST_NAME = "def";
	private static final CharSequence PASSWORD = "abc123";
	private static final String AUTHENTIC_URL = "http://www.authentichappiness.sas.upenn.edu/register.aspx";
	private static final CharSequence ANSWER = "Lola";
	private static final CharSequence POSTAL_CODE = "400434";
	
/**
 * @method verify registration functionality
 */
	@Test
	public void testRegister() {

		driver.get(AUTHENTIC_URL);
		RandomEmail randomEmail = new RandomEmail();
		new PageFactory();
		final RegistrationPage registrationPage = PageFactory.initElements(driver,
				RegistrationPage.class);
		
		registrationPage.firstNameInput.sendKeys(FIRST_NAME);
		registrationPage.lastNameInput.sendKeys(LAST_NAME);
		registrationPage.emailInput.sendKeys(randomEmail.generateRandomEmail());
		//registrationPage.policy.click();
		registrationPage.password.sendKeys(PASSWORD);
		registrationPage.confirmPassword.sendKeys(PASSWORD);
		
		List<WebElement> options = registrationPage.securityQuestions.findElements(By.tagName("option"));
		for (WebElement opt : options) {
			if(opt.getText().equals("Dog's Name?")){
				opt.click();
				break;
			}
		}
		
		registrationPage.securityAnswer.sendKeys(ANSWER);
		
		List<WebElement> days = registrationPage.selectDay.findElements(By.tagName("option"));
		for (WebElement opt : days) {
			if(opt.getText().equals("13")){
				opt.click();
				break;
			}
		}
		
		List<WebElement> months = registrationPage.selectMonth.findElements(By.tagName("option"));
		for (WebElement opt : months) {
			if(opt.getText().equals("Jul")){
				opt.click();
				break;
			}
		}
		
		List<WebElement> years = registrationPage.selectYear.findElements(By.tagName("option"));
		for (WebElement opt : years) {
			if(opt.getText().equals("1991")){
				opt.click();
				break;
			}
		}
		
		registrationPage.selectGenderF.click();
		
		List<WebElement> jobs = registrationPage.occupation.findElements(By.tagName("option"));
		for (WebElement opt : jobs) {
			if(opt.getText().equals("Technician")){
				opt.click();
				break;
			}
		}
		
		List<WebElement> studies = registrationPage.educationLevel.findElements(By.tagName("option"));
		for (WebElement opt : studies) {
			if(opt.getText().equals("Bachelors degree")){
				opt.click();
				break;
			}
		}
		
		registrationPage.postalCode.sendKeys(POSTAL_CODE);
		
		List<WebElement> countries = registrationPage.country.findElements(By.tagName("option"));
		for (WebElement opt : countries) {
			if(opt.getText().equals("Romania")){
				opt.click();
				break;
			}
		}
		
		registrationPage.terms.click();
		registrationPage.registerButton.click();

	}
}
