package util;

/**
 * This class sets the desired browser
 */

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettings {

	protected WebDriver driver;

	/**
	 * This method sets the driver for Chrome browser 
	 * It uses the chrome driver
	 * from src/test/resources/
	 */
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	/**
	 * This method is executed after the running of the test and shuts down the
	 * browser
	 */
	@After
	public void tearDown() {
		driver.quit();
	}
}
