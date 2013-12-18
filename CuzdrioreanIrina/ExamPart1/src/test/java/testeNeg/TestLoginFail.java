package testeNeg;
/**
 * @author Nina
 * the class calls testLoginFail() method
 * @param the page URL and credentials
 */
import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.FirefoxBrowser;
import util.LoginPage;

public class TestLoginFail extends FirefoxBrowser{
	
	private static final String AUTHENTIC_URL = "http://www.authentichappiness.sas.upenn.edu/register.aspx";
	private static final CharSequence EMAIL = "aaaa@aaa10672.com";
	private static final CharSequence PASSWORD = "abc1234";

/**
 * @method this method verifies the log in functionality with wrong password
 * @throws InterruptedException
 */
	@Test
	public void testLoginFail() throws InterruptedException{
		
		driver.get(AUTHENTIC_URL);
		new PageFactory();
		final LoginPage loginPage = PageFactory.initElements(driver,
				LoginPage.class);
		
		loginPage.email.sendKeys(EMAIL);
		loginPage.password.sendKeys(PASSWORD);
		loginPage.loginButton.click();
		Thread.sleep(5000);
		Assert.assertTrue(driver
				.findElement(By.xpath("//*[@id='Header1_LoginControl_lblMessage']"))
				.getText()
				.equals("Error with username or password"));
	}
}
