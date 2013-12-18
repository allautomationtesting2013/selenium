package mavenExam;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSettCh;


/**
 *
 * @author larisa
 *  the class  calls the method 'loginFailCh'
 * @parameters: three constants for URL and user's credentials
 *
 */

public class LoginFailCh extends BrowserSettCh{
	
	private static final String URL = "http://www.authentichappiness.sas.upenn.edu/Default.aspx";
	private static final CharSequence EMAIL = "ioana@ioana.com";
	private static final CharSequence PASSWORD = "311289";

	
	/**
	 * the method tests is a proper error message is displayed if the user tries to use invalid credentials
	 * @throws InterruptedException
	 */
	
	@Test
	public void loginFailCh() throws InterruptedException{
		driver.get(URL);
		new PageFactory();
		driver.findElement(By.id("Header1_LoginControl_txtUser")).sendKeys(EMAIL);
		driver.findElement(By.id("Header1_LoginControl_txtPassword")).sendKeys(PASSWORD);
		driver.findElement(By.id("Header1_LoginControl_btLogin")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.id("Header1_LoginControl_lblMessage")).getText().equals("Error with username or password"));
	}
	

	
}
