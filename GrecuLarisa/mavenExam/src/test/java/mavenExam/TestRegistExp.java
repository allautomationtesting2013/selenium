package mavenExam;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import util.BrowserSettExp;
import util.PageReg;
import util.RandomEmail;

public class TestRegistExp extends BrowserSettExp{

	
	private static final String FIRST_NAME = "koko";
	private static final CharSequence LAST_NAME = "koko";
	private static final CharSequence PASSWORD = "abc11gh";
	private static final CharSequence CONFIRM_PASSWORD = "abc11gh";
	private static final CharSequence POSTAL_CODE="400590";
	public static final String AUTHENTIC_URL = "http://www.authentichappiness.sas.upenn.edu/register.aspx";
	


	@Test
	public void testRegistExp() {
		
		driver.get(AUTHENTIC_URL);
		RandomEmail randomEmail = new RandomEmail();
		new PageFactory();
		final PageReg registrationPage = PageFactory.initElements(driver,
				PageReg.class);
		registrationPage.firstNameInput.sendKeys(FIRST_NAME);
		registrationPage.lastNameInput.sendKeys(LAST_NAME);
		registrationPage.emailInput.sendKeys(randomEmail.generateRandomEmail());
		registrationPage.password.sendKeys(PASSWORD);
		registrationPage.confirmPassword.sendKeys(CONFIRM_PASSWORD);
		
		WebElement dropDownListBox = driver.findElement(By
				.id("registerControl_selSecurityQuestions"));
		
		

		Select clickThis = new Select(dropDownListBox);

		clickThis.selectByVisibleText("Father's Middle Name?");
	
		
		driver.findElement(By.id("registerControl_txtSecurityAnswer")).sendKeys("Mihai");
		
		WebElement dropDownListBox2 = driver.findElement(By.id("registerControl_selDOB_Day"));
		Select clickThis1 = new Select(dropDownListBox2);
		clickThis1.selectByValue("3");
		
		WebElement dropDownListBox3 = driver.findElement(By.id("registerControl_selDOB_Month"));
		Select clickThis3 = new Select(dropDownListBox3);
		clickThis3.selectByVisibleText("Jan");

		
		WebElement dropDownListBox4 = driver.findElement(By.id("registerControl_selDOB_Year"));
		Select clickThis4 = new Select(dropDownListBox4);
		clickThis4.selectByVisibleText("2000");
		
		driver.findElement(By.id("registerControl_optGender_Female")).click();
		
		WebElement dropDownListBox5 = driver.findElement(By
				.id("registerControl_selOccupation"));
		
		

		Select clickThis5 = new Select(dropDownListBox5);

		clickThis5.selectByVisibleText("Actor");
		
		WebElement dropDownListBox6 = driver.findElement(By
				.id("registerControl_selEducation"));
		
		
		Select clickThis6 = new Select(dropDownListBox6);

		clickThis6.selectByVisibleText("Bachelors degree");
		
		registrationPage.postalInput.sendKeys(POSTAL_CODE);
		
		WebElement dropDownListBox7 = driver.findElement(By
				.id("registerControl_selCountry"));
		
		
		Select clickThis7 = new Select(dropDownListBox7);

		clickThis7.selectByVisibleText("Romania");
		
		driver.findElement(By.id("registerControl_ckbxTerms")).click();
		registrationPage.submitButton.click();
	}
	
}
