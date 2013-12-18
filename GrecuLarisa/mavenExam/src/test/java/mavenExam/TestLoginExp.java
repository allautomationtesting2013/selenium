package mavenExam;
import java.util.ResourceBundle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestLoginExp {

	private WebDriver driver;
	//ResourceBundle bundle = ResourceBundle.getBundle("value");
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.ie.driver",
				"./src/test/resources/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://www.authentichappiness.sas.upenn.edu/Default.aspx");

		
}
	@Test
	public void testLoginExp() throws Exception {
	
		//String email = bundle.getString("usern");
		//String password = bundle.getString("passw");

		driver.findElement(By.id("Header1_LoginControl_txtUser")).sendKeys("bbt@bbt.com");
		driver.findElement(By.id("Header1_LoginControl_txtPassword")).sendKeys("1234567");
		driver.findElement(By.id("Header1_LoginControl_btLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Header1_LoginControl_btLogout")).click();
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
	
}
