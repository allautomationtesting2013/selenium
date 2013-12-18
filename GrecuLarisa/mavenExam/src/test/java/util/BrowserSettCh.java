package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * 
 * @author larisa
 * this class sets the Chrome browser used to perform the tests
 * containes two methods that will be executed even if the tests fail 
 */
public class BrowserSettCh {
	
	protected WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
		
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
}
