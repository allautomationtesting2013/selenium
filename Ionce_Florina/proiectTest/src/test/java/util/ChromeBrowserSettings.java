package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class BrowserSettings sets the desired browser
 * 
 * @author fionce
 * 
 */
public class ChromeBrowserSettings {
	protected WebDriver driver;

	/**
	 * This method sets the driver Chrome Browser. It uses the Chrome driver
	 * from src/test/resources
	 */
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
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
