package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class BrowserSettings sets the desired browser
 * 
 * @author fionce
 * 
 */
public class BrowserSettings {
	protected WebDriver driver;

	/**
	 * This method sets the driver Firefox Browser. It uses the Firefox driver
	 * from src/test/resources
	 */
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}

	/**
	 * This method is executed after the running of the test and shuts the
	 * browser
	 */
	@After
	public void tearDown() {
		driver.quit();
	}
}
