package testLogin;
/**
 * @author Nina
 * this class calls testLogin() method using InternetExplorer browser
 */
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

import util.IEBrowser;

public class TestLoginWithIE extends IEBrowser{

	private static final String AUTHENTIC_URL = "http://www.authentichappiness.sas.upenn.edu/register.aspx";

	/**
	 * @method verify log in functionality with valid credentials
	 */
	@Test
	public void testLogin(){
		
		driver.get(AUTHENTIC_URL);
		driver.findElement(By.id("Header1_LoginControl_txtUser")).sendKeys("aaaa@aaa10672.com");
		driver.findElement(By.id("Header1_LoginControl_txtPassword")).sendKeys("abc123");
		driver.findElement(By.id("Header1_LoginControl_btLogin")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("Header1_LoginControl_btLogout")).click();;
		
	}
}
