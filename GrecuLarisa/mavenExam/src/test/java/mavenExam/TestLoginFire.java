package mavenExam;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * 
 * @author larisa
 * the class calls the method 'testLoginFire'
 * @parameters: WebDriver object
 * 
 *
 */

public class TestLoginFire {
	
	private WebDriver driver;
	//ResourceBundle bundle = ResourceBundle.getBundle("value");
	
	@Before
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
		driver.get("http://www.authentichappiness.sas.upenn.edu/Default.aspx");
		
}
	
	/**
	 * the method logs a user in to his account using valid credentials and Firefox Driver
	 * @throws Exception
	 */
	
	@Test
	public void testLoginFire() throws Exception {
		
		//String email = bundle.getString("usern");
		//String password = bundle.getString("passw");

		driver.findElement(By.id("Header1_LoginControl_txtUser")).sendKeys("bbt@bbt.com");
		driver.findElement(By.id("Header1_LoginControl_txtPassword")).sendKeys("1234567");
		driver.findElement(By.id("Header1_LoginControl_btLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Header1_LoginControl_btLogout")).click();
	}
	
	/**
	 * the method close the browser after the last action is performed
	 * @throws Exception
	 */
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
}
