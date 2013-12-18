package authentic.happiness;
/**
 * This class implements the testRegister method that uses MozillaFirefox browser
 */
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.FirefoxSettings;
import util.RandomEmail;
import util.RegistrationPage;

public class RegisterFirefox extends FirefoxSettings {
	private static final String MOJAN_URL = "https://account.mojang.com/register";
	private static final CharSequence password = "pass1234";
	private static final CharSequence name = "Popescu";
	private static final CharSequence name2 = "Ioana";
	private static final String QUESTION0 = "What is your favorite restaurant?";
	private static final String QUESTION1 = "What is your favorite activity?";
	private static final String QUESTION2 = "What is your favorite ice cream flavor?";
	private static final CharSequence answer0 = "Grand Hotel Italia";
	private static final CharSequence answer1 = "Dance";
	private static final CharSequence answer2 = "Melon";
	private static final Object Dday = "23";
	private static final Object Mmonth = "March";
	private static final Object Yyear = "1991";
	
	/**
	 * This is a test method that verifies the register option for an account on mojang.com, using the MozillaFirefox browser 
	 * It completes all necessary fields and create a new account for a random password
	 */
	@Test
	public void testRegister1() {
		driver.get(MOJAN_URL);
		RandomEmail randomEmail = new RandomEmail();
		new PageFactory();
		final RegistrationPage registrationPage = PageFactory.initElements(
				driver, RegistrationPage.class);

		registrationPage.emailInput.sendKeys(randomEmail.generateRandomEmail());
		registrationPage.password.sendKeys(password);
		registrationPage.confirmPassword.sendKeys(password);
		registrationPage.firstName.sendKeys(name);
		registrationPage.lastName.sendKeys(name2);
		
		WebElement day = driver.findElement(By.name("registration.day"));
		List<WebElement> d = day.findElements(By.tagName("option"));
		for (WebElement webElement : d) {
			if (webElement.getText().equals(Dday)) {
				webElement.click();
			}
		}
		
		WebElement month=driver.findElement(By.name("registration.month"));
	    List<WebElement> m=month.findElements(By.tagName("option"));
	    for (WebElement webElement : m) {
			if(webElement.getText().equals(Mmonth)){
				webElement.click();
			}
		}
	    
	    WebElement year=driver.findElement(By.name("registration.year"));
	    List<WebElement> y=year.findElements(By.tagName("option"));
	    for (WebElement webElement : y) {
			if(webElement.getText().equals(Yyear)){
				webElement.click();
			}
		}
	    
	    WebElement question0=driver.findElement(By.name("registration.question0"));
	    List<WebElement> q0=question0.findElements(By.tagName("option"));
	    for (WebElement webElement : q0) {
			if(webElement.getText().equals(QUESTION0)){
				webElement.click();
			}
		}
	    registrationPage.answer0.sendKeys(answer0);

	    WebElement question1=driver.findElement(By.name("registration.question1"));
	    List<WebElement> q1=question1.findElements(By.tagName("option"));
	    for (WebElement webElement : q1) {
			if(webElement.getText().equals(QUESTION1)){
				webElement.click();
			}
		}
		registrationPage.answer1.sendKeys(answer1);
			    
	    WebElement question2=driver.findElement(By.name("registration.question2"));
	    List<WebElement> q2=question2.findElements(By.tagName("option"));
	    for (WebElement webElement : q2) {
			if(webElement.getText().equals(QUESTION2)){
				webElement.click();
			}
		}
		registrationPage.answer2.sendKeys(answer2);

		
		registrationPage.accept.click();
		registrationPage.register.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Verifica mesaj", registrationPage.textMessage
				.getText().toLowerCase().contains("Mojang"), false);

	}
}
