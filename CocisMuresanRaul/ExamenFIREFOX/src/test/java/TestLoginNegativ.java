import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSettings;
import util.LoginPage;

public class TestLoginNegativ extends BrowserSettings {

	public static final String USER = "raul@yahoo.com";
	public static final String PASS = "123456";
	private static final String PAGE_URL = "http://www.authentichappiness.sas.upenn.edu/register.aspx";

	/**
	 * loginNegativ() realize login to site with invalid credentials
	 */
	@Test
	public void loginNegativ() {

		driver.get(PAGE_URL);
		new PageFactory();
		final LoginPage loginPage = PageFactory.initElements(driver,
				LoginPage.class);
		loginPage.userName.sendKeys(USER);
		loginPage.pass.sendKeys(PASS);
		loginPage.submit.click();
		Assert.assertTrue(driver.findElement(By.id("Header1_LoginControl_lblMessage")).getText().equals("Error with username or password"));
		
		
	}

}
